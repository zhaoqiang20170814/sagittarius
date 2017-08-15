package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.InventoryInfoBean;
import com.dongfangyuxin.dao.common.bean.InventoryInfoBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface InventoryInfoBeanMapper {
    @SelectProvider(type=InventoryInfoBeanSqlProvider.class, method="countByExample")
    long countByExample(InventoryInfoBeanExample example);

    @DeleteProvider(type=InventoryInfoBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(InventoryInfoBeanExample example);

    @Delete({
        "delete from inventory_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into inventory_info (MATERIAL_CODE, QUANTITY, ",
        "AMOUNT, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{materialCode,jdbcType=CHAR}, #{quantity,jdbcType=INTEGER}, ",
        "#{amount,jdbcType=DECIMAL}, #{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(InventoryInfoBean record);

    @InsertProvider(type=InventoryInfoBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(InventoryInfoBean record);

    @SelectProvider(type=InventoryInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MATERIAL_CODE", property="materialCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<InventoryInfoBean> selectByExampleWithRowbounds(InventoryInfoBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=InventoryInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MATERIAL_CODE", property="materialCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<InventoryInfoBean> selectByExample(InventoryInfoBeanExample example);

    @Select({
        "select",
        "ID, MATERIAL_CODE, QUANTITY, AMOUNT, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from inventory_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MATERIAL_CODE", property="materialCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    InventoryInfoBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=InventoryInfoBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InventoryInfoBean record, @Param("example") InventoryInfoBeanExample example);

    @UpdateProvider(type=InventoryInfoBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InventoryInfoBean record, @Param("example") InventoryInfoBeanExample example);

    @UpdateProvider(type=InventoryInfoBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(InventoryInfoBean record);

    @Update({
        "update inventory_info",
        "set MATERIAL_CODE = #{materialCode,jdbcType=CHAR},",
          "QUANTITY = #{quantity,jdbcType=INTEGER},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(InventoryInfoBean record);
}