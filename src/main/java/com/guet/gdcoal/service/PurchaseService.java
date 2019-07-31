package com.guet.gdcoal.service;

import java.util.ArrayList;
import java.util.List;

import com.guet.gdcoal.model.Purchase;

public interface PurchaseService {

	int addPurchase(Purchase purchase);

	Purchase queryPurchaseById(Integer purchaseId);

	void updatePurchase(Purchase purchase);

	List<Purchase> queryAllPurchase();

	ArrayList<Purchase> getPurchasesByUserId(Integer userId);

	int updatePurchaseById(Integer purId,String statment);

	int deletePurchaseById(Integer purId);

	List<Purchase> queryNoDraftPurchase(String statment);

}
