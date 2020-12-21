package com.example.webproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("commodity")
@ToString
public class Commodity implements Serializable {
    private static final long serialVersionUID = -31652714671128379L;

    //商品id
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    //商品代号
    @TableField(value ="commodityId")
    private String commodityid;

    //条形码
    @TableField(value ="barCode")
    private String barcode;

    //商品名称
    @TableField(value ="commodityName")
    private String commodityname;

    //一级分类
    @TableField(value ="firstCategory")
    private String firstcategory;

    //二级分类
    @TableField(value ="secoundCategory")
    private String secoundcategory;

    //供货价格
    @TableField(value ="supplyPrice")
    private Integer supplyprice;

    //最低销售价格
    @TableField(value ="reservationPrice")
    private Integer reservationprice;

    //建议销售价格
    @TableField(value ="sellPrice")
    private Integer sellprice;

    //商品规格
    @TableField(value ="specifications")
    private Integer specifications;

    //商品产地
    @TableField(value ="origin")
    private String origin;

    //计里单位
    @TableField(value ="unit")
    private String unit;

    //商品供应企业
    @TableField(value ="enterprises")
    private String enterprises;

    //审核状态
    @TableField(value ="status")
    private String status;

}
