package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.MaterialRequisitionDetailBean;
import com.dongfangyuxin.common.dao.bean.MaterialRequisitionDetailBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface MaterialRequisitionDetailBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @SelectProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="countByExample")
    long countByExample(MaterialRequisitionDetailBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @DeleteProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialRequisitionDetailBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @Delete({
        "delete from material_requisition_detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @Insert({
        "insert into material_requisition_detail (CODE, TASK_CODE, ",
        "QUANTITY, AMOUNT, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{code,jdbcType=CHAR}, #{taskCode,jdbcType=CHAR}, ",
        "#{quantity,jdbcType=INTEGER}, #{amount,jdbcType=DECIMAL}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MaterialRequisitionDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @InsertProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MaterialRequisitionDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @SelectProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MaterialRequisitionDetailBean> selectByExample(MaterialRequisitionDetailBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @Select({
        "select",
        "ID, CODE, TASK_CODE, QUANTITY, AMOUNT, S_CREATOR, S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE",
        "from material_requisition_detail",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MaterialRequisitionDetailBean selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @UpdateProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialRequisitionDetailBean record, @Param("example") MaterialRequisitionDetailBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @UpdateProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialRequisitionDetailBean record, @Param("example") MaterialRequisitionDetailBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @UpdateProvider(type=MaterialRequisitionDetailBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialRequisitionDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_requisition_detail
     *
     * @mbg.generated Sat Jul 22 22:38:45 CST 2017
     */
    @Update({
        "update material_requisition_detail",
        "set CODE = #{code,jdbcType=CHAR},",
          "TASK_CODE = #{taskCode,jdbcType=CHAR},",
          "QUANTITY = #{quantity,jdbcType=INTEGER},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MaterialRequisitionDetailBean record);
}