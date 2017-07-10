package com.dongfangyuxin.common.dao.bean;

import java.util.Date;

public class TaskBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.ID
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.CODE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.NAME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.ADDRESS
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.START_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.END_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.LEADING_OFFICIAL
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String leadingOfficial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.PARTICIPANT
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String participant;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.TASK_STATUS
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String taskStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.DRAWING
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String drawing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.S_CREATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String sCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.S_CREATE_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date sCreateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.S_OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private String sOperator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.S_OPERATOR_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    private Date sOperatorDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.ID
     *
     * @return the value of task.ID
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.ID
     *
     * @param id the value for task.ID
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.CODE
     *
     * @return the value of task.CODE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.CODE
     *
     * @param code the value for task.CODE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.NAME
     *
     * @return the value of task.NAME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.NAME
     *
     * @param name the value for task.NAME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.ADDRESS
     *
     * @return the value of task.ADDRESS
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.ADDRESS
     *
     * @param address the value for task.ADDRESS
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.START_TIME
     *
     * @return the value of task.START_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.START_TIME
     *
     * @param startTime the value for task.START_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.END_TIME
     *
     * @return the value of task.END_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.END_TIME
     *
     * @param endTime the value for task.END_TIME
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.LEADING_OFFICIAL
     *
     * @return the value of task.LEADING_OFFICIAL
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getLeadingOfficial() {
        return leadingOfficial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.LEADING_OFFICIAL
     *
     * @param leadingOfficial the value for task.LEADING_OFFICIAL
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setLeadingOfficial(String leadingOfficial) {
        this.leadingOfficial = leadingOfficial == null ? null : leadingOfficial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.PARTICIPANT
     *
     * @return the value of task.PARTICIPANT
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getParticipant() {
        return participant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.PARTICIPANT
     *
     * @param participant the value for task.PARTICIPANT
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setParticipant(String participant) {
        this.participant = participant == null ? null : participant.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.TASK_STATUS
     *
     * @return the value of task.TASK_STATUS
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.TASK_STATUS
     *
     * @param taskStatus the value for task.TASK_STATUS
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.DRAWING
     *
     * @return the value of task.DRAWING
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getDrawing() {
        return drawing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.DRAWING
     *
     * @param drawing the value for task.DRAWING
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setDrawing(String drawing) {
        this.drawing = drawing == null ? null : drawing.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.S_CREATOR
     *
     * @return the value of task.S_CREATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getsCreator() {
        return sCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.S_CREATOR
     *
     * @param sCreator the value for task.S_CREATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsCreator(String sCreator) {
        this.sCreator = sCreator == null ? null : sCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.S_CREATE_DATE
     *
     * @return the value of task.S_CREATE_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getsCreateDate() {
        return sCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.S_CREATE_DATE
     *
     * @param sCreateDate the value for task.S_CREATE_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsCreateDate(Date sCreateDate) {
        this.sCreateDate = sCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.S_OPERATOR
     *
     * @return the value of task.S_OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public String getsOperator() {
        return sOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.S_OPERATOR
     *
     * @param sOperator the value for task.S_OPERATOR
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsOperator(String sOperator) {
        this.sOperator = sOperator == null ? null : sOperator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.S_OPERATOR_DATE
     *
     * @return the value of task.S_OPERATOR_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public Date getsOperatorDate() {
        return sOperatorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.S_OPERATOR_DATE
     *
     * @param sOperatorDate the value for task.S_OPERATOR_DATE
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    public void setsOperatorDate(Date sOperatorDate) {
        this.sOperatorDate = sOperatorDate;
    }
}