package com.bwei.beans;

import java.math.BigDecimal;

public class MySort {

	private static BigDecimal startPrice;
	
	private static BigDecimal endPrice;
	
	private static Integer startSaleay;
	
	private static Integer endSaleay;
	
	private static String sort;
	
	private static String type;

	public static BigDecimal getStartPrice() {
		return startPrice;
	}

	public static void setStartPrice(String startPrice) {
		MySort.startPrice = new BigDecimal(startPrice);
	}

	public static BigDecimal getEndPrice() {
		return endPrice;
	}

	public static void setEndPrice(String endPrice) {
		MySort.endPrice = new BigDecimal(endPrice);
	}

	public static Integer getStartSaleay() {
		return startSaleay;
	}

	public static void setStartSaleay(Integer startSaleay) {
		MySort.startSaleay = startSaleay;
	}

	public static Integer getEndSaleay() {
		return endSaleay;
	}

	public static void setEndSaleay(Integer endSaleay) {
		MySort.endSaleay = endSaleay;
	}

	public static void setStartPrice(BigDecimal startPrice) {
		MySort.startPrice = startPrice;
	}

	public static void setEndPrice(BigDecimal endPrice) {
		MySort.endPrice = endPrice;
	}

	public static String getSort() {
		return sort;
	}

	public static void setSort(String sort) {
		MySort.sort = sort;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		MySort.type = type;
	}

	@Override
	public String toString() {
		return 	 startPrice+"===="+endPrice+"===="+startSaleay+"===="+endSaleay+"===="+sort+"===="+type;
	}


	
	
}
