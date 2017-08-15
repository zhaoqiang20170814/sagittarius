package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.ProjectDrawingBean;
import com.dongfangyuxin.dao.common.bean.ProjectDrawingBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ProjectDrawingBeanMapper {
    @SelectProvider(type=ProjectDrawingBeanSqlProvider.class, method="countByExample")
    long countByExample(ProjectDrawingBeanExample example);

    @DeleteProvider(type=ProjectDrawingBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProjectDrawingBeanExample example);

    @Delete({
        "delete from project_drawing",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into project_drawing (PROJECT_CODE, CODE, ",
        "NAME, URL, S_CREATOR, ",
        "S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE)",
        "values (#{projectCode,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{sCreator,jdbcType=CHAR}, ",
        "#{sCreateDate,jdbcType=TIMESTAMP}, #{sOperator,jdbcType=CHAR}, ",
        "#{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(ProjectDrawingBean record);

    @InsertProvider(type=ProjectDrawingBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(ProjectDrawingBean record);

    @SelectProvider(type=ProjectDrawingBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECT_CODE", property="projectCode", jdbcType=JdbcType.INTEGER),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProjectDrawingBean> selectByExampleWithRowbounds(ProjectDrawingBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=ProjectDrawingBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECT_CODE", property="projectCode", jdbcType=JdbcType.INTEGER),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProjectDrawingBean> selectByExample(ProjectDrawingBeanExample example);

    @Select({
        "select",
        "ID, PROJECT_CODE, CODE, NAME, URL, S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from project_drawing",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECT_CODE", property="projectCode", jdbcType=JdbcType.INTEGER),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    ProjectDrawingBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ProjectDrawingBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProjectDrawingBean record, @Param("example") ProjectDrawingBeanExample example);

    @UpdateProvider(type=ProjectDrawingBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProjectDrawingBean record, @Param("example") ProjectDrawingBeanExample example);

    @UpdateProvider(type=ProjectDrawingBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProjectDrawingBean record);

    @Update({
        "update project_drawing",
        "set PROJECT_CODE = #{projectCode,jdbcType=INTEGER},",
          "CODE = #{code,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "URL = #{url,jdbcType=VARCHAR},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectDrawingBean record);
}