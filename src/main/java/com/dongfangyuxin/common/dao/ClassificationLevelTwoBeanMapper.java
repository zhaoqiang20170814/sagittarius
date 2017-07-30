package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ClassificationLevelTwoBeanMapper {
    @SelectProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="countByExample")
    long countByExample(ClassificationLevelTwoBeanExample example);

    @DeleteProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClassificationLevelTwoBeanExample example);

    @Delete({
        "delete from classification_level_2",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into classification_level_2 (CODE, NAME, ",
        "PARENT, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{parent,jdbcType=CHAR}, #{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ClassificationLevelTwoBean record);

    @InsertProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ClassificationLevelTwoBean record);

    @SelectProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT", property="parent", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ClassificationLevelTwoBean> selectByExampleWithRowbounds(ClassificationLevelTwoBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT", property="parent", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ClassificationLevelTwoBean> selectByExample(ClassificationLevelTwoBeanExample example);

    @Select({
        "select",
        "ID, CODE, NAME, PARENT, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from classification_level_2",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT", property="parent", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ClassificationLevelTwoBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClassificationLevelTwoBean record, @Param("example") ClassificationLevelTwoBeanExample example);

    @UpdateProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClassificationLevelTwoBean record, @Param("example") ClassificationLevelTwoBeanExample example);

    @UpdateProvider(type=ClassificationLevelTwoBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClassificationLevelTwoBean record);

    @Update({
        "update classification_level_2",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "PARENT = #{parent,jdbcType=CHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClassificationLevelTwoBean record);
}