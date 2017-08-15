package com.dongfangyuxin.dao.common.bean;

import java.io.Serializable;
import java.util.Date;

public class CarUsedHistoryBean implements Serializable {
    private Integer id;

    private String carNumber;

    private String taskCode;

    private String operator;

    private Date useTime;

    private Date returnTime;

    private Integer useQuantity;

    private String remark;

    private Integer odometer;

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

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getUseQuantity() {
        return useQuantity;
    }

    public void setUseQuantity(Integer useQuantity) {
        this.useQuantity = useQuantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOdometer() {
        return odometer;
    }

    public void setOdometer(Integer odometer) {
        this.odometer = odometer;
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