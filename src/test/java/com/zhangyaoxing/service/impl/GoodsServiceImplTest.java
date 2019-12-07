package com.zhangyaoxing.service.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangyaoxing.entity.Goods;
import com.zhangyaoxing.mapper.GoodsMapper;
import com.zhangyaoxing.util.Iofile;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceImplTest {
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Test
	public void testAddGoods() {
		Iofile iofile = new Iofile();
		ArrayList<Goods> readLinIo = null;
		try {
			readLinIo = iofile.readLinIo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 boolean addGoods = goodsMapper.addGoods(readLinIo);
		 System.out.println(addGoods);
	}

}
