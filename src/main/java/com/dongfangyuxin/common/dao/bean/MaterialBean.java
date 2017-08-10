package com.dongfangyuxin.common.dao.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MaterialBean implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private String type;

    private String unit;

    private BigDecimal price;

    private String image;

    private String sCreator;

    private Date sCreateDate;

    private String sOperator;

    private Date sOperatorDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getsCreator() {
        return sCreator;
    }

    public void setsCreator(String sCreator) {
        this.sCreator = sCreator == null ? null : sCreator.trim();
    }

    public Date getsCreateDate() {
        return sCreateDate;
    }

    public void setsCreateDate(Date sCreateDate) {
        this.sCreateDate = sCreateDate;
    }

    public String getsOperator() {
        return sOperator;
    }

    public void setsOperator(String sOperator) {
        this.sOperator = sOperator == null ? null : sOperator.trim();
    }

    public Date getsOperatorDate() {
        return sOperatorDate;
    }

    public void setsOperatorDate(Date sOperatorDate) {
        this.sOperatorDate = sOperatorDate;
    }
}