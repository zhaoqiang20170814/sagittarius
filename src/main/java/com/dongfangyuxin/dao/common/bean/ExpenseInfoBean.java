package com.dongfangyuxin.dao.common.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ExpenseInfoBean implements Serializable {
    private Integer id;

    private String code;

    private BigDecimal amount;

    private Date time;

    private String operator;

    private String taskCode;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
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