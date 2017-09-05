package com.dongfangyuxin.common.vo;

import java.io.Serializable;

public class MaterialRetrunVo implements Serializable {

    private String materialCode;

    private String materialName;

    private String materialImage;

    private int selectQuantity;

    private int backQuantity;

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public int getSelectQuantity() {
        return selectQuantity;
    }

    public void setSelectQuantity(int selectQuantity) {
        this.selectQuantity = selectQuantity;
    }

    public int getBackQuantity() {
        return backQuantity;
    }

    public void setBackQuantity(int backQuantity) {
        this.backQuantity = backQuantity;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialImage() {
        return materialImage;
    }

    public void setMaterialImage(String materialImage) {
        this.materialImage = materialImage;
    }
}