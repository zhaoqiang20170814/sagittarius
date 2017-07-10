package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.TaskBean;
import com.dongfangyuxin.common.dao.bean.TaskBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TaskBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @SelectProvider(type=TaskBeanSqlProvider.class, method="countByExample")
    long countByExample(TaskBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @DeleteProvider(type=TaskBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(TaskBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @Insert({
        "insert into task (CODE, NAME, ",
        "ADDRESS, START_TIME, ",
        "END_TIME, LEADING_OFFICIAL, ",
        "PARTICIPANT, TASK_STATUS, ",
        "DRAWING, S_CREATOR, ",
        "S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{leadingOfficial,jdbcType=VARCHAR}, ",
        "#{participant,jdbcType=VARCHAR}, #{taskStatus,jdbcType=CHAR}, ",
        "#{drawing,jdbcType=VARCHAR}, #{sCreator,jdbcType=CHAR}, ",
        "#{sCreateDate,jdbcType=TIMESTAMP}, #{sOperator,jdbcType=CHAR}, ",
        "#{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(TaskBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @InsertProvider(type=TaskBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(TaskBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @SelectProvider(type=TaskBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="END_TIME", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LEADING_OFFICIAL", property="leadingOfficial", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTICIPANT", property="participant", jdbcType=JdbcType.VARCHAR),
        @Result(column="TASK_STATUS", property="taskStatus", jdbcType=JdbcType.CHAR),
        @Result(column="DRAWING", property="drawing", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TaskBean> selectByExample(TaskBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @UpdateProvider(type=TaskBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TaskBean record, @Param("example") TaskBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @UpdateProvider(type=TaskBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TaskBean record, @Param("example") TaskBeanExample example);
}