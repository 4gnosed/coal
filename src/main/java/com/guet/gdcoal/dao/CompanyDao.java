package com.guet.gdcoal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;

public interface CompanyDao {

	public Company findUserCompany(Integer companyId);

	public List<Company> findAllCompany();

}
