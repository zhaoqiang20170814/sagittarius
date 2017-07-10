package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.UserBean;
import com.dongfangyuxin.common.dao.bean.UserBeanExample;
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
import org.apache.ibatis.type.JdbcType;

public interface UserBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @SelectProvider(type=UserBeanSqlProvider.class, method="countByExample")
    long countByExample(UserBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @DeleteProvider(type=UserBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @Delete({
        "delete from sagittarius..user",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @Insert({
        "insert into sagittarius..user (CODE, NAME, ",
        "SEX, AGE, POST, ",
        "DEPARTMENT, CONTACT, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=CHAR}, #{age,jdbcType=INTEGER}, #{post,jdbcType=CHAR}, ",
        "#{department,jdbcType=CHAR}, #{contact,jdbcType=VARCHAR}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UserBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @InsertProvider(type=UserBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(UserBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
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
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserBean> selectByExample(UserBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @Select({
        "select",
        "ID, CODE, NAME, SEX, AGE, POST, DEPARTMENT, CONTACT, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE",
        "from sagittarius..user",
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
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    UserBean selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @UpdateProvider(type=UserBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @UpdateProvider(type=UserBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @UpdateProvider(type=UserBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sagittarius..user
     *
     * @mbg.generated Tue Jul 11 00:06:29 CST 2017
     */
    @Update({
        "update sagittarius..user",
        "set CODE = #{code,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "SEX = #{sex,jdbcType=CHAR},",
          "AGE = #{age,jdbcType=INTEGER},",
          "POST = #{post,jdbcType=CHAR},",
          "DEPARTMENT = #{department,jdbcType=CHAR},",
          "CONTACT = #{contact,jdbcType=VARCHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserBean record);
}