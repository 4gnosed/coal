package com.guet.gdcoal.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.guet.gdcoal.model.CheckedInfo;
import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.Purchase;
import com.guet.gdcoal.model.User;
import com.guet.gdcoal.service.CheckedInfoService;
import com.guet.gdcoal.service.CompanyService;
import com.guet.gdcoal.service.PurchaseService;
import com.guet.gdcoal.service.UserService;
import com.guet.gdcoal.utils.CurrentTimeUtil;
import com.guet.gdcoal.utils.PurchaseSortUtil;

@Controller
public class PurchaseController {

	@Autowired
	private UserService userService;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private PurchaseService purchaseService;

	@Autowired
	private CheckedInfoService checkedInfoService;

	/**
	 * 进入采购申请之前，获取用户对应的公司名,并给出格式化单据编号（公司名+日期+时间）
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/findCompanyAfterAddBuy")
	public String findCompanyAfterAddBuy(@RequestParam("companyid") Integer companyId, Model model) {
		Company company = companyService.findUserCompany(companyId);
		model.addAttribute("company", company);

		model.addAttribute("fnumber", CurrentTimeUtil.getPurchaseNumber(company.getCompanyName()));
		return "jsp/buy/addBuy";
	}

	/**
	 * 添加申请采购记录
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/addBuy")
	public String addPurchase(HttpServletRequest request, Model model) {
		Integer userId = Integer.parseInt(request.getParameter("userid"));
		Integer companyId = Integer.parseInt(request.getParameter("companyid"));
		String submitType = request.getParameter("submittype");
		// System.out.println( userId+" "+companyId+" "+submitType);

		Purchase purchase = new Purchase();

		purchase.setUserId(userId);
		purchase.setCompanyId(companyId);
		purchase.setDocNumber(request.getParameter("purnumber"));

		purchase.setCreateDate(CurrentTimeUtil.getCurrentTime());
		purchase.setDeadLine(request.getParameter("purdeadline"));
		purchase.setDeliTimeMin(request.getParameter("purdelitimemin"));
		purchase.setDeliTimeMax(request.getParameter("purdelitimemax"));

		purchase.setCoal1Id(Integer.parseInt(request.getParameter("purcoal1")));
		purchase.setCoal2Id(Integer.parseInt(request.getParameter("purcoal2")));
		purchase.setQuantity(Integer.parseInt(request.getParameter("purquantity")));
		purchase.setTransId(Integer.parseInt(request.getParameter("purtrans")));

		purchase.setDeliPlace(request.getParameter("purdeliplace"));
		purchase.setCashId(Integer.parseInt(request.getParameter("purcash")));
		purchase.setCheckId(Integer.parseInt(request.getParameter("purcheck")));
		purchase.setPriceCeiling(Float.parseFloat(request.getParameter("purpriceceiling")));

		purchase.setPriceBottom(Float.parseFloat(request.getParameter("purpricebottom")));
		purchase.setPriceStatement(request.getParameter("purpricestatement"));
		purchase.setPayType(request.getParameter("purpaytype"));
		purchase.setAppPromise(Float.parseFloat(request.getParameter("puapppromis")));

		purchase.setPricePromise(Float.parseFloat(request.getParameter("purpricepromise")));
		purchase.setReceQnet(Float.parseFloat(request.getParameter("purreceqnet")));
		purchase.setReceSt(Float.parseFloat(request.getParameter("purrecest")));
		purchase.setReceM(Float.parseFloat(request.getParameter("purrecem")));

		purchase.setReceAar(Float.parseFloat(request.getParameter("purreceaar")));
		purchase.setReceVarMin(Float.parseFloat(request.getParameter("purrecevarmin")));
		purchase.setReceVarMax(Float.parseFloat(request.getParameter("purrecevarmax")));
		purchase.setAirMad(Float.parseFloat(request.getParameter("purairmad")));

		purchase.setAirSt(Float.parseFloat(request.getParameter("purairst")));
		purchase.setAirVadMin(Float.parseFloat(request.getParameter("purairmin")));
		purchase.setAirVadMax(Float.parseFloat(request.getParameter("purairmax")));
		purchase.setDriedQgr(Float.parseFloat(request.getParameter("purdriedqgr")));

		purchase.setDriedSt(Float.parseFloat(request.getParameter("purdriedst")));
		purchase.setDriedVadMin(Float.parseFloat(request.getParameter("purdriedmin")));
		purchase.setDriedVadMax(Float.parseFloat(request.getParameter("purdriedmax")));
		purchase.setParticleSize(Float.parseFloat(request.getParameter("purparaticlesize")));

		purchase.setST(Float.parseFloat(request.getParameter("purst")));
		purchase.setHGI(Float.parseFloat(request.getParameter("purhgi")));
		purchase.setRemark(request.getParameter("purremak"));

		if (submitType.equals("保存")) {
			purchase.setStatement("草稿");
		} else if (submitType.equals("提交")) {
			purchase.setStatement("待审核");
		}
		// System.out.println(purchase);

		int i = purchaseService.addPurchase(purchase);
		if (i == 1) {
			System.out.println(purchase.getDocNumber() + " 采购记录添加成功");
		}

		// 查询权限内的所有采购记录，返回到记录列表
		ArrayList<Purchase> purchases = purchaseService.getPurchasesByUserId(userId);
		// 按创建时间逆序排列
		purchases = PurchaseSortUtil.sortByCreateDate(purchases);
		model.addAttribute("purchases", purchases);

		return "jsp/buy/userBuyList";
	}

	/**
	 * 根据id查找一条采购记录
	 * 
	 * @param purchaseId
	 * @return
	 */
	@RequestMapping("/queryPurchaseById")
	public String queryPurchaseById(@RequestParam("purchaseid") Integer purchaseId, Model model) {
		Purchase purchase = purchaseService.queryPurchaseById(purchaseId);
		System.out.println(purchase);
		model.addAttribute("purchase", purchase);
		return "jsp/buy/alterBuy";
	}

	/**
	 * 修改或者提交采购记录,用户id，公司id不用修改
	 */
	@RequestMapping("/alterOrSubmitBuy")
	public String updatePurchase(HttpServletRequest request) {

		Purchase purchase = new Purchase();
		purchase.setUserId(Integer.parseInt(request.getParameter("purid")));

		purchase.setCreateDate(CurrentTimeUtil.getCurrentTime());
		purchase.setDeadLine(request.getParameter("purdeadline"));
		purchase.setDeliTimeMin(request.getParameter("purdelitimemin"));
		purchase.setDeliTimeMax(request.getParameter("purdelitimemax"));

		purchase.setCoal1Id(Integer.parseInt(request.getParameter("purcoal1")));
		purchase.setCoal2Id(Integer.parseInt(request.getParameter("purcoal2")));
		purchase.setQuantity(Integer.parseInt(request.getParameter("purquantity")));
		purchase.setTransId(Integer.parseInt(request.getParameter("purtrans")));

		purchase.setDeliPlace(request.getParameter("purdeliplace"));
		purchase.setCashId(Integer.parseInt(request.getParameter("purcash")));
		purchase.setCheckId(Integer.parseInt(request.getParameter("purcheck")));
		purchase.setPriceCeiling(Float.parseFloat(request.getParameter("purpriceceiling")));

		purchase.setPriceBottom(Float.parseFloat(request.getParameter("purpricebottom")));
		purchase.setPriceStatement(request.getParameter("purpricestatement"));
		purchase.setPayType(request.getParameter("purpaytype"));
		purchase.setAppPromise(Float.parseFloat(request.getParameter("puapppromis")));

		purchase.setPricePromise(Float.parseFloat(request.getParameter("purpricepromise")));
		purchase.setReceQnet(Float.parseFloat(request.getParameter("purreceqnet")));
		purchase.setReceSt(Float.parseFloat(request.getParameter("purrecest")));
		purchase.setReceM(Float.parseFloat(request.getParameter("purrecem")));

		purchase.setReceAar(Float.parseFloat(request.getParameter("purreceaar")));
		purchase.setReceVarMin(Float.parseFloat(request.getParameter("purrecevarmin")));
		purchase.setReceVarMax(Float.parseFloat(request.getParameter("purrecevarmax")));
		purchase.setAirMad(Float.parseFloat(request.getParameter("purairmad")));

		purchase.setAirSt(Float.parseFloat(request.getParameter("purairst")));
		purchase.setAirVadMin(Float.parseFloat(request.getParameter("purairmin")));
		purchase.setAirVadMax(Float.parseFloat(request.getParameter("purairmax")));
		purchase.setDriedQgr(Float.parseFloat(request.getParameter("purdriedqgr")));

		purchase.setDriedSt(Float.parseFloat(request.getParameter("purdriedst")));
		purchase.setDriedVadMin(Float.parseFloat(request.getParameter("purdriedmin")));
		purchase.setDriedVadMax(Float.parseFloat(request.getParameter("purdriedmax")));
		purchase.setParticleSize(Float.parseFloat(request.getParameter("purparaticlesize")));

		purchase.setST(Float.parseFloat(request.getParameter("purst")));
		purchase.setHGI(Float.parseFloat(request.getParameter("purhgi")));
		purchase.setRemark(request.getParameter("purremak"));

		purchaseService.updatePurchase(purchase);
		return "jsp/buy/userBuyList";
	}

	/**
	 * 查找所有采购列表，返回到列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAllPurchase")
	public String queryAllPurchase(HttpServletRequest request, Model model) {
		Integer userId = Integer.parseInt(request.getParameter("userid"));
		if (userId != null) {
			User user = userService.getUserById(userId);
			// 员工（申请）操作，只返回该员工申请的记录
			if (user.getRoleId() == 2) {
				List<Purchase> purchases = purchaseService.getPurchasesByUserId(userId);
				// 按创建时间逆序排列
				purchases = PurchaseSortUtil.sortByCreateDate((ArrayList<Purchase>) purchases);
				model.addAttribute("purchases", purchases);
			} else {
				// 经理（审核）操作或者平台管理员，返回全部的员工已经提交的采购记录
				String statment = "草稿";
				List<Purchase> purchases = purchaseService.queryNoDraftPurchase(statment);
				// 按创建时间逆序排列
				purchases = PurchaseSortUtil.sortByCreateDate((ArrayList<Purchase>) purchases);
				model.addAttribute("purchases", purchases);
			}
		}

		return "jsp/buy/userBuyList";
	}

	/**
	 * 通过purid查找一条采购记录的详细信息，通过userid查找审核人审核的采购记录
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/viewPurchaseById")
	public String viewPurchaseById(HttpServletRequest request, Model model) {
		Integer purId = Integer.parseInt(request.getParameter("purid"));
		Integer userId = Integer.parseInt(request.getParameter("userid"));
		Purchase purchase = purchaseService.queryPurchaseById(purId);
		model.addAttribute("purchase", purchase);

		// 确定不是申请人
		if (userService.getUserById(userId).getRoleId() != 2) {
			List<CheckedInfo> checkedInfos = checkedInfoService.getCheckedInfoByUserId(userId);
			model.addAttribute("checkedInfos", checkedInfos);
		}
		return "jsp/buy/PurchaseInfor";
	}

	/**
	 * 申请人提交采购记录，状态有草稿更新为待审核；或者是审核人审核采购记录，状态更新为审核通过或者驳回不通过
	 * 
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/submitPurchase")
	public String submitPurchaseById(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
		Integer purId = Integer.parseInt(request.getParameter("purid"));
		Integer userId = Integer.parseInt(request.getParameter("userid"));
		String submitType = request.getParameter("submitType").trim();

		List<Purchase> purchases = null;
		String msg = "";

		// 申请人操作
		if (submitType.equals("提交")) {
			msg = "待审核";
			// 更新purchase的statement字段
			int i = purchaseService.updatePurchaseById(purId, msg);
			// 返回该申请人申请的采购记录
			purchases = purchaseService.getPurchasesByUserId(userId);

		} else if (submitType.equals("审核")) {
			// 审核人给通过
			msg = "已通过";
			// 更新purchase的statement字段
			int i = purchaseService.updatePurchaseById(purId, msg);

		} else if (submitType.equals("驳回")) {
			// 审核人给驳回
			msg = "已驳回";
			// 更新purchase的statement字段
			int i = purchaseService.updatePurchaseById(purId, msg);
		}

		// 返回所有采购记录，写入审核记录表
		if (submitType.equals("审核") || submitType.equals("驳回")) {

			// 获取审核意见
			String opinion = request.getParameter("opinion");
			// 新建CheckedInfo对象
			CheckedInfo checkedInfo = new CheckedInfo();

			checkedInfo.setUserId(userId);
			checkedInfo.setPurId(purId);
			checkedInfo.setOperate(msg);
			checkedInfo.setOpinion(opinion);
			checkedInfo.setTime(CurrentTimeUtil.getCurrentTime());

			int j = checkedInfoService.addCheckedInfo(checkedInfo);
			if (j == 1) {
				System.out.println("记录操作表成功");
			}

			// 查找更新后的采购记录表
			purchases = purchaseService.queryAllPurchase();
		}

		// 将更新后的采购记录 按创建时间逆序排列
		purchases = PurchaseSortUtil.sortByCreateDate((ArrayList<Purchase>) purchases);

		model.addAttribute("purchases", purchases);
		return "jsp/buy/userBuyList";
	}

	/**
	 * 删除采购记录
	 */
	@RequestMapping("/deletePurchaseById")
	public String deletePurchaseById(HttpServletRequest request, Model model) {
		Integer purId = Integer.parseInt(request.getParameter("purid"));
		Integer userId = Integer.parseInt(request.getParameter("userid"));
		int i = purchaseService.deletePurchaseById(purId);
		if (i == 1) {
			System.out.println("删除成功！");
		}
		ArrayList<Purchase> purchases = purchaseService.getPurchasesByUserId(userId);
		model.addAttribute("purchases", purchases);

		return "jsp/buy/userBuyList";
	}

}
