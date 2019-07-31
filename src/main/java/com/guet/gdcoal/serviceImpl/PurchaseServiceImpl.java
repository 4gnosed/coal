package com.guet.gdcoal.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guet.gdcoal.dao.PurchaseDao;
import com.guet.gdcoal.model.Purchase;
import com.guet.gdcoal.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	private PurchaseDao purchaseDao;
	
	@Override
	public int addPurchase(Purchase purchase) {
		return this.purchaseDao.addPurchase(purchase);
	}

	@Override
	public Purchase queryPurchaseById(Integer purchaseId) {
		return this.purchaseDao.queryPurchaseById(purchaseId);
	}

	@Override
	public void updatePurchase(Purchase purchase) {
		this.purchaseDao.updatePurchase(purchase);
	}

	@Override
	public List<Purchase> queryAllPurchase() {
		return this.purchaseDao.queryAllPurchase();
	}

	@Override
	public ArrayList<Purchase> getPurchasesByUserId(Integer userId) {
		return this.purchaseDao.getPurchasesByUserId(userId);
	}

	@Override
	public int updatePurchaseById(Integer purId,String statment) {
		return this.purchaseDao.updatePurchaseById(purId,statment);
	}

	@Override
	public int deletePurchaseById(Integer purId) {
		return this.purchaseDao.deletePurchaseById(purId);
	}

	@Override
	public List<Purchase> queryNoDraftPurchase(String statment) {
		return this.purchaseDao.queryNoDraftPurchase(statment);
	}

}
