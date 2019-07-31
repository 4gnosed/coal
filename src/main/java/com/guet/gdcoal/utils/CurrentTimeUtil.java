package com.guet.gdcoal.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeUtil {
	public static String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	
	public static String getPurchaseNumber(String companyName) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		return companyName+"-"+sdf.format(new Date());
	}
}
