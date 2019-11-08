package com.bwei.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bwei.beans.Goods;
import com.bwei.beans.MySort;
import com.bwei.service.GoodsService;
import com.bwei.test.Insert;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {

	@Resource
	GoodsService gs;
	
	@RequestMapping("list")
	public ModelAndView findAll(@RequestParam(defaultValue="1")Integer pageNum,MySort ms) {
		ModelAndView mav = new ModelAndView();
		System.out.println(ms);

		PageHelper.startPage(pageNum, 5);
		List<Goods> list = gs.findAll(ms);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mav.setViewName("list");
		mav.getModel().put("page", page);
		return mav;
	}
	
	@RequestMapping("add")
	public String add() throws IOException{
		List<Goods> list = Insert.getList();
		for (Goods goods : list) {
			System.out.println(goods);
		}
		gs.del();
		gs.add(list);
		return "redirect:list";
	}
}
