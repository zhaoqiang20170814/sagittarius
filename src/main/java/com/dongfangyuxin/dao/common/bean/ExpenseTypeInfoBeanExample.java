package com.dongfangyuxin.dao.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseTypeInfoBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseTypeInfoBeanExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
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