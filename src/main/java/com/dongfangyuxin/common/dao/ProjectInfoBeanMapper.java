package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.ProjectInfoBean;
import com.dongfangyuxin.common.dao.bean.ProjectInfoBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ProjectInfoBeanMapper {
    @SelectProvider(type=ProjectInfoBeanSqlProvider.class, method="countByExample")
    long countByExample(ProjectInfoBeanExample example);

    @DeleteProvider(type=ProjectInfoBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProjectInfoBeanExample example);

    @Delete({
        "delete from project_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into project_info (NAME, STATUS, ",
        "OWNER, ADDRESS, START_TIME, ",
        "PROGRAM_BUDGET, REALTIME_COST, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{name,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{owner,jdbcType=CHAR}, #{address,jdbcType=VARCHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{programBudget,jdbcType=DECIMAL}, #{realtimeCost,jdbcType=DECIMAL}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ProjectInfoBean record);

    @InsertProvider(type=ProjectInfoBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ProjectInfoBean record);

    @SelectProvider(type=ProjectInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROGRAM_BUDGET", property="programBudget", jdbcType=JdbcType.DECIMAL),
        @Result(column="REALTIME_COST", property="realtimeCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProjectInfoBean> selectByExampleWithRowbounds(ProjectInfoBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=ProjectInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROGRAM_BUDGET", property="programBudget", jdbcType=JdbcType.DECIMAL),
        @Result(column="REALTIME_COST", property="realtimeCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProjectInfoBean> selectByExample(ProjectInfoBeanExample example);

    @Select({
        "select",
        "ID, NAME, STATUS, OWNER, ADDRESS, START_TIME, PROGRAM_BUDGET, REALTIME_COST, ",
        "S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from project_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROGRAM_BUDGET", property="programBudget", jdbcType=JdbcType.DECIMAL),
        @Result(column="REALTIME_COST", property="realtimeCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ProjectInfoBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ProjectInfoBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProjectInfoBean record, @Param("example") ProjectInfoBeanExample example);

    @UpdateProvider(type=ProjectInfoBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProjectInfoBean record, @Param("example") ProjectInfoBeanExample example);

    @UpdateProvider(type=ProjectInfoBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProjectInfoBean record);

    @Update({
        "update project_info",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=CHAR},",
          "OWNER = #{owner,jdbcType=CHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "START_TIME = #{startTime,jdbcType=TIMESTAMP},",
          "PROGRAM_BUDGET = #{programBudget,jdbcType=DECIMAL},",
          "REALTIME_COST = #{realtimeCost,jdbcType=DECIMAL},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectInfoBean record);
}