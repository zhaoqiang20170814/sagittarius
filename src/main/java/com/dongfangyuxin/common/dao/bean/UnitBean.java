package com.dongfangyuxin.common.dao.bean;

import java.util.Date;

public class UnitBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.ID
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.CODE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.NAME
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.S_CREATOR
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private String sCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.S_CREATE_DATE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private Date sCreateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.S_OPERATOR
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private String sOperator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit.S_OPERATOR_DATE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    private Date sOperatorDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.ID
     *
     * @return the value of unit.ID
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.ID
     *
     * @param id the value for unit.ID
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.CODE
     *
     * @return the value of unit.CODE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.CODE
     *
     * @param code the value for unit.CODE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.NAME
     *
     * @return the value of unit.NAME
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.NAME
     *
     * @param name the value for unit.NAME
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.S_CREATOR
     *
     * @return the value of unit.S_CREATOR
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public String getsCreator() {
        return sCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.S_CREATOR
     *
     * @param sCreator the value for unit.S_CREATOR
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setsCreator(String sCreator) {
        this.sCreator = sCreator == null ? null : sCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.S_CREATE_DATE
     *
     * @return the value of unit.S_CREATE_DATE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public Date getsCreateDate() {
        return sCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.S_CREATE_DATE
     *
     * @param sCreateDate the value for unit.S_CREATE_DATE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setsCreateDate(Date sCreateDate) {
        this.sCreateDate = sCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.S_OPERATOR
     *
     * @return the value of unit.S_OPERATOR
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public String getsOperator() {
        return sOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.S_OPERATOR
     *
     * @param sOperator the value for unit.S_OPERATOR
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setsOperator(String sOperator) {
        this.sOperator = sOperator == null ? null : sOperator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit.S_OPERATOR_DATE
     *
     * @return the value of unit.S_OPERATOR_DATE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public Date getsOperatorDate() {
        return sOperatorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit.S_OPERATOR_DATE
     *
     * @param sOperatorDate the value for unit.S_OPERATOR_DATE
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    public void setsOperatorDate(Date sOperatorDate) {
        this.sOperatorDate = sOperatorDate;
    }
}