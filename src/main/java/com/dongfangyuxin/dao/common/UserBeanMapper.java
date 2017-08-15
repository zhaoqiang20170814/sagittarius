package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.UserBean;
import com.dongfangyuxin.dao.common.bean.UserBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserBeanMapper {
    @SelectProvider(type=UserBeanSqlProvider.class, method="countByExample")
    long countByExample(UserBeanExample example);

    @DeleteProvider(type=UserBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserBeanExample example);

    @Delete({
        "delete from user",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (CODE, NAME, ",
        "SEX, AGE, POST, ",
        "DEPARTMENT, CONTACT, ",
        "ID_NUMBER, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=CHAR}, #{age,jdbcType=INTEGER}, #{post,jdbcType=CHAR}, ",
        "#{department,jdbcType=CHAR}, #{contact,jdbcType=VARCHAR}, ",
        "#{idNumber,jdbcType=CHAR}, #{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UserBean record);

    @InsertProvider(type=UserBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(UserBean record);

    @SelectProvider(type=UserBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="POST", property="post", jdbcType=JdbcType.CHAR),
        @Result(column="DEPARTMENT", property="department", jdbcType=JdbcType.CHAR),
        @Result(column="CONTACT", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID_NUMBER", property="idNumber", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserBean> selectByExampleWithRowbounds(UserBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=UserBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="POST", property="post", jdbcType=JdbcType.CHAR),
        @Result(column="DEPARTMENT", property="department", jdbcType=JdbcType.CHAR),
        @Result(column="CONTACT", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID_NUMBER", property="idNumber", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserBean> selectByExample(UserBeanExample example);

    @Select({
        "select",
        "ID, CODE, NAME, SEX, AGE, POST, DEPARTMENT, CONTACT, ID_NUMBER, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE",
        "from user",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.CHAR),
        @Result(column="AGE", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="POST", property="post", jdbcType=JdbcType.CHAR),
        @Result(column="DEPARTMENT", property="department", jdbcType=JdbcType.CHAR),
        @Result(column="CONTACT", property="contact", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID_NUMBER", property="idNumber", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    UserBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    @UpdateProvider(type=UserBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    @UpdateProvider(type=UserBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserBean record);

    @Update({
        "update user",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "SEX = #{sex,jdbcType=CHAR},",
          "AGE = #{age,jdbcType=INTEGER},",
          "POST = #{post,jdbcType=CHAR},",
          "DEPARTMENT = #{department,jdbcType=CHAR},",
          "CONTACT = #{contact,jdbcType=VARCHAR},",
          "ID_NUMBER = #{idNumber,jdbcType=CHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserBean record);
}