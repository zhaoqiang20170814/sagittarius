package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.UserBean;
import com.dongfangyuxin.dao.common.bean.UserBeanExample.Criteria;
import com.dongfangyuxin.dao.common.bean.UserBeanExample.Criterion;
import com.dongfangyuxin.dao.common.bean.UserBeanExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserBeanSqlProvider {

    public String countByExample(UserBeanExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserBeanExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserBean record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getCode() != null) {
            sql.VALUES("CODE", "#{code,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("SEX", "#{sex,jdbcType=CHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("AGE", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getPost() != null) {
            sql.VALUES("POST", "#{post,jdbcType=CHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.VALUES("DEPARTMENT", "#{department,jdbcType=CHAR}");
        }
        
        if (record.getContact() != null) {
            sql.VALUES("CONTACT", "#{contact,jdbcType=VARCHAR}");
        }
        
        if (record.getIdNumber() != null) {
            sql.VALUES("ID_NUMBER", "#{idNumber,jdbcType=CHAR}");
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

    public String selectByExample(UserBeanExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("CODE");
        sql.SELECT("NAME");
        sql.SELECT("SEX");
        sql.SELECT("AGE");
        sql.SELECT("POST");
        sql.SELECT("DEPARTMENT");
        sql.SELECT("CONTACT");
        sql.SELECT("ID_NUMBER");
        sql.SELECT("S_CREATOR");
        sql.SELECT("S_CREATE_DATE");
        sql.SELECT("S_OPERATOR");
        sql.SELECT("S_OPERATOR_DATE");
        sql.FROM("user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserBean record = (UserBean) parameter.get("record");
        UserBeanExample example = (UserBeanExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.SET("CODE = #{record.code,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("SEX = #{record.sex,jdbcType=CHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("AGE = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getPost() != null) {
            sql.SET("POST = #{record.post,jdbcType=CHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.SET("DEPARTMENT = #{record.department,jdbcType=CHAR}");
        }
        
        if (record.getContact() != null) {
            sql.SET("CONTACT = #{record.contact,jdbcType=VARCHAR}");
        }
        
        if (record.getIdNumber() != null) {
            sql.SET("ID_NUMBER = #{record.idNumber,jdbcType=CHAR}");
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
        sql.UPDATE("user");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("CODE = #{record.code,jdbcType=CHAR}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("SEX = #{record.sex,jdbcType=CHAR}");
        sql.SET("AGE = #{record.age,jdbcType=INTEGER}");
        sql.SET("POST = #{record.post,jdbcType=CHAR}");
        sql.SET("DEPARTMENT = #{record.department,jdbcType=CHAR}");
        sql.SET("CONTACT = #{record.contact,jdbcType=VARCHAR}");
        sql.SET("ID_NUMBER = #{record.idNumber,jdbcType=CHAR}");
        sql.SET("S_CREATOR = #{record.sCreator,jdbcType=CHAR}");
        sql.SET("S_CREATE_DATE = #{record.sCreateDate,jdbcType=TIMESTAMP}");
        sql.SET("S_OPERATOR = #{record.sOperator,jdbcType=CHAR}");
        sql.SET("S_OPERATOR_DATE = #{record.sOperatorDate,jdbcType=TIMESTAMP}");
        
        UserBeanExample example = (UserBeanExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserBean record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getCode() != null) {
            sql.SET("CODE = #{code,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("SEX = #{sex,jdbcType=CHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("AGE = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getPost() != null) {
            sql.SET("POST = #{post,jdbcType=CHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.SET("DEPARTMENT = #{department,jdbcType=CHAR}");
        }
        
        if (record.getContact() != null) {
            sql.SET("CONTACT = #{contact,jdbcType=VARCHAR}");
        }
        
        if (record.getIdNumber() != null) {
            sql.SET("ID_NUMBER = #{idNumber,jdbcType=CHAR}");
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

    protected void applyWhere(SQL sql, UserBeanExample example, boolean includeExamplePhrase) {
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