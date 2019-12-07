package com.zhangyaoxing.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangyaoxing.entity.Goods;
import com.zhangyaoxing.vo.Vo;

public interface GoodsMapper {
	boolean addGoods(ArrayList<Goods> list);
	List<Goods> selectGoods(@Param("vo")Vo vo);
}
