package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class LimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimitExample() {
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

        public Criteria andLimitIdIsNull() {
            addCriterion("limit_id is null");
            return (Criteria) this;
        }

        public Criteria andLimitIdIsNotNull() {
            addCriterion("limit_id is not null");
            return (Criteria) this;
        }

        public Criteria andLimitIdEqualTo(Integer value) {
            addCriterion("limit_id =", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotEqualTo(Integer value) {
            addCriterion("limit_id <>", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdGreaterThan(Integer value) {
            addCriterion("limit_id >", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_id >=", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLessThan(Integer value) {
            addCriterion("limit_id <", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdLessThanOrEqualTo(Integer value) {
            addCriterion("limit_id <=", value, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdIn(List<Integer> values) {
            addCriterion("limit_id in", values, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotIn(List<Integer> values) {
            addCriterion("limit_id not in", values, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdBetween(Integer value1, Integer value2) {
            addCriterion("limit_id between", value1, value2, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_id not between", value1, value2, "limitId");
            return (Criteria) this;
        }

        public Criteria andLimitNameIsNull() {
            addCriterion("limit_name is null");
            return (Criteria) this;
        }

        public Criteria andLimitNameIsNotNull() {
            addCriterion("limit_name is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNameEqualTo(String value) {
            addCriterion("limit_name =", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameNotEqualTo(String value) {
            addCriterion("limit_name <>", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameGreaterThan(String value) {
            addCriterion("limit_name >", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameGreaterThanOrEqualTo(String value) {
            addCriterion("limit_name >=", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameLessThan(String value) {
            addCriterion("limit_name <", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameLessThanOrEqualTo(String value) {
            addCriterion("limit_name <=", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameLike(String value) {
            addCriterion("limit_name like", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameNotLike(String value) {
            addCriterion("limit_name not like", value, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameIn(List<String> values) {
            addCriterion("limit_name in", values, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameNotIn(List<String> values) {
            addCriterion("limit_name not in", values, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameBetween(String value1, String value2) {
            addCriterion("limit_name between", value1, value2, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitNameNotBetween(String value1, String value2) {
            addCriterion("limit_name not between", value1, value2, "limitName");
            return (Criteria) this;
        }

        public Criteria andLimitDesIsNull() {
            addCriterion("limit_des is null");
            return (Criteria) this;
        }

        public Criteria andLimitDesIsNotNull() {
            addCriterion("limit_des is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDesEqualTo(String value) {
            addCriterion("limit_des =", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesNotEqualTo(String value) {
            addCriterion("limit_des <>", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesGreaterThan(String value) {
            addCriterion("limit_des >", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesGreaterThanOrEqualTo(String value) {
            addCriterion("limit_des >=", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesLessThan(String value) {
            addCriterion("limit_des <", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesLessThanOrEqualTo(String value) {
            addCriterion("limit_des <=", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesLike(String value) {
            addCriterion("limit_des like", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesNotLike(String value) {
            addCriterion("limit_des not like", value, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesIn(List<String> values) {
            addCriterion("limit_des in", values, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesNotIn(List<String> values) {
            addCriterion("limit_des not in", values, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesBetween(String value1, String value2) {
            addCriterion("limit_des between", value1, value2, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitDesNotBetween(String value1, String value2) {
            addCriterion("limit_des not between", value1, value2, "limitDes");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(String value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(String value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(String value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(String value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLike(String value) {
            addCriterion("limit_type like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotLike(String value) {
            addCriterion("limit_type not like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<String> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<String> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(String value1, String value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(String value1, String value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Byte value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Byte value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Byte value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Byte value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Byte value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Byte> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Byte> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Byte value1, Byte value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(String value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(String value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(String value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(String value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLike(String value) {
            addCriterion("modify_time like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotLike(String value) {
            addCriterion("modify_time not like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<String> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<String> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(String value1, String value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(String value1, String value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
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