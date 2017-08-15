package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.ExpenseInfoDetailBean;
import com.dongfangyuxin.dao.common.bean.ExpenseInfoDetailBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface ExpenseInfoDetailBeanMapper {
    @SelectProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="countByExample")
    long countByExample(ExpenseInfoDetailBeanExample example);

    @DeleteProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(ExpenseInfoDetailBeanExample example);

    @Delete({
        "delete from expense_info_detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into expense_info_detail (CODE, TYPE, AMOUNT, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{type,jdbcType=CHAR}, #{amount,jdbcType=DECIMAL}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ExpenseInfoDetailBean record);

    @InsertProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ExpenseInfoDetailBean record);

    @SelectProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ExpenseInfoDetailBean> selectByExampleWithRowbounds(ExpenseInfoDetailBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ExpenseInfoDetailBean> selectByExample(ExpenseInfoDetailBeanExample example);

    @Select({
        "select",
        "ID, CODE, TYPE, AMOUNT, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from expense_info_detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ExpenseInfoDetailBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ExpenseInfoDetailBean record, @Param("example") ExpenseInfoDetailBeanExample example);

    @UpdateProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ExpenseInfoDetailBean record, @Param("example") ExpenseInfoDetailBeanExample example);

    @UpdateProvider(type=ExpenseInfoDetailBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ExpenseInfoDetailBean record);

    @Update({
        "update expense_info_detail",
        "set CODE = #{code,jdbcType=CHAR},",
          "TYPE = #{type,jdbcType=CHAR},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExpenseInfoDetailBean record);
}