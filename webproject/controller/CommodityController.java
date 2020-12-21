package com.example.webproject.controller;

import com.example.webproject.service.CommodityService;
import com.example.webproject.utils.CommodityVo;
import com.example.webproject.utils.DataGripView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cc")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping("list")
    @ResponseBody
    public DataGripView findList(CommodityVo vo) {
        return commodityService.findAllCommodity(vo);
    }
}
