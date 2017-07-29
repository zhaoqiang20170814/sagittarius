package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.MaterialReturningDetailBean;
import com.dongfangyuxin.common.dao.bean.MaterialReturningDetailBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface MaterialReturningDetailBeanMapper {
    @SelectProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="countByExample")
    long countByExample(MaterialReturningDetailBeanExample example);

    @DeleteProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialReturningDetailBeanExample example);

    @Delete({
        "delete from material_returning_detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into material_returning_detail (CODE, TASK_CODE, ",
        "QUANTITY, AMOUNT, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{taskCode,jdbcType=CHAR}, ",
        "#{quantity,jdbcType=INTEGER}, #{amount,jdbcType=DECIMAL}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MaterialReturningDetailBean record);

    @InsertProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MaterialReturningDetailBean record);

    @SelectProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialReturningDetailBean> selectByExampleWithRowbounds(MaterialReturningDetailBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialReturningDetailBean> selectByExample(MaterialReturningDetailBeanExample example);

    @Select({
        "select",
        "ID, CODE, TASK_CODE, QUANTITY, AMOUNT, S_CREATOR, S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE",
        "from material_returning_detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MaterialReturningDetailBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialReturningDetailBean record, @Param("example") MaterialReturningDetailBeanExample example);

    @UpdateProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialReturningDetailBean record, @Param("example") MaterialReturningDetailBeanExample example);

    @UpdateProvider(type=MaterialReturningDetailBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialReturningDetailBean record);

    @Update({
        "update material_returning_detail",
        "set CODE = #{code,jdbcType=CHAR},",
          "TASK_CODE = #{taskCode,jdbcType=CHAR},",
          "QUANTITY = #{quantity,jdbcType=INTEGER},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MaterialReturningDetailBean record);
}