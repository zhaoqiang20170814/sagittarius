package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.DataDicBean;
import com.dongfangyuxin.dao.common.bean.DataDicBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DataDicBeanMapper {
    @SelectProvider(type=DataDicBeanSqlProvider.class, method="countByExample")
    long countByExample(DataDicBeanExample example);

    @DeleteProvider(type=DataDicBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(DataDicBeanExample example);

    @Delete({
        "delete from data_dic",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into data_dic (DICT_TYPE, DICT_TYPE_NAME, ",
        "DICT_CODE, DICT_CODE_NAME, ",
        "STATUS, SEQUENCE, S_CREATOR, ",
        "S_CREATE_DATE, S_OPERATOR, ",
        "S_OPERATOR_DATE)",
        "values (#{dictType,jdbcType=VARCHAR}, #{dictTypeName,jdbcType=VARCHAR}, ",
        "#{dictCode,jdbcType=VARCHAR}, #{dictCodeName,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=CHAR}, #{sequence,jdbcType=INTEGER}, #{sCreator,jdbcType=CHAR}, ",
        "#{sCreateDate,jdbcType=TIMESTAMP}, #{sOperator,jdbcType=CHAR}, ",
        "#{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(DataDicBean record);

    @InsertProvider(type=DataDicBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(DataDicBean record);

    @SelectProvider(type=DataDicBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DICT_TYPE", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_TYPE_NAME", property="dictTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_CODE", property="dictCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_CODE_NAME", property="dictCodeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="SEQUENCE", property="sequence", jdbcType=JdbcType.INTEGER),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DataDicBean> selectByExampleWithRowbounds(DataDicBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=DataDicBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DICT_TYPE", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_TYPE_NAME", property="dictTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_CODE", property="dictCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_CODE_NAME", property="dictCodeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="SEQUENCE", property="sequence", jdbcType=JdbcType.INTEGER),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DataDicBean> selectByExample(DataDicBeanExample example);

    @Select({
        "select",
        "ID, DICT_TYPE, DICT_TYPE_NAME, DICT_CODE, DICT_CODE_NAME, STATUS, SEQUENCE, ",
        "S_CREATOR, S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from data_dic",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DICT_TYPE", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_TYPE_NAME", property="dictTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_CODE", property="dictCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DICT_CODE_NAME", property="dictCodeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="SEQUENCE", property="sequence", jdbcType=JdbcType.INTEGER),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    DataDicBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=DataDicBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DataDicBean record, @Param("example") DataDicBeanExample example);

    @UpdateProvider(type=DataDicBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DataDicBean record, @Param("example") DataDicBeanExample example);

    @UpdateProvider(type=DataDicBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DataDicBean record);

    @Update({
        "update data_dic",
        "set DICT_TYPE = #{dictType,jdbcType=VARCHAR},",
          "DICT_TYPE_NAME = #{dictTypeName,jdbcType=VARCHAR},",
          "DICT_CODE = #{dictCode,jdbcType=VARCHAR},",
          "DICT_CODE_NAME = #{dictCodeName,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=CHAR},",
          "SEQUENCE = #{sequence,jdbcType=INTEGER},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DataDicBean record);
}