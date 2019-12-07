package com.zhangyaoxing.service;

import com.github.pagehelper.PageInfo;
import com.zhangyaoxing.entity.Goods;
import com.zhangyaoxing.vo.Vo;

public interface GoodsService {
	boolean addGoods();
	PageInfo<Goods> selectGoods(Vo vo, int page);
}
