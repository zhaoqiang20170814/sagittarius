package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.MaterialRequisitionBean;
import com.dongfangyuxin.dao.common.bean.MaterialRequisitionBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface MaterialRequisitionBeanMapper {
    @SelectProvider(type=MaterialRequisitionBeanSqlProvider.class, method="countByExample")
    long countByExample(MaterialRequisitionBeanExample example);

    @DeleteProvider(type=MaterialRequisitionBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialRequisitionBeanExample example);

    @Delete({
        "delete from material_requisition",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into material_requisition (CODE, TASK_CODE, ",
        "COUNT, OPERATOR, OPERATING_TIME, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{taskCode,jdbcType=CHAR}, ",
        "#{count,jdbcType=INTEGER}, #{operator,jdbcType=CHAR}, #{operatingTime,jdbcType=TIMESTAMP}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MaterialRequisitionBean record);

    @InsertProvider(type=MaterialRequisitionBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MaterialRequisitionBean record);

    @SelectProvider(type=MaterialRequisitionBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATING_TIME", property="operatingTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialRequisitionBean> selectByExampleWithRowbounds(MaterialRequisitionBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=MaterialRequisitionBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATING_TIME", property="operatingTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialRequisitionBean> selectByExample(MaterialRequisitionBeanExample example);

    @Select({
        "select",
        "ID, CODE, TASK_CODE, COUNT, OPERATOR, OPERATING_TIME, S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE",
        "from material_requisition",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATING_TIME", property="operatingTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MaterialRequisitionBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MaterialRequisitionBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialRequisitionBean record, @Param("example") MaterialRequisitionBeanExample example);

    @UpdateProvider(type=MaterialRequisitionBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialRequisitionBean record, @Param("example") MaterialRequisitionBeanExample example);

    @UpdateProvider(type=MaterialRequisitionBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialRequisitionBean record);

    @Update({
        "update material_requisition",
        "set CODE = #{code,jdbcType=CHAR},",
          "TASK_CODE = #{taskCode,jdbcType=CHAR},",
          "COUNT = #{count,jdbcType=INTEGER},",
          "OPERATOR = #{operator,jdbcType=CHAR},",
          "OPERATING_TIME = #{operatingTime,jdbcType=TIMESTAMP},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MaterialRequisitionBean record);
}