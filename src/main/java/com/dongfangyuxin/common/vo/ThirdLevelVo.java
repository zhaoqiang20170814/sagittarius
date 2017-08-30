package com.dongfangyuxin.common.vo;

import java.io.Serializable;

public class ThirdLevelVo implements Serializable {

    private String parentlevelId;

    private String levelId;

    private String levelName;

    private String imageUrl;

    private int stockQuantity;

    private int selectQuantity;

    public String getParentlevelId() {
        return parentlevelId;
    }

    public void setParentlevelId(String parentlevelId) {
        this.parentlevelId = parentlevelId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getSelectQuantity() {
        return selectQuantity;
    }

    public void setSelectQuantity(int selectQuantity) {
        this.selectQuantity = selectQuantity;
    }
}