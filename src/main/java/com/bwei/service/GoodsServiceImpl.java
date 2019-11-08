package com.bwei.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwei.beans.Goods;
import com.bwei.beans.MySort;
import com.bwei.dao.GoodsDao;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {

	@Resource
	GoodsDao dao;
	
	public List<Goods> findAll(MySort ms) {
		// TODO Auto-generated method stub
		return dao.findAll(ms);
	}

	public int add(List<Goods> list) {
		// TODO Auto-generated method stub
		return dao.add(list);
	}

	public int del() {
		// TODO Auto-generated method stub
		return dao.del();
	}

}
