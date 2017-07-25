package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.CarUsedHistoryBean;
import com.dongfangyuxin.common.dao.bean.CarUsedHistoryBeanExample;
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
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface CarUsedHistoryBeanMapper {
    @SelectProvider(type=CarUsedHistoryBeanSqlProvider.class, method="countByExample")
    long countByExample(CarUsedHistoryBeanExample example);

    @DeleteProvider(type=CarUsedHistoryBeanSqlProvider.class, method="deleteByExample")
    int deleteByExample(CarUsedHistoryBeanExample example);

    @Delete({
        "delete from car_used_history",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into car_used_history (CAR_NUMBER, TASK_CODE, ",
        "OPERATOR, USE_TIME, ",
        "RETURN_TIME, USE_QUANTITY, ",
        "S_CREATOR, S_CREATE_DATE, ",
        "S_OPERATOR, S_OPERATOR_DATE)",
        "values (#{carNumber,jdbcType=CHAR}, #{taskCode,jdbcType=CHAR}, ",
        "#{operator,jdbcType=CHAR}, #{useTime,jdbcType=TIMESTAMP}, ",
        "#{returnTime,jdbcType=TIMESTAMP}, #{useQuantity,jdbcType=INTEGER}, ",
        "#{sCreator,jdbcType=CHAR}, #{sCreateDate,jdbcType=TIMESTAMP}, ",
        "#{sOperator,jdbcType=CHAR}, #{sOperatorDate,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CarUsedHistoryBean record);

    @InsertProvider(type=CarUsedHistoryBeanSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(CarUsedHistoryBean record);

    @SelectProvider(type=CarUsedHistoryBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CAR_NUMBER", property="carNumber", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="USE_TIME", property="useTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RETURN_TIME", property="returnTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USE_QUANTITY", property="useQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CarUsedHistoryBean> selectByExampleWithRowbounds(CarUsedHistoryBeanExample example, RowBounds rowBounds);

    @SelectProvider(type=CarUsedHistoryBeanSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CAR_NUMBER", property="carNumber", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="USE_TIME", property="useTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RETURN_TIME", property="returnTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USE_QUANTITY", property="useQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CarUsedHistoryBean> selectByExample(CarUsedHistoryBeanExample example);

    @Select({
        "select",
        "ID, CAR_NUMBER, TASK_CODE, OPERATOR, USE_TIME, RETURN_TIME, USE_QUANTITY, S_CREATOR, ",
        "S_CREATE_DATE, S_OPERATOR, S_OPERATOR_DATE",
        "from car_used_history",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CAR_NUMBER", property="carNumber", jdbcType=JdbcType.CHAR),
        @Result(column="TASK_CODE", property="taskCode", jdbcType=JdbcType.CHAR),
        @Result(column="OPERATOR", property="operator", jdbcType=JdbcType.CHAR),
        @Result(column="USE_TIME", property="useTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RETURN_TIME", property="returnTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USE_QUANTITY", property="useQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="S_CREATOR", property="sCreator", jdbcType=JdbcType.CHAR),
        @Result(column="S_CREATE_DATE", property="sCreateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="S_OPERATOR", property="sOperator", jdbcType=JdbcType.CHAR),
        @Result(column="S_OPERATOR_DATE", property="sOperatorDate", jdbcType=JdbcType.TIMESTAMP)
    })
    CarUsedHistoryBean selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CarUsedHistoryBeanSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CarUsedHistoryBean record, @Param("example") CarUsedHistoryBeanExample example);

    @UpdateProvider(type=CarUsedHistoryBeanSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CarUsedHistoryBean record, @Param("example") CarUsedHistoryBeanExample example);

    @UpdateProvider(type=CarUsedHistoryBeanSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CarUsedHistoryBean record);

    @Update({
        "update car_used_history",
        "set CAR_NUMBER = #{carNumber,jdbcType=CHAR},",
          "TASK_CODE = #{taskCode,jdbcType=CHAR},",
          "OPERATOR = #{operator,jdbcType=CHAR},",
          "USE_TIME = #{useTime,jdbcType=TIMESTAMP},",
          "RETURN_TIME = #{returnTime,jdbcType=TIMESTAMP},",
          "USE_QUANTITY = #{useQuantity,jdbcType=INTEGER},",
          "S_CREATOR = #{sCreator,jdbcType=CHAR},",
          "S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP},",
          "S_OPERATOR = #{sOperator,jdbcType=CHAR},",
          "S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CarUsedHistoryBean record);
}