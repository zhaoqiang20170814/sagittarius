package com.dongfangyuxin.dao.common;

import com.dongfangyuxin.dao.common.bean.ProjectInfoBean;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBeanExample.Criteria;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBeanExample.Criterion;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBeanExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ProjectInfoBeanSqlProvider {

    public String countByExample(ProjectInfoBeanExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("project_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ProjectInfoBeanExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("project_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ProjectInfoBean record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("project_info");
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getOwner() != null) {
            sql.VALUES("OWNER", "#{owner,jdbcType=CHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.VALUES("START_TIME", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getImageUrl1() != null) {
            sql.VALUES("IMAGE_URL1", "#{imageUrl1,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl2() != null) {
            sql.VALUES("IMAGE_URL2", "#{imageUrl2,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl3() != null) {
            sql.VALUES("IMAGE_URL3", "#{imageUrl3,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramBudget() != null) {
            sql.VALUES("PROGRAM_BUDGET", "#{programBudget,jdbcType=DECIMAL}");
        }
        
        if (record.getRealtimeCost() != null) {
            sql.VALUES("REALTIME_COST", "#{realtimeCost,jdbcType=DECIMAL}");
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

    public String selectByExample(ProjectInfoBeanExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("STATUS");
        sql.SELECT("OWNER");
        sql.SELECT("ADDRESS");
        sql.SELECT("START_TIME");
        sql.SELECT("IMAGE_URL1");
        sql.SELECT("IMAGE_URL2");
        sql.SELECT("IMAGE_URL3");
        sql.SELECT("PROGRAM_BUDGET");
        sql.SELECT("REALTIME_COST");
        sql.SELECT("S_CREATOR");
        sql.SELECT("S_CREATE_DATE");
        sql.SELECT("S_OPERATOR");
        sql.SELECT("S_OPERATOR_DATE");
        sql.FROM("project_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ProjectInfoBean record = (ProjectInfoBean) parameter.get("record");
        ProjectInfoBeanExample example = (ProjectInfoBeanExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("project_info");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=CHAR}");
        }
        
        if (record.getOwner() != null) {
            sql.SET("OWNER = #{record.owner,jdbcType=CHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("START_TIME = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getImageUrl1() != null) {
            sql.SET("IMAGE_URL1 = #{record.imageUrl1,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl2() != null) {
            sql.SET("IMAGE_URL2 = #{record.imageUrl2,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl3() != null) {
            sql.SET("IMAGE_URL3 = #{record.imageUrl3,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramBudget() != null) {
            sql.SET("PROGRAM_BUDGET = #{record.programBudget,jdbcType=DECIMAL}");
        }
        
        if (record.getRealtimeCost() != null) {
            sql.SET("REALTIME_COST = #{record.realtimeCost,jdbcType=DECIMAL}");
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
        sql.UPDATE("project_info");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("STATUS = #{record.status,jdbcType=CHAR}");
        sql.SET("OWNER = #{record.owner,jdbcType=CHAR}");
        sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        sql.SET("START_TIME = #{record.startTime,jdbcType=TIMESTAMP}");
        sql.SET("IMAGE_URL1 = #{record.imageUrl1,jdbcType=VARCHAR}");
        sql.SET("IMAGE_URL2 = #{record.imageUrl2,jdbcType=VARCHAR}");
        sql.SET("IMAGE_URL3 = #{record.imageUrl3,jdbcType=VARCHAR}");
        sql.SET("PROGRAM_BUDGET = #{record.programBudget,jdbcType=DECIMAL}");
        sql.SET("REALTIME_COST = #{record.realtimeCost,jdbcType=DECIMAL}");
        sql.SET("S_CREATOR = #{record.sCreator,jdbcType=CHAR}");
        sql.SET("S_CREATE_DATE = #{record.sCreateDate,jdbcType=TIMESTAMP}");
        sql.SET("S_OPERATOR = #{record.sOperator,jdbcType=CHAR}");
        sql.SET("S_OPERATOR_DATE = #{record.sOperatorDate,jdbcType=TIMESTAMP}");
        
        ProjectInfoBeanExample example = (ProjectInfoBeanExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ProjectInfoBean record) {
        SQL sql = new SQL();
        sql.UPDATE("project_info");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{status,jdbcType=CHAR}");
        }
        
        if (record.getOwner() != null) {
            sql.SET("OWNER = #{owner,jdbcType=CHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("START_TIME = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getImageUrl1() != null) {
            sql.SET("IMAGE_URL1 = #{imageUrl1,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl2() != null) {
            sql.SET("IMAGE_URL2 = #{imageUrl2,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl3() != null) {
            sql.SET("IMAGE_URL3 = #{imageUrl3,jdbcType=VARCHAR}");
        }
        
        if (record.getProgramBudget() != null) {
            sql.SET("PROGRAM_BUDGET = #{programBudget,jdbcType=DECIMAL}");
        }
        
        if (record.getRealtimeCost() != null) {
            sql.SET("REALTIME_COST = #{realtimeCost,jdbcType=DECIMAL}");
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

    protected void applyWhere(SQL sql, ProjectInfoBeanExample example, boolean includeExamplePhrase) {
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