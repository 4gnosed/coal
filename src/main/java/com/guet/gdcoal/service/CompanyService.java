package com.guet.gdcoal.service;

import java.util.List;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;

public interface CompanyService {

	public Company findUserCompany(Integer companyId);

	public List<Company> findAllCompany();

}
