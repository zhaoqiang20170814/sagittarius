package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.AttendanceInfoBean;
import com.dongfangyuxin.common.dao.bean.AttendanceInfoBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface AttendanceInfoBeanMapper {
    @SelectProvider(type=AttendanceInfoBeanSqlProvider.class, method="countByExample")
    long countByExample(AttendanceInfoBeanExample example);

    @DeleteProvider(type=AttendanceInfoBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(AttendanceInfoBeanExample example);

    @Delete({
        "delete from attendance_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into attendance_info (STAFF_CODE, START_TIME, ",
        "END_TIME, S_CREATOR, ",
        "S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE)",
        "values (#{staffCode,jdbcType=CHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{sCreator,jdbcType=CHAR}, ",
        "#{sCreateDate,jdbcType=TIMESTAMP}, #{sOperator,jdbcType=CHAR}, ",
        "#{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AttendanceInfoBean record);

    @InsertProvider(type=AttendanceInfoBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(AttendanceInfoBean record);

    @SelectProvider(type=AttendanceInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STAFF_CODE", property="staffCode", jdbcType=JdbcType.CHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="END_TIME", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AttendanceInfoBean> selectByExampleWithRowbounds(AttendanceInfoBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=AttendanceInfoBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STAFF_CODE", property="staffCode", jdbcType=JdbcType.CHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="END_TIME", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AttendanceInfoBean> selectByExample(AttendanceInfoBeanExample example);

    @Select({
        "select",
        "ID, STAFF_CODE, START_TIME, END_TIME, S_CREATOR, S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE",
        "from attendance_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="STAFF_CODE", property="staffCode", jdbcType=JdbcType.CHAR),
        @Result(column="START_TIME", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="END_TIME", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    AttendanceInfoBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AttendanceInfoBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AttendanceInfoBean record, @Param("example") AttendanceInfoBeanExample example);

    @UpdateProvider(type=AttendanceInfoBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AttendanceInfoBean record, @Param("example") AttendanceInfoBeanExample example);

    @UpdateProvider(type=AttendanceInfoBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AttendanceInfoBean record);

    @Update({
        "update attendance_info",
        "set STAFF_CODE = #{staffCode,jdbcType=CHAR},",
          "START_TIME = #{startTime,jdbcType=TIMESTAMP},",
          "END_TIME = #{endTime,jdbcType=TIMESTAMP},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AttendanceInfoBean record);
}