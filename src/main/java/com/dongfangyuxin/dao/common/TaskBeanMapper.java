package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.TaskBean;
import com.dongfangyuxin.dao.common.bean.TaskBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface TaskBeanMapper {
    @SelectProvider(type=TaskBeanSqlProvider.class, method="countByExample")
    long countByExample(TaskBeanExample example);

    @DeleteProvider(type=TaskBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(TaskBeanExample example);

    @Delete({
        "delete from task",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

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

    @InsertProvider(type=TaskBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(TaskBean record);

    @SelectProvider(type=TaskBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
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
    List<TaskBean> selectByExampleWithRowbounds(TaskBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=TaskBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
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

    @Select({
        "select",
        "ID, CODE, NAME, ADDRESS, START_TIME, END_TIME, LEADING_OFFICIAL, PARTICIPANT, ",
        "TASK_STATUS, DRAWING, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from task",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
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
    TaskBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TaskBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TaskBean record, @Param("example") TaskBeanExample example);

    @UpdateProvider(type=TaskBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TaskBean record, @Param("example") TaskBeanExample example);

    @UpdateProvider(type=TaskBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TaskBean record);

    @Update({
        "update task",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "START_TIME = #{startTime,jdbcType=TIMESTAMP},",
          "END_TIME = #{endTime,jdbcType=TIMESTAMP},",
          "LEADING_OFFICIAL = #{leadingOfficial,jdbcType=VARCHAR},",
          "PARTICIPANT = #{participant,jdbcType=VARCHAR},",
          "TASK_STATUS = #{taskStatus,jdbcType=CHAR},",
          "DRAWING = #{drawing,jdbcType=VARCHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TaskBean record);
}