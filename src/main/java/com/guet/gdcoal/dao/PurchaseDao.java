package com.guet.gdcoal.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guet.gdcoal.model.Purchase;

public interface PurchaseDao {

	int addPurchase(Purchase purchase);

	int deletePurchaseById(int id);

	int updatePurchase(Purchase purchase);

	Purchase queryPurchaseById(int id);

	List<Purchase> queryAllPurchase();

	ArrayList<Purchase> getPurchasesByUserId(Integer userId);

	int updatePurchaseById(@Param("purId") Integer purId, @Param("Statement") String statment);

	List<Purchase> queryNoDraftPurchase(String statment);
}
