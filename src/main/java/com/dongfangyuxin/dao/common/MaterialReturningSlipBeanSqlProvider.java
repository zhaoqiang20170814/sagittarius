package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.MaterialReturningSlipBean;
import com.dongfangyuxin.dao.common.bean.MaterialReturningSlipBeanExample.Criteria;
import com.dongfangyuxin.dao.common.bean.MaterialReturningSlipBeanExample.Criterion;
import com.dongfangyuxin.dao.common.bean.MaterialReturningSlipBeanExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MaterialReturningSlipBeanSqlProvider {

    public String countByExample(MaterialReturningSlipBeanExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("material_returning_slip");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MaterialReturningSlipBeanExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("material_returning_slip");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MaterialReturningSlipBean record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("material_returning_slip");
        
        if (record.getCode() != null) {
            sql.VALUES("CODE", "#{code,jdbcType=CHAR}");
        }
        
        if (record.getTaskCode() != null) {
            sql.VALUES("TASK_CODE", "#{taskCode,jdbcType=CHAR}");
        }
        
        if (record.getCount() != null) {
            sql.VALUES("COUNT", "#{count,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("OPERATOR", "#{operator,jdbcType=CHAR}");
        }
        
        if (record.getOperatingTime() != null) {
            sql.VALUES("OPERATING_TIME", "#{operatingTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderPerson() != null) {
            sql.VALUES("ORDER_PERSON", "#{orderPerson,jdbcType=CHAR}");
        }
        
        if (record.getOrderTime() != null) {
            sql.VALUES("ORDER_TIME", "#{orderTime,jdbcType=TIMESTAMP}");
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

    public String selectByExample(MaterialReturningSlipBeanExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("CODE");
        sql.SELECT("TASK_CODE");
        sql.SELECT("COUNT");
        sql.SELECT("OPERATOR");
        sql.SELECT("OPERATING_TIME");
        sql.SELECT("ORDER_PERSON");
        sql.SELECT("ORDER_TIME");
        sql.SELECT("S_CREATOR");
        sql.SELECT("S_CREATE_DATE");
        sql.SELECT("S_OPERATOR");
        sql.SELECT("S_OPERATOR_DATE");
        sql.FROM("material_returning_slip");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MaterialReturningSlipBean record = (MaterialReturningSlipBean) parameter.get("record");
        MaterialReturningSlipBeanExample example = (MaterialReturningSlipBeanExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("material_returning_slip");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.SET("CODE = #{record.code,jdbcType=CHAR}");
        }
        
        if (record.getTaskCode() != null) {
            sql.SET("TASK_CODE = #{record.taskCode,jdbcType=CHAR}");
        }
        
        if (record.getCount() != null) {
            sql.SET("COUNT = #{record.count,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("OPERATOR = #{record.operator,jdbcType=CHAR}");
        }
        
        if (record.getOperatingTime() != null) {
            sql.SET("OPERATING_TIME = #{record.operatingTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderPerson() != null) {
            sql.SET("ORDER_PERSON = #{record.orderPerson,jdbcType=CHAR}");
        }
        
        if (record.getOrderTime() != null) {
            sql.SET("ORDER_TIME = #{record.orderTime,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("material_returning_slip");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("CODE = #{record.code,jdbcType=CHAR}");
        sql.SET("TASK_CODE = #{record.taskCode,jdbcType=CHAR}");
        sql.SET("COUNT = #{record.count,jdbcType=INTEGER}");
        sql.SET("OPERATOR = #{record.operator,jdbcType=CHAR}");
        sql.SET("OPERATING_TIME = #{record.operatingTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_PERSON = #{record.orderPerson,jdbcType=CHAR}");
        sql.SET("ORDER_TIME = #{record.orderTime,jdbcType=TIMESTAMP}");
        sql.SET("S_CREATOR = #{record.sCreator,jdbcType=CHAR}");
        sql.SET("S_CREATE_DATE = #{record.sCreateDate,jdbcType=TIMESTAMP}");
        sql.SET("S_OPERATOR = #{record.sOperator,jdbcType=CHAR}");
        sql.SET("S_OPERATOR_DATE = #{record.sOperatorDate,jdbcType=TIMESTAMP}");
        
        MaterialReturningSlipBeanExample example = (MaterialReturningSlipBeanExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MaterialReturningSlipBean record) {
        SQL sql = new SQL();
        sql.UPDATE("material_returning_slip");
        
        if (record.getCode() != null) {
            sql.SET("CODE = #{code,jdbcType=CHAR}");
        }
        
        if (record.getTaskCode() != null) {
            sql.SET("TASK_CODE = #{taskCode,jdbcType=CHAR}");
        }
        
        if (record.getCount() != null) {
            sql.SET("COUNT = #{count,jdbcType=INTEGER}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("OPERATOR = #{operator,jdbcType=CHAR}");
        }
        
        if (record.getOperatingTime() != null) {
            sql.SET("OPERATING_TIME = #{operatingTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderPerson() != null) {
            sql.SET("ORDER_PERSON = #{orderPerson,jdbcType=CHAR}");
        }
        
        if (record.getOrderTime() != null) {
            sql.SET("ORDER_TIME = #{orderTime,jdbcType=TIMESTAMP}");
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

    protected void applyWhere(SQL sql, MaterialReturningSlipBeanExample example, boolean includeExamplePhrase) {
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