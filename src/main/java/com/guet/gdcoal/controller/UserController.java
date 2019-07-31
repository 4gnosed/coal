package com.guet.gdcoal.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;
import com.guet.gdcoal.service.CompanyService;
import com.guet.gdcoal.service.UserService;

@Controller
public class UserController {
	/**
	 * 使用@Autowired也可以，@Autowired默认按类型装配
	 * 
	 * @Resource 默认按名称装配，当找不到与名称匹配的bean才会按类型装配。
	 */
	@Autowired
	private UserService userService;

	@Autowired
	private CompanyService companyService;

	/**
	 * 测试查询
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/showUser")
	public String getUserById(@RequestParam(value = "id") Integer id, Model model) {
		System.out.println("id值：" + id);
		User user = userService.getUserById(id);
		System.out.println("user:" + user);
		model.addAttribute("user", user);
		return "showUser";
	}

	/**
	 * 登录验证2,通过用户名密码登录
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("") || password.equals("")) {
			model.addAttribute("msg", "用户名或密码为空，请重试……");
			model.addAttribute("msg1", username);
		} else {
			User user = userService.login(username, password);
			if (user != null) {
				HttpSession session = request.getSession();
				// 保存至session
				String sessionId = session.getId();
				Cookie cookie = new Cookie("sessionId", sessionId);

				// 用cookie保存用户session的id
				cookie.setMaxAge(60 * 2);
				cookie.setPath(request.getContextPath() + "/");
				response.addCookie(cookie);

				session.setAttribute("sessionuser", user);

				// 视图解析
				model.addAttribute("user", user);
				System.out.println("登录成功：" + user);
				return "jsp/index";
			} else {
				model.addAttribute("msg", "用户名或密码错误，请重试……");
				model.addAttribute("msg1", username);
				System.out.println("登录失败：" + user);
			}
		}
		return "jsp/login";
	}

	/**
	 * 退出登录
	 * 
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/logout")
	public String logOut(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("sessionuser");
		session.invalidate();

		String msg = request.getParameter("msg");
		msg = new String(msg.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(msg + " " + user.toString());
		return "jsp/index_new";
	}

	/**
	 * 修改用户密码
	 */
	@RequestMapping("/alterPassword")
	public String alterPasswordByUserId(@RequestParam("userid") Integer userId,
			@RequestParam("oldpassword") String oldPassword, @RequestParam("password") String password,
			@RequestParam("passwordagain") String passwordAgain, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		// System.out.println(userId+" "+oldPassword+" "+password+"
		// "+passwordAgain);

		// 两次输入新密码是否一致
		if (!password.equals(passwordAgain)) {
			model.addAttribute("msg", "新密码两次输入不一致！");
		} else {
			// 根据用户id，验证旧密码是否正确
			String passwordGet = userService.getPasswordByUserId(userId);
			System.out.println("用户" + userId + "返回密码：" + passwordGet);
			// 是，但是新旧密码相同
			if (passwordGet.equals(oldPassword) && passwordGet.equals(password)) {
				model.addAttribute("msg", "旧密码输入不能相同！");
				// 是，新旧密码不同，更新密码
			} else if (passwordGet.equals(oldPassword)) {
				int i = userService.updatePasswordByUserId(userId, password);
				if (i == 1) {
					model.addAttribute("msg", "密码修改成功！");
					// 更新当前用户session信息，防止页面中用户信息没有改变
					HttpSession session = request.getSession();

//					// 干掉session
//					session.invalidate();

					String sessionId = session.getId();

					// 用cookie保存用户session的id
					Cookie cookie = new Cookie("sessionId", sessionId);
					cookie.setMaxAge(60 * 2);
					cookie.setPath(request.getContextPath() + "/");
					response.addCookie(cookie);

					// 获取更新后的用户，加入到session域中
					User updatedUser = userService.getUserById(userId);
					session.setAttribute("sessionuser", updatedUser);
				}

				return "jsp/index";
				// 否，提示错误信息
			} else {
				model.addAttribute("msg", "旧密码输入不正确！");
			}
		}
		return "jsp/user/alterPassword";
	}

	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request) {
		User user = new User();
		user.setUserName(request.getParameter("username"));
		user.setUserPassword(request.getParameter("password"));
		user.setUserEnName(request.getParameter("enname"));
		user.setUserPhone(request.getParameter("phone"));
		user.setUserAddress(request.getParameter("address"));
		user.setUserEmail(request.getParameter("email"));
		user.setCompanyId(Integer.parseInt(request.getParameter("company")));
		user.setRoleId(Integer.parseInt(request.getParameter("role")));
		// System.out.println(user);
		int i = userService.addUser(user);
		return "jsp/index";
	}

	/**
	 * 用户管理，获取所有用户,也获取所有公司用来与用户对应
	 */
	@RequestMapping("/accountManage")
	public String accountManage(Model model) {
		List<User> users = userService.getAllUser();
		model.addAttribute("users", users);

		List<Company> companies = companyService.findAllCompany();
		model.addAttribute("companies", companies);

		return "jsp/user/accountManage";
	}

	/**
	 * 修改用户,根据id获取用户
	 */
	@RequestMapping("/alterUserGetUser")
	public String alterUserByUserId(@RequestParam("userid") Integer userId, Model model) {
		User user = userService.getUserById(userId);
		System.out.println("user:" + user);
		model.addAttribute("user", user);

		List<Company> companies = companyService.findAllCompany();
		model.addAttribute("companies", companies);
		return "jsp/user/alterMan";
	}

	/**
	 * 更新用户
	 */
	@RequestMapping("/alterUser")
	public String alterUserByUserId(HttpServletRequest request, Model model) {

		User user = new User();

		user.setUserId(Integer.parseInt(request.getParameter("userid")));
		user.setUserName(request.getParameter("username"));
		user.setUserPassword(request.getParameter("password"));
		user.setUserEnName(request.getParameter("enname"));
		user.setUserPhone(request.getParameter("phone"));
		user.setUserAddress(request.getParameter("address"));
		user.setUserEmail(request.getParameter("email"));
		// user.setCompanyId(Integer.parseInt(request.getParameter("company")));
		// user.setRoleId(Integer.parseInt(request.getParameter("role")));

		System.out.println(user);

		int i = userService.alterUser(user);
		if (i == 1) {
			System.out.println("成功更新用户" + user);
		}

		List<User> users = userService.getAllUser();
		model.addAttribute("users", users);

		return "jsp/user/accountManage";
	}

	/**
	 * 删除用户
	 */
	@RequestMapping("/deleteUser")
	public String deleteUserByUserId(@RequestParam("userid") Integer userId, Model model) {
		int i = userService.deleteUserByUserId(userId);
		if (i == 1) {
			System.out.println("成功删除用户" + userId);
		}
		List<User> users = userService.getAllUser();
		model.addAttribute("users", users);
		return "jsp/user/accountManage";
	}
}
