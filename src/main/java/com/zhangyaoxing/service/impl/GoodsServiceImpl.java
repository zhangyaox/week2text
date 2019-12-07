package com.zhangyaoxing.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangyaoxing.entity.Goods;
import com.zhangyaoxing.mapper.GoodsMapper;
import com.zhangyaoxing.service.GoodsService;
import com.zhangyaoxing.util.Iofile;
import com.zhangyaoxing.vo.Vo;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public boolean addGoods() {
		Iofile iofile = new Iofile();
		ArrayList<Goods> readLinIo = null;
		try {
			readLinIo = iofile.readLinIo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goodsMapper.addGoods(readLinIo);
	}

	@Override
	public PageInfo<Goods> selectGoods(Vo vo, int page) {
		Page<Object> startPage = PageHelper.startPage(page, 5);
		List<Goods> selectGoods = goodsMapper.selectGoods(vo);
		
		return new PageInfo<>(selectGoods);
	}
}
