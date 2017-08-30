package com.dongfangyuxin.common.vo;

import java.io.Serializable;

public class MaterialRetrunVo implements Serializable {

    private String materialCode;

    private int quantity;

    private String reason;

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}