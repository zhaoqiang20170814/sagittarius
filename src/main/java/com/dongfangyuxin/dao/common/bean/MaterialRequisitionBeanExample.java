package com.dongfangyuxin.dao.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialRequisitionBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialRequisitionBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("TASK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("TASK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("TASK_CODE =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("TASK_CODE <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("TASK_CODE >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CODE >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("TASK_CODE <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("TASK_CODE <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("TASK_CODE like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("TASK_CODE not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("TASK_CODE in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("TASK_CODE not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("TASK_CODE between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("TASK_CODE not between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeIsNull() {
            addCriterion("OPERATING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeIsNotNull() {
            addCriterion("OPERATING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeEqualTo(Date value) {
            addCriterion("OPERATING_TIME =", value, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeNotEqualTo(Date value) {
            addCriterion("OPERATING_TIME <>", value, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeGreaterThan(Date value) {
            addCriterion("OPERATING_TIME >", value, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATING_TIME >=", value, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeLessThan(Date value) {
            addCriterion("OPERATING_TIME <", value, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATING_TIME <=", value, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeIn(List<Date> values) {
            addCriterion("OPERATING_TIME in", values, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeNotIn(List<Date> values) {
            addCriterion("OPERATING_TIME not in", values, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATING_TIME between", value1, value2, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andOperatingTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATING_TIME not between", value1, value2, "operatingTime");
            return (Criteria) this;
        }

        public Criteria andSCreatorIsNull() {
            addCriterion("S_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andSCreatorIsNotNull() {
            addCriterion("S_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatorEqualTo(String value) {
            addCriterion("S_CREATOR =", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotEqualTo(String value) {
            addCriterion("S_CREATOR <>", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorGreaterThan(String value) {
            addCriterion("S_CREATOR >", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("S_CREATOR >=", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLessThan(String value) {
            addCriterion("S_CREATOR <", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLessThanOrEqualTo(String value) {
            addCriterion("S_CREATOR <=", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLike(String value) {
            addCriterion("S_CREATOR like", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotLike(String value) {
            addCriterion("S_CREATOR not like", value, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorIn(List<String> values) {
            addCriterion("S_CREATOR in", values, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotIn(List<String> values) {
            addCriterion("S_CREATOR not in", values, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorBetween(String value1, String value2) {
            addCriterion("S_CREATOR between", value1, value2, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreatorNotBetween(String value1, String value2) {
            addCriterion("S_CREATOR not between", value1, value2, "sCreator");
            return (Criteria) this;
        }

        public Criteria andSCreateDateIsNull() {
            addCriterion("S_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSCreateDateIsNotNull() {
            addCriterion("S_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateDateEqualTo(Date value) {
            addCriterion("S_CREATE_DATE =", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateNotEqualTo(Date value) {
            addCriterion("S_CREATE_DATE <>", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateGreaterThan(Date value) {
            addCriterion("S_CREATE_DATE >", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("S_CREATE_DATE >=", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateLessThan(Date value) {
            addCriterion("S_CREATE_DATE <", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("S_CREATE_DATE <=", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateIn(List<Date> values) {
            addCriterion("S_CREATE_DATE in", values, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateNotIn(List<Date> values) {
            addCriterion("S_CREATE_DATE not in", values, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateBetween(Date value1, Date value2) {
            addCriterion("S_CREATE_DATE between", value1, value2, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("S_CREATE_DATE not between", value1, value2, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorIsNull() {
            addCriterion("S_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andSOperatorIsNotNull() {
            addCriterion("S_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andSOperatorEqualTo(String value) {
            addCriterion("S_OPERATOR =", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotEqualTo(String value) {
            addCriterion("S_OPERATOR <>", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorGreaterThan(String value) {
            addCriterion("S_OPERATOR >", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("S_OPERATOR >=", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLessThan(String value) {
            addCriterion("S_OPERATOR <", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLessThanOrEqualTo(String value) {
            addCriterion("S_OPERATOR <=", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLike(String value) {
            addCriterion("S_OPERATOR like", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotLike(String value) {
            addCriterion("S_OPERATOR not like", value, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorIn(List<String> values) {
            addCriterion("S_OPERATOR in", values, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotIn(List<String> values) {
            addCriterion("S_OPERATOR not in", values, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorBetween(String value1, String value2) {
            addCriterion("S_OPERATOR between", value1, value2, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorNotBetween(String value1, String value2) {
            addCriterion("S_OPERATOR not between", value1, value2, "sOperator");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateIsNull() {
            addCriterion("S_OPERATOR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateIsNotNull() {
            addCriterion("S_OPERATOR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateEqualTo(Date value) {
            addCriterion("S_OPERATOR_DATE =", value, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateNotEqualTo(Date value) {
            addCriterion("S_OPERATOR_DATE <>", value, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateGreaterThan(Date value) {
            addCriterion("S_OPERATOR_DATE >", value, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateGreaterThanOrEqualTo(Date value) {
            addCriterion("S_OPERATOR_DATE >=", value, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateLessThan(Date value) {
            addCriterion("S_OPERATOR_DATE <", value, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateLessThanOrEqualTo(Date value) {
            addCriterion("S_OPERATOR_DATE <=", value, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateIn(List<Date> values) {
            addCriterion("S_OPERATOR_DATE in", values, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateNotIn(List<Date> values) {
            addCriterion("S_OPERATOR_DATE not in", values, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateBetween(Date value1, Date value2) {
            addCriterion("S_OPERATOR_DATE between", value1, value2, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andSOperatorDateNotBetween(Date value1, Date value2) {
            addCriterion("S_OPERATOR_DATE not between", value1, value2, "sOperatorDate");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(CODE) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLikeInsensitive(String value) {
            addCriterion("upper(TASK_CODE) like", value.toUpperCase(), "taskCode");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(OPERATOR) like", value.toUpperCase(), "operator");
            return (Criteria) this;
        }

        public Criteria andSCreatorLikeInsensitive(String value) {
            addCriterion("upper(S_CREATOR) like", value.toUpperCase(), "sCreator");
            return (Criteria) this;
        }

        public Criteria andSOperatorLikeInsensitive(String value) {
            addCriterion("upper(S_OPERATOR) like", value.toUpperCase(), "sOperator");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}