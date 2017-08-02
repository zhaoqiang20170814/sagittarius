package com.dongfangyuxin.common.dao;

import com.dongfangyuxin.common.dao.bean.DataDicBean;
import com.dongfangyuxin.common.dao.bean.DataDicBeanExample.Criteria;
import com.dongfangyuxin.common.dao.bean.DataDicBeanExample.Criterion;
import com.dongfangyuxin.common.dao.bean.DataDicBeanExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DataDicBeanSqlProvider {

    public String countByExample(DataDicBeanExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("data_dic");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DataDicBeanExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("data_dic");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DataDicBean record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("data_dic");
        
        if (record.getDictType() != null) {
            sql.VALUES("DICT_TYPE", "#{dictType,jdbcType=VARCHAR}");
        }
        
        if (record.getDictTypeName() != null) {
            sql.VALUES("DICT_TYPE_NAME", "#{dictTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getDictCode() != null) {
            sql.VALUES("DICT_CODE", "#{dictCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDictCodeName() != null) {
            sql.VALUES("DICT_CODE_NAME", "#{dictCodeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getSequence() != null) {
            sql.VALUES("SEQUENCE", "#{sequence,jdbcType=INTEGER}");
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

    public String selectByExample(DataDicBeanExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("DICT_TYPE");
        sql.SELECT("DICT_TYPE_NAME");
        sql.SELECT("DICT_CODE");
        sql.SELECT("DICT_CODE_NAME");
        sql.SELECT("STATUS");
        sql.SELECT("SEQUENCE");
        sql.SELECT("S_CREATOR");
        sql.SELECT("S_CREATE_DATE");
        sql.SELECT("S_OPERATOR");
        sql.SELECT("S_OPERATOR_DATE");
        sql.FROM("data_dic");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DataDicBean record = (DataDicBean) parameter.get("record");
        DataDicBeanExample example = (DataDicBeanExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("data_dic");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getDictType() != null) {
            sql.SET("DICT_TYPE = #{record.dictType,jdbcType=VARCHAR}");
        }
        
        if (record.getDictTypeName() != null) {
            sql.SET("DICT_TYPE_NAME = #{record.dictTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getDictCode() != null) {
            sql.SET("DICT_CODE = #{record.dictCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDictCodeName() != null) {
            sql.SET("DICT_CODE_NAME = #{record.dictCodeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=CHAR}");
        }
        
        if (record.getSequence() != null) {
            sql.SET("SEQUENCE = #{record.sequence,jdbcType=INTEGER}");
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
        sql.UPDATE("data_dic");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("DICT_TYPE = #{record.dictType,jdbcType=VARCHAR}");
        sql.SET("DICT_TYPE_NAME = #{record.dictTypeName,jdbcType=VARCHAR}");
        sql.SET("DICT_CODE = #{record.dictCode,jdbcType=VARCHAR}");
        sql.SET("DICT_CODE_NAME = #{record.dictCodeName,jdbcType=VARCHAR}");
        sql.SET("STATUS = #{record.status,jdbcType=CHAR}");
        sql.SET("SEQUENCE = #{record.sequence,jdbcType=INTEGER}");
        sql.SET("S_CREATOR = #{record.sCreator,jdbcType=CHAR}");
        sql.SET("S_CREATE_DATE = #{record.sCreateDate,jdbcType=TIMESTAMP}");
        sql.SET("S_OPERATOR = #{record.sOperator,jdbcType=CHAR}");
        sql.SET("S_OPERATOR_DATE = #{record.sOperatorDate,jdbcType=TIMESTAMP}");
        
        DataDicBeanExample example = (DataDicBeanExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DataDicBean record) {
        SQL sql = new SQL();
        sql.UPDATE("data_dic");
        
        if (record.getDictType() != null) {
            sql.SET("DICT_TYPE = #{dictType,jdbcType=VARCHAR}");
        }
        
        if (record.getDictTypeName() != null) {
            sql.SET("DICT_TYPE_NAME = #{dictTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getDictCode() != null) {
            sql.SET("DICT_CODE = #{dictCode,jdbcType=VARCHAR}");
        }
        
        if (record.getDictCodeName() != null) {
            sql.SET("DICT_CODE_NAME = #{dictCodeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{status,jdbcType=CHAR}");
        }
        
        if (record.getSequence() != null) {
            sql.SET("SEQUENCE = #{sequence,jdbcType=INTEGER}");
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

    protected void applyWhere(SQL sql, DataDicBeanExample example, boolean includeExamplePhrase) {
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