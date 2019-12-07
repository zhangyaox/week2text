package com.zhangyaoxing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhangyaoxing.entity.Goods;
import com.zhangyaoxing.service.GoodsService;
import com.zhangyaoxing.vo.Vo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("select")
	public String add(Model m, Vo vo,@RequestParam(defaultValue = "1")int page) {
		PageInfo<Goods> selectGoods = goodsService.selectGoods(vo,page);
		m.addAttribute("selectGoods", selectGoods);
		m.addAttribute("vo", vo);
		return "list";
	}
}
