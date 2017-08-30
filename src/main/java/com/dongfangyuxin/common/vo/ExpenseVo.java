package com.dongfangyuxin.common.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExpenseVo implements Serializable {

    private String expenseType;

    private BigDecimal amount;

    private int pieces;

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}