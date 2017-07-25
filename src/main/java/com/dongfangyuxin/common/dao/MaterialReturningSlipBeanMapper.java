package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.MaterialReturningSlipBean;
import com.dongfangyuxin.common.dao.bean.MaterialReturningSlipBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface MaterialReturningSlipBeanMapper {
    @SelectProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="countByExample")
    long countByExample(MaterialReturningSlipBeanExample example);

    @DeleteProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialReturningSlipBeanExample example);

    @Delete({
        "delete from material_returning_slip",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into material_returning_slip (CODE, TASK_CODE, ",
        "COUNT, OPERATOR, OPERATING_TIME, ",
        "ORDER_PERSON, ORDER_TIME, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{taskCode,jdbcType=CHAR}, ",
        "#{count,jdbcType=INTEGER}, #{operator,jdbcType=CHAR}, #{operatingTime,jdbcType=TIMESTAMP}, ",
        "#{orderPerson,jdbcType=CHAR}, #{orderTime,jdbcType=TIMESTAMP}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MaterialReturningSlipBean record);

    @InsertProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MaterialReturningSlipBean record);

    @SelectProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATING_TIME", property="operatingTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ORDER_PERSON", property="orderPerson", jdbcType=JdbcType.CHAR),
        @Result(column="ORDER_TIME", property="orderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialReturningSlipBean> selectByExampleWithRowbounds(MaterialReturningSlipBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATING_TIME", property="operatingTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ORDER_PERSON", property="orderPerson", jdbcType=JdbcType.CHAR),
        @Result(column="ORDER_TIME", property="orderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialReturningSlipBean> selectByExample(MaterialReturningSlipBeanExample example);

    @Select({
        "select",
        "ID, CODE, TASK_CODE, COUNT, OPERATOR, OPERATING_TIME, ORDER_PERSON, ORDER_TIME, ",
        "S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from material_returning_slip",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATING_TIME", property="operatingTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ORDER_PERSON", property="orderPerson", jdbcType=JdbcType.CHAR),
        @Result(column="ORDER_TIME", property="orderTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MaterialReturningSlipBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialReturningSlipBean record, @Param("example") MaterialReturningSlipBeanExample example);

    @UpdateProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialReturningSlipBean record, @Param("example") MaterialReturningSlipBeanExample example);

    @UpdateProvider(type=MaterialReturningSlipBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialReturningSlipBean record);

    @Update({
        "update material_returning_slip",
        "set CODE = #{code,jdbcType=CHAR},",
          "TASK_CODE = #{taskCode,jdbcType=CHAR},",
          "COUNT = #{count,jdbcType=INTEGER},",
          "OPERATOR = #{operator,jdbcType=CHAR},",
          "OPERATING_TIME = #{operatingTime,jdbcType=TIMESTAMP},",
          "ORDER_PERSON = #{orderPerson,jdbcType=CHAR},",
          "ORDER_TIME = #{orderTime,jdbcType=TIMESTAMP},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MaterialReturningSlipBean record);
}