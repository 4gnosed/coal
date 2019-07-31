package com.guet.gdcoal.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import com.guet.gdcoal.model.Purchase;

public class PurchaseSortUtil {

	public static ArrayList<Purchase> sortByCreateDate(ArrayList<Purchase> purchases) {
		// System.out.println("排序前");
		// for (Purchase purchase : purchases) {
		// System.out.println(purchase.getCreateDate());
		// }
		Collections.sort(purchases, new Comparator<Purchase>() {

			@Override
			public int compare(Purchase p1, Purchase p2) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd", Locale.CHINA);
				Long d1 = null;
				Long d2 = null;
				try {
					d1 = sdf.parse(p1.getCreateDate()).getTime();
					d2 = sdf.parse(p2.getCreateDate()).getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return d2.compareTo(d1);
			}

		});

		// 冒泡排序法
		// for (int i = 0; i < purchases.size() - 1; i++) {
		// for (int j = i + 1; j < purchases.size(); j++) {
		// int k =
		// purchases.get(i).getCreateDate().compareTo(purchases.get(j).getCreateDate());
		// if (k < 0) {
		// Collections.swap(purchases, i, j);
		// }
		// }
		// }

		// System.out.println("排序后");
		// for (Purchase purchase : purchases) {
		// System.out.println(purchase.getCreateDate());
		// }

		return purchases;
	}
}
