package com.dongfangyuxin.common.dao.bean;

import java.util.Date;

public class CarUsedHistoryBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.ID
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.CAR_NUMBER
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String carNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.TASK_CODE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String taskCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.USE_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date useTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.RETURN_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date returnTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.USE_QUANTITY
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Integer useQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.S_CREATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String sCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.S_CREATE_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date sCreateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.S_OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String sOperator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sagittarius..car_used_history.S_OPERATOR_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date sOperatorDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.ID
     *
     * @return the value of sagittarius..car_used_history.ID
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.ID
     *
     * @param id the value for sagittarius..car_used_history.ID
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.CAR_NUMBER
     *
     * @return the value of sagittarius..car_used_history.CAR_NUMBER
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.CAR_NUMBER
     *
     * @param carNumber the value for sagittarius..car_used_history.CAR_NUMBER
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.TASK_CODE
     *
     * @return the value of sagittarius..car_used_history.TASK_CODE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.TASK_CODE
     *
     * @param taskCode the value for sagittarius..car_used_history.TASK_CODE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.OPERATOR
     *
     * @return the value of sagittarius..car_used_history.OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.OPERATOR
     *
     * @param operator the value for sagittarius..car_used_history.OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.USE_TIME
     *
     * @return the value of sagittarius..car_used_history.USE_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.USE_TIME
     *
     * @param useTime the value for sagittarius..car_used_history.USE_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.RETURN_TIME
     *
     * @return the value of sagittarius..car_used_history.RETURN_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.RETURN_TIME
     *
     * @param returnTime the value for sagittarius..car_used_history.RETURN_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.USE_QUANTITY
     *
     * @return the value of sagittarius..car_used_history.USE_QUANTITY
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Integer getUseQuantity() {
        return useQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.USE_QUANTITY
     *
     * @param useQuantity the value for sagittarius..car_used_history.USE_QUANTITY
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setUseQuantity(Integer useQuantity) {
        this.useQuantity = useQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.S_CREATOR
     *
     * @return the value of sagittarius..car_used_history.S_CREATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getsCreator() {
        return sCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.S_CREATOR
     *
     * @param sCreator the value for sagittarius..car_used_history.S_CREATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsCreator(String sCreator) {
        this.sCreator = sCreator == null ? null : sCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.S_CREATE_DATE
     *
     * @return the value of sagittarius..car_used_history.S_CREATE_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getsCreateDate() {
        return sCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.S_CREATE_DATE
     *
     * @param sCreateDate the value for sagittarius..car_used_history.S_CREATE_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsCreateDate(Date sCreateDate) {
        this.sCreateDate = sCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.S_OPERATOR
     *
     * @return the value of sagittarius..car_used_history.S_OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getsOperator() {
        return sOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.S_OPERATOR
     *
     * @param sOperator the value for sagittarius..car_used_history.S_OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsOperator(String sOperator) {
        this.sOperator = sOperator == null ? null : sOperator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sagittarius..car_used_history.S_OPERATOR_DATE
     *
     * @return the value of sagittarius..car_used_history.S_OPERATOR_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getsOperatorDate() {
        return sOperatorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sagittarius..car_used_history.S_OPERATOR_DATE
     *
     * @param sOperatorDate the value for sagittarius..car_used_history.S_OPERATOR_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsOperatorDate(Date sOperatorDate) {
        this.sOperatorDate = sOperatorDate;
    }
}