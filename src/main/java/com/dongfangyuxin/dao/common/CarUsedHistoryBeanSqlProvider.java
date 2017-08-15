package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBean;
import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBeanExample.Criteria;
import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBeanExample.Criterion;
import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBeanExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CarUsedHistoryBeanSqlProvider {

    public String countByExample(CarUsedHistoryBeanExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("car_used_history");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CarUsedHistoryBeanExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("car_used_history");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CarUsedHistoryBean record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("car_used_history");
        
        if (record.getCarNumber() != null) {
            sql.VALUES("CAR_NUMBER", "#{carNumber,jdbcType=CHAR}");
        }
        
        if (record.getTaskCode() != null) {
            sql.VALUES("TASK_CODE", "#{taskCode,jdbcType=CHAR}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("OPERATOR", "#{operator,jdbcType=CHAR}");
        }
        
        if (record.getUseTime() != null) {
            sql.VALUES("USE_TIME", "#{useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReturnTime() != null) {
            sql.VALUES("RETURN_TIME", "#{returnTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUseQuantity() != null) {
            sql.VALUES("USE_QUANTITY", "#{useQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getOdometer() != null) {
            sql.VALUES("ODOMETER", "#{odometer,jdbcType=INTEGER}");
        }
        
        if (record.getsCreator() != null) {
            sql.VALUES("S_CREATOR", "#{sCreator,jdbcType=CHAR}");
        }
        
        if (record.getsCreateDate() != null) {
            sql.VALUES("S_CREATE_DATE", "#{sCreateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getsOperator() != null) {
            sql.VALUES("S_OPERATOR", "#{sOperator,jdbcType=CHAR}");
        }
        
        if (record.getsOperatorDate() != null) {
            sql.VALUES("S_OPERATOR_DATE", "#{sOperatorDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CarUsedHistoryBeanExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("CAR_NUMBER");
        sql.SELECT("TASK_CODE");
        sql.SELECT("OPERATOR");
        sql.SELECT("USE_TIME");
        sql.SELECT("RETURN_TIME");
        sql.SELECT("USE_QUANTITY");
        sql.SELECT("REMARK");
        sql.SELECT("ODOMETER");
        sql.SELECT("S_CREATOR");
        sql.SELECT("S_CREATE_DATE");
        sql.SELECT("S_OPERATOR");
        sql.SELECT("S_OPERATOR_DATE");
        sql.FROM("car_used_history");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CarUsedHistoryBean record = (CarUsedHistoryBean) parameter.get("record");
        CarUsedHistoryBeanExample example = (CarUsedHistoryBeanExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("car_used_history");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCarNumber() != null) {
            sql.SET("CAR_NUMBER = #{record.carNumber,jdbcType=CHAR}");
        }
        
        if (record.getTaskCode() != null) {
            sql.SET("TASK_CODE = #{record.taskCode,jdbcType=CHAR}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("OPERATOR = #{record.operator,jdbcType=CHAR}");
        }
        
        if (record.getUseTime() != null) {
            sql.SET("USE_TIME = #{record.useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReturnTime() != null) {
            sql.SET("RETURN_TIME = #{record.returnTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUseQuantity() != null) {
            sql.SET("USE_QUANTITY = #{record.useQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getOdometer() != null) {
            sql.SET("ODOMETER = #{record.odometer,jdbcType=INTEGER}");
        }
        
        if (record.getsCreator() != null) {
            sql.SET("S_CREATOR = #{record.sCreator,jdbcType=CHAR}");
        }
        
        if (record.getsCreateDate() != null) {
            sql.SET("S_CREATE_DATE = #{record.sCreateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getsOperator() != null) {
            sql.SET("S_OPERATOR = #{record.sOperator,jdbcType=CHAR}");
        }
        
        if (record.getsOperatorDate() != null) {
            sql.SET("S_OPERATOR_DATE = #{record.sOperatorDate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("car_used_history");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("CAR_NUMBER = #{record.carNumber,jdbcType=CHAR}");
        sql.SET("TASK_CODE = #{record.taskCode,jdbcType=CHAR}");
        sql.SET("OPERATOR = #{record.operator,jdbcType=CHAR}");
        sql.SET("USE_TIME = #{record.useTime,jdbcType=TIMESTAMP}");
        sql.SET("RETURN_TIME = #{record.returnTime,jdbcType=TIMESTAMP}");
        sql.SET("USE_QUANTITY = #{record.useQuantity,jdbcType=INTEGER}");
        sql.SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("ODOMETER = #{record.odometer,jdbcType=INTEGER}");
        sql.SET("S_CREATOR = #{record.sCreator,jdbcType=CHAR}");
        sql.SET("S_CREATE_DATE = #{record.sCreateDate,jdbcType=TIMESTAMP}");
        sql.SET("S_OPERATOR = #{record.sOperator,jdbcType=CHAR}");
        sql.SET("S_OPERATOR_DATE = #{record.sOperatorDate,jdbcType=TIMESTAMP}");
        
        CarUsedHistoryBeanExample example = (CarUsedHistoryBeanExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CarUsedHistoryBean record) {
        SQL sql = new SQL();
        sql.UPDATE("car_used_history");
        
        if (record.getCarNumber() != null) {
            sql.SET("CAR_NUMBER = #{carNumber,jdbcType=CHAR}");
        }
        
        if (record.getTaskCode() != null) {
            sql.SET("TASK_CODE = #{taskCode,jdbcType=CHAR}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("OPERATOR = #{operator,jdbcType=CHAR}");
        }
        
        if (record.getUseTime() != null) {
            sql.SET("USE_TIME = #{useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReturnTime() != null) {
            sql.SET("RETURN_TIME = #{returnTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUseQuantity() != null) {
            sql.SET("USE_QUANTITY = #{useQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getOdometer() != null) {
            sql.SET("ODOMETER = #{odometer,jdbcType=INTEGER}");
        }
        
        if (record.getsCreator() != null) {
            sql.SET("S_CREATOR = #{sCreator,jdbcType=CHAR}");
        }
        
        if (record.getsCreateDate() != null) {
            sql.SET("S_CREATE_DATE = #{sCreateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getsOperator() != null) {
            sql.SET("S_OPERATOR = #{sOperator,jdbcType=CHAR}");
        }
        
        if (record.getsOperatorDate() != null) {
            sql.SET("S_OPERATOR_DATE = #{sOperatorDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CarUsedHistoryBeanExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}