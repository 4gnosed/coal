package com.guet.gdcoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	/**
	 * 查看用户的公司信息
	 */
	@RequestMapping("/findCompany")
	public String findUserCompanyRole(@RequestParam(value = "companyId") Integer companyId, Model model) {
		Company company = companyService.findUserCompany(companyId);
		model.addAttribute("company", company);
		return "jsp/user/personalInformation";
	}

	/**
	 * 获取所有公司
	 */
	@RequestMapping("findAllCompany")
	public String findAllCompany(Model model) {
		List<Company> companies = companyService.findAllCompany();
		model.addAttribute("companies", companies);
		return "jsp/user/addMan";
	}

}
