package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShIdIsNull() {
            addCriterion("sh_id is null");
            return (Criteria) this;
        }

        public Criteria andShIdIsNotNull() {
            addCriterion("sh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShIdEqualTo(Integer value) {
            addCriterion("sh_id =", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotEqualTo(Integer value) {
            addCriterion("sh_id <>", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThan(Integer value) {
            addCriterion("sh_id >", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_id >=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThan(Integer value) {
            addCriterion("sh_id <", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdLessThanOrEqualTo(Integer value) {
            addCriterion("sh_id <=", value, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdIn(List<Integer> values) {
            addCriterion("sh_id in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotIn(List<Integer> values) {
            addCriterion("sh_id not in", values, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdBetween(Integer value1, Integer value2) {
            addCriterion("sh_id between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_id not between", value1, value2, "shId");
            return (Criteria) this;
        }

        public Criteria andShnameIsNull() {
            addCriterion("shname is null");
            return (Criteria) this;
        }

        public Criteria andShnameIsNotNull() {
            addCriterion("shname is not null");
            return (Criteria) this;
        }

        public Criteria andShnameEqualTo(String value) {
            addCriterion("shname =", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotEqualTo(String value) {
            addCriterion("shname <>", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameGreaterThan(String value) {
            addCriterion("shname >", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameGreaterThanOrEqualTo(String value) {
            addCriterion("shname >=", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameLessThan(String value) {
            addCriterion("shname <", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameLessThanOrEqualTo(String value) {
            addCriterion("shname <=", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameLike(String value) {
            addCriterion("shname like", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotLike(String value) {
            addCriterion("shname not like", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameIn(List<String> values) {
            addCriterion("shname in", values, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotIn(List<String> values) {
            addCriterion("shname not in", values, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameBetween(String value1, String value2) {
            addCriterion("shname between", value1, value2, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotBetween(String value1, String value2) {
            addCriterion("shname not between", value1, value2, "shname");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andShaddressIsNull() {
            addCriterion("shaddress is null");
            return (Criteria) this;
        }

        public Criteria andShaddressIsNotNull() {
            addCriterion("shaddress is not null");
            return (Criteria) this;
        }

        public Criteria andShaddressEqualTo(String value) {
            addCriterion("shaddress =", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressNotEqualTo(String value) {
            addCriterion("shaddress <>", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressGreaterThan(String value) {
            addCriterion("shaddress >", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shaddress >=", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressLessThan(String value) {
            addCriterion("shaddress <", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressLessThanOrEqualTo(String value) {
            addCriterion("shaddress <=", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressLike(String value) {
            addCriterion("shaddress like", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressNotLike(String value) {
            addCriterion("shaddress not like", value, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressIn(List<String> values) {
            addCriterion("shaddress in", values, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressNotIn(List<String> values) {
            addCriterion("shaddress not in", values, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressBetween(String value1, String value2) {
            addCriterion("shaddress between", value1, value2, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShaddressNotBetween(String value1, String value2) {
            addCriterion("shaddress not between", value1, value2, "shaddress");
            return (Criteria) this;
        }

        public Criteria andShtelIsNull() {
            addCriterion("shtel is null");
            return (Criteria) this;
        }

        public Criteria andShtelIsNotNull() {
            addCriterion("shtel is not null");
            return (Criteria) this;
        }

        public Criteria andShtelEqualTo(Integer value) {
            addCriterion("shtel =", value, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelNotEqualTo(Integer value) {
            addCriterion("shtel <>", value, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelGreaterThan(Integer value) {
            addCriterion("shtel >", value, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("shtel >=", value, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelLessThan(Integer value) {
            addCriterion("shtel <", value, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelLessThanOrEqualTo(Integer value) {
            addCriterion("shtel <=", value, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelIn(List<Integer> values) {
            addCriterion("shtel in", values, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelNotIn(List<Integer> values) {
            addCriterion("shtel not in", values, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelBetween(Integer value1, Integer value2) {
            addCriterion("shtel between", value1, value2, "shtel");
            return (Criteria) this;
        }

        public Criteria andShtelNotBetween(Integer value1, Integer value2) {
            addCriterion("shtel not between", value1, value2, "shtel");
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