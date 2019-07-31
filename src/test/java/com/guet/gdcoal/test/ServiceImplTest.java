package com.guet.gdcoal.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.Purchase;
import com.guet.gdcoal.model.User;
import com.guet.gdcoal.service.CompanyService;
import com.guet.gdcoal.service.PurchaseService;
import com.guet.gdcoal.serviceImpl.CompanyServiceImpl;
import com.guet.gdcoal.serviceImpl.UserServiceImpl;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class ServiceImplTest {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private  CompanyServiceImpl companyServiceImpl;
	
	@Autowired
	private PurchaseService purchaseService;

	@Test
	public void getUserByIdTest() {
		User user = userServiceImpl.getUserById(1);
		System.out.println(user);
		TestCase.assertNotNull(user);
	}

	@Test
	public void loginTest() {
		User user = userServiceImpl.login("wdc", "123");
		System.out.println(user);
		TestCase.assertNotNull(user);
	}

	@Test
	public void findUserCompanyTest() {
		Company company = companyServiceImpl.findUserCompany(2);
		System.out.println(company);
		TestCase.assertNotNull(company);
	}

	@Test
	public void updatePasswordByIdTest() {
		int i = userServiceImpl.updatePasswordByUserId(1, "234");
		TestCase.assertEquals(1, i);
	}

	@Test
	public void findAllCompanyTest() {
		List<Company> companies = companyServiceImpl.findAllCompany();
		for (Company company : companies) {
			System.out.println(company);
		}
		TestCase.assertNotNull(companies);
	}

	@Test
	public void addUserTest() {
		User user = new User();
		user.setUserName("马子大");
		user.setUserPassword("123");
		user.setUserEnName("mdzz");
		user.setUserPhone("1876464646");
		user.setUserAddress("南京的天安门");
		user.setUserEmail("mdzz@foxmail.com");
		user.setCompanyId(Integer.parseInt("3"));
		user.setRoleId(Integer.parseInt("2"));
		
		int i = userServiceImpl.addUser(user);
		TestCase.assertEquals(1, i);
	}
	
	@Test
	public void queryPurchaseById(){
		Purchase purchase = purchaseService.queryPurchaseById(3	);
		System.out.println(purchase);
		TestCase.assertNotNull(purchase);
	}
}
