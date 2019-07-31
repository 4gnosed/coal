package com.guet.gdcoal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guet.gdcoal.dao.CompanyDao;
import com.guet.gdcoal.dao.UserDao;
import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;
import com.guet.gdcoal.service.CompanyService;
import com.guet.gdcoal.service.UserService;

@Service
public class CompanyServiceImpl  implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public Company findUserCompany(Integer companyId) {
		return this.companyDao.findUserCompany(companyId);
	}

	@Override
	public List<Company> findAllCompany() {
		return this.companyDao.findAllCompany();
	}

}
