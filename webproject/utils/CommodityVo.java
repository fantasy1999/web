package com.example.webproject.utils;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.webproject.entity.Commodity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("commodity")
@AllArgsConstructor
@NoArgsConstructor
public class CommodityVo extends Commodity {

    @TableField(select = false)
    private Integer page;

    @TableField(select = false)
    private Integer limit;


}
