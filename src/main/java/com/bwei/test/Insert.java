package com.bwei.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bwei.beans.Goods;
import com.bwei.utils.StringUtils;
import com.github.pagehelper.StringUtil;

public class Insert {

	public static List<Goods> getList() throws IOException {
		List<Goods> list = new ArrayList<Goods>();
		BufferedReader br = new BufferedReader(new FileReader("11123.txt"));
		String str = "";
		while ((str = br.readLine()) != null) {
			Goods goods = getGoods(str);
			if (goods != null) {
				list.add(goods);
			}
		}
		return list;
	}
	
	public static Goods getGoods(String str) {
		String[] str1 = str.split("==");
		String [] str2 = new String[4];
		for (int i = 0; i < str1.length; i++) {
			if (i == 2) {
				if (str1.length == 3) {
					if (str1[i].contains("%")) {
						str2[i] = "";
						str2[i+1] = str1[i];
						break;
					}
				}
			}
			str2[i] = str1[i];
		}
		
		Goods g = new Goods();
		if (StringUtils.isNumber(str2[0])) {
			g.setId(Integer.parseInt(str2[0]));
		} else {
			g.setId(null);
		}
		
		if (StringUtils.isEmpty(str2[1])) {
			g.setName(null);
		} else {
			g.setName(str2[1]);
		}
		
		if (!StringUtils.isEmpty(str2[2]) && StringUtils.isNumber(str2[2].replace("¥", ""))) {
			g.setPrice(new BigDecimal(str2[2].replace("¥", "")));
		} else {
			g.setPrice(null);
		}
		
		if (StringUtils.isEmpty(str2[3])) {
			g.setSaleay(0);
		} else {
			g.setSaleay(Integer.parseInt(str2[3].replace("%", "")));
		}
		return g;
	}
	
	public static void main(String[] args) throws IOException {
		List<Goods> list = getList();
		for (Goods goods : list) {
			System.out.println(goods);
		}
	}
}
