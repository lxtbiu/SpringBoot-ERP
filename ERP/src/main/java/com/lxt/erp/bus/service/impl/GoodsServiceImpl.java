package com.lxt.erp.bus.service.impl;

import com.lxt.erp.bus.domain.Goods;
import com.lxt.erp.bus.mapper.GoodsMapper;
import com.lxt.erp.bus.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2020-02-29
 */
@Service
@Transactional
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {


    @Override
    public boolean save(Goods entity) {
        // TODO Auto-generated method stub
        return super.save(entity);
    }

    @Override
    public boolean updateById(Goods entity) {
        // TODO Auto-generated method stub
        return super.updateById(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        // TODO Auto-generated method stub
        return super.removeById(id);
    }

    @Override
    public Goods getById(Serializable id) {
        // TODO Auto-generated method stub
        return super.getById(id);
    }
}
