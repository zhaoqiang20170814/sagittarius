package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelTwoBean;
import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelTwoBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface MaterialTypeLevelTwoBeanMapper {
    @SelectProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="countByExample")
    long countByExample(MaterialTypeLevelTwoBeanExample example);

    @DeleteProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialTypeLevelTwoBeanExample example);

    @Delete({
        "delete from material_type_level_2",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into material_type_level_2 (CODE, NAME, ",
        "PARENT, REMARK, S_CREATOR, ",
        "S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{parent,jdbcType=CHAR}, #{remark,jdbcType=VARCHAR}, #{sCreator,jdbcType=CHAR}, ",
        "#{sCreateDate,jdbcType=TIMESTAMP}, #{sOperator,jdbcType=CHAR}, ",
        "#{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MaterialTypeLevelTwoBean record);

    @InsertProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MaterialTypeLevelTwoBean record);

    @SelectProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT", property="parent", jdbcType=JdbcType.CHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialTypeLevelTwoBean> selectByExampleWithRowbounds(MaterialTypeLevelTwoBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT", property="parent", jdbcType=JdbcType.CHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialTypeLevelTwoBean> selectByExample(MaterialTypeLevelTwoBeanExample example);

    @Select({
        "select",
        "ID, CODE, NAME, PARENT, REMARK, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from material_type_level_2",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT", property="parent", jdbcType=JdbcType.CHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MaterialTypeLevelTwoBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialTypeLevelTwoBean record, @Param("example") MaterialTypeLevelTwoBeanExample example);

    @UpdateProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialTypeLevelTwoBean record, @Param("example") MaterialTypeLevelTwoBeanExample example);

    @UpdateProvider(type=MaterialTypeLevelTwoBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialTypeLevelTwoBean record);

    @Update({
        "update material_type_level_2",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "PARENT = #{parent,jdbcType=CHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MaterialTypeLevelTwoBean record);
}