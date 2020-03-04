package com.lxt.erp.bus.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.io.Serializable;

import com.lxt.erp.bus.domain.Goods;
import com.lxt.erp.bus.domain.Inport;
import com.lxt.erp.bus.mapper.GoodsMapper;
import com.lxt.erp.bus.mapper.InportMapper;
import com.lxt.erp.bus.service.InportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老雷
 * @since 2019-09-28
 */
@Service
@Transactional

/**
 * 
 * 500+500==1000
 * 400           900=1000-500+400
 * @author LJH
 *
 */
public class InportServiceImpl extends ServiceImpl<InportMapper, Inport> implements InportService {

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public boolean save(Inport entity) {
		//根据商品编号查询商品
		Goods goods=goodsMapper.selectById(entity.getGoodsid());
		goods.setNumber(goods.getNumber()+entity.getNumber());
		goodsMapper.updateById(goods);
		//保存进货信息
		return super.save(entity);
	}
	
	@Override
	public boolean updateById(Inport entity) {
		//根据进货ID查询进货
		Inport inport = this.baseMapper.selectById(entity.getId());
		//根据商品ID查询商品信息
		Goods goods = this.goodsMapper.selectById(entity.getGoodsid());
		//库存的算法  当前库存-进货单修改之前的数量+修改之后的数量
		goods.setNumber(goods.getNumber()-inport.getNumber()+entity.getNumber());
		this.goodsMapper.updateById(goods);
		//更新进货单
		return super.updateById(entity);
	}
	
	
	
	@Override
	public boolean removeById(Serializable id) {
		//根据进货ID查询进货
		Inport inport = this.baseMapper.selectById(id);
		//根据商品ID查询商品信息
		Goods goods = this.goodsMapper.selectById(inport.getGoodsid());
		//库存的算法  当前库存-进货单数量
		goods.setNumber(goods.getNumber()-inport.getNumber());
		this.goodsMapper.updateById(goods);
		return super.removeById(id);
	}
	
	
	
	
}
