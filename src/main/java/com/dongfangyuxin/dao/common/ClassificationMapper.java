package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.Classification;
import com.dongfangyuxin.dao.common.bean.ClassificationExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface ClassificationMapper {
    @SelectProvider(type=ClassificationSqlProvider.class, method="countByExample")
    long countByExample(ClassificationExample example);

    @DeleteProvider(type=ClassificationSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClassificationExample example);

    @Delete({
        "delete from classification",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into classification (CODE, NAME, ",
        "PARENT, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{parent,jdbcType=CHAR}, #{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Classification record);

    @InsertProvider(type=ClassificationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Classification record);

    @SelectProvider(type=ClassificationSqlProvider.class, method="selectByExample")
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
    List<Classification> selectByExampleWithRowbounds(ClassificationExample example, RowBounds rowBounds);

    @SelectProvider(type=ClassificationSqlProvider.class, method="selectByExample")
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
    List<Classification> selectByExample(ClassificationExample example);

    @Select({
        "select",
        "ID, CODE, NAME, PARENT, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from classification",
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
    Classification selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClassificationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    @UpdateProvider(type=ClassificationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    @UpdateProvider(type=ClassificationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Classification record);

    @Update({
        "update classification",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "PARENT = #{parent,jdbcType=CHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Classification record);
}