package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.ExpenseInfoBean;
import com.dongfangyuxin.dao.common.bean.ExpenseInfoBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface ExpenseInfoBeanMapper {
    @SelectProvider(type=ExpenseInfoBeanSqlProvider.class, method="countByExample")
    long countByExample(ExpenseInfoBeanExample example);

    @DeleteProvider(type=ExpenseInfoBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(ExpenseInfoBeanExample example);

    @Delete({
        "delete from expense_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into expense_info (CODE, AMOUNT, ",
        "TIME, OPERATOR, TASK_CODE, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{amount,jdbcType=DECIMAL}, ",
        "#{time,jdbcType=TIMESTAMP}, #{operator,jdbcType=CHAR}, #{taskCode,jdbcType=CHAR}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ExpenseInfoBean record);

    @InsertProvider(type=ExpenseInfoBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ExpenseInfoBean record);

    @SelectProvider(type=ExpenseInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="TIME", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ExpenseInfoBean> selectByExampleWithRowbounds(ExpenseInfoBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=ExpenseInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="TIME", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ExpenseInfoBean> selectByExample(ExpenseInfoBeanExample example);

    @Select({
        "select",
        "ID, CODE, AMOUNT, TIME, OPERATOR, TASK_CODE, S_CREATOR, S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE",
        "from expense_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="TIME", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ExpenseInfoBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ExpenseInfoBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ExpenseInfoBean record, @Param("example") ExpenseInfoBeanExample example);

    @UpdateProvider(type=ExpenseInfoBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ExpenseInfoBean record, @Param("example") ExpenseInfoBeanExample example);

    @UpdateProvider(type=ExpenseInfoBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ExpenseInfoBean record);

    @Update({
        "update expense_info",
        "set CODE = #{code,jdbcType=CHAR},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "TIME = #{time,jdbcType=TIMESTAMP},",
          "OPERATOR = #{operator,jdbcType=CHAR},",
          "TASK_CODE = #{taskCode,jdbcType=CHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExpenseInfoBean record);
}