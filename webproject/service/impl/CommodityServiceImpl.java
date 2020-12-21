package com.example.webproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.webproject.mapper.CommodityMapper;
import com.example.webproject.service.CommodityService;
import com.example.webproject.utils.CommodityVo;
import com.example.webproject.utils.DataGripView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public DataGripView findAllCommodity(CommodityVo vo) {
        QueryWrapper<CommodityVo> wrapper = new QueryWrapper<>();
        wrapper.like(vo.getCommodityid() !=null,"commodityId",vo.getCommodityid());
        wrapper.like(vo.getBarcode() !=null,"barCode",vo.getBarcode());
        wrapper.like(vo.getEnterprises() !=null,"enterPrises",vo.getEnterprises());
        IPage<CommodityVo> page = new Page<>(vo.getPage(), vo.getLimit());
        IPage<CommodityVo> pageInfo = commodityMapper.selectPage(page, wrapper);
        return new DataGripView(pageInfo.getTotal(), pageInfo.getRecords());
    }
}
