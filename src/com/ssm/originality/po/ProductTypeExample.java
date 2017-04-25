package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductTypeExample() {
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

        public Criteria andProTypeIdIsNull() {
            addCriterion("pro_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIdIsNotNull() {
            addCriterion("pro_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeIdEqualTo(Integer value) {
            addCriterion("pro_type_id =", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdNotEqualTo(Integer value) {
            addCriterion("pro_type_id <>", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdGreaterThan(Integer value) {
            addCriterion("pro_type_id >", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_type_id >=", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdLessThan(Integer value) {
            addCriterion("pro_type_id <", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_type_id <=", value, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdIn(List<Integer> values) {
            addCriterion("pro_type_id in", values, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdNotIn(List<Integer> values) {
            addCriterion("pro_type_id not in", values, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_type_id between", value1, value2, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_type_id not between", value1, value2, "proTypeId");
            return (Criteria) this;
        }

        public Criteria andProTypeNameIsNull() {
            addCriterion("pro_type_name is null");
            return (Criteria) this;
        }

        public Criteria andProTypeNameIsNotNull() {
            addCriterion("pro_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeNameEqualTo(String value) {
            addCriterion("pro_type_name =", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameNotEqualTo(String value) {
            addCriterion("pro_type_name <>", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameGreaterThan(String value) {
            addCriterion("pro_type_name >", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_type_name >=", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameLessThan(String value) {
            addCriterion("pro_type_name <", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameLessThanOrEqualTo(String value) {
            addCriterion("pro_type_name <=", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameLike(String value) {
            addCriterion("pro_type_name like", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameNotLike(String value) {
            addCriterion("pro_type_name not like", value, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameIn(List<String> values) {
            addCriterion("pro_type_name in", values, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameNotIn(List<String> values) {
            addCriterion("pro_type_name not in", values, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameBetween(String value1, String value2) {
            addCriterion("pro_type_name between", value1, value2, "proTypeName");
            return (Criteria) this;
        }

        public Criteria andProTypeNameNotBetween(String value1, String value2) {
            addCriterion("pro_type_name not between", value1, value2, "proTypeName");
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