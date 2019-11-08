package com.bwei.service;

import java.util.List;

import com.bwei.beans.Goods;
import com.bwei.beans.MySort;

public interface GoodsService {

	public List<Goods> findAll(MySort ms);
	
	public int add(List<Goods> list);
	
	public int del();
}
