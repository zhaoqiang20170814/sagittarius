package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface MaterialBeanMapper {
    @SelectProvider(type=MaterialBeanSqlProvider.class, method="countByExample")
    long countByExample(MaterialBeanExample example);

    @DeleteProvider(type=MaterialBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialBeanExample example);

    @Delete({
        "delete from material",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into material (CODE, NAME, ",
        "TYPE, UNIT, PRICE, ",
        "IMAGE, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=CHAR}, #{unit,jdbcType=CHAR}, #{price,jdbcType=DECIMAL}, ",
        "#{image,jdbcType=VARCHAR}, #{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MaterialBean record);

    @InsertProvider(type=MaterialBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MaterialBean record);

    @SelectProvider(type=MaterialBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="UNIT", property="unit", jdbcType=JdbcType.CHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="IMAGE", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialBean> selectByExampleWithRowbounds(MaterialBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=MaterialBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="UNIT", property="unit", jdbcType=JdbcType.CHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="IMAGE", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialBean> selectByExample(MaterialBeanExample example);

    @Select({
        "select",
        "ID, CODE, NAME, TYPE, UNIT, PRICE, IMAGE, S_CREATOR, S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE",
        "from material",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.CHAR),
        @Result(column="UNIT", property="unit", jdbcType=JdbcType.CHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="IMAGE", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MaterialBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MaterialBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialBean record, @Param("example") MaterialBeanExample example);

    @UpdateProvider(type=MaterialBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialBean record, @Param("example") MaterialBeanExample example);

    @UpdateProvider(type=MaterialBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialBean record);

    @Update({
        "update material",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "TYPE = #{type,jdbcType=CHAR},",
          "UNIT = #{unit,jdbcType=CHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "IMAGE = #{image,jdbcType=VARCHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MaterialBean record);
}