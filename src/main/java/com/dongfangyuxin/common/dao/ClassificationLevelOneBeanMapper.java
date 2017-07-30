package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.ClassificationLevelOneBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelOneBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ClassificationLevelOneBeanMapper {
    @SelectProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="countByExample")
    long countByExample(ClassificationLevelOneBeanExample example);

    @DeleteProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClassificationLevelOneBeanExample example);

    @Delete({
        "delete from classification_level_1",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into classification_level_1 (CODE, NAME, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ClassificationLevelOneBean record);

    @InsertProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ClassificationLevelOneBean record);

    @SelectProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ClassificationLevelOneBean> selectByExampleWithRowbounds(ClassificationLevelOneBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ClassificationLevelOneBean> selectByExample(ClassificationLevelOneBeanExample example);

    @Select({
        "select",
        "ID, CODE, NAME, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from classification_level_1",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ClassificationLevelOneBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClassificationLevelOneBean record, @Param("example") ClassificationLevelOneBeanExample example);

    @UpdateProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClassificationLevelOneBean record, @Param("example") ClassificationLevelOneBeanExample example);

    @UpdateProvider(type=ClassificationLevelOneBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClassificationLevelOneBean record);

    @Update({
        "update classification_level_1",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClassificationLevelOneBean record);
}