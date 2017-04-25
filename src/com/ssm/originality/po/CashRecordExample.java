package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class CashRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(Integer value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(Integer value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(Integer value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(Integer value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<Integer> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<Integer> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(Integer value1, Integer value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andBeMoneyIsNull() {
            addCriterion("be_money is null");
            return (Criteria) this;
        }

        public Criteria andBeMoneyIsNotNull() {
            addCriterion("be_money is not null");
            return (Criteria) this;
        }

        public Criteria andBeMoneyEqualTo(Double value) {
            addCriterion("be_money =", value, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyNotEqualTo(Double value) {
            addCriterion("be_money <>", value, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyGreaterThan(Double value) {
            addCriterion("be_money >", value, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("be_money >=", value, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyLessThan(Double value) {
            addCriterion("be_money <", value, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("be_money <=", value, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyIn(List<Double> values) {
            addCriterion("be_money in", values, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyNotIn(List<Double> values) {
            addCriterion("be_money not in", values, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyBetween(Double value1, Double value2) {
            addCriterion("be_money between", value1, value2, "beMoney");
            return (Criteria) this;
        }

        public Criteria andBeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("be_money not between", value1, value2, "beMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyIsNull() {
            addCriterion("tx_money is null");
            return (Criteria) this;
        }

        public Criteria andTxMoneyIsNotNull() {
            addCriterion("tx_money is not null");
            return (Criteria) this;
        }

        public Criteria andTxMoneyEqualTo(Double value) {
            addCriterion("tx_money =", value, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyNotEqualTo(Double value) {
            addCriterion("tx_money <>", value, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyGreaterThan(Double value) {
            addCriterion("tx_money >", value, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tx_money >=", value, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyLessThan(Double value) {
            addCriterion("tx_money <", value, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyLessThanOrEqualTo(Double value) {
            addCriterion("tx_money <=", value, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyIn(List<Double> values) {
            addCriterion("tx_money in", values, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyNotIn(List<Double> values) {
            addCriterion("tx_money not in", values, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyBetween(Double value1, Double value2) {
            addCriterion("tx_money between", value1, value2, "txMoney");
            return (Criteria) this;
        }

        public Criteria andTxMoneyNotBetween(Double value1, Double value2) {
            addCriterion("tx_money not between", value1, value2, "txMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyIsNull() {
            addCriterion("af_money is null");
            return (Criteria) this;
        }

        public Criteria andAfMoneyIsNotNull() {
            addCriterion("af_money is not null");
            return (Criteria) this;
        }

        public Criteria andAfMoneyEqualTo(Double value) {
            addCriterion("af_money =", value, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyNotEqualTo(Double value) {
            addCriterion("af_money <>", value, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyGreaterThan(Double value) {
            addCriterion("af_money >", value, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("af_money >=", value, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyLessThan(Double value) {
            addCriterion("af_money <", value, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyLessThanOrEqualTo(Double value) {
            addCriterion("af_money <=", value, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyIn(List<Double> values) {
            addCriterion("af_money in", values, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyNotIn(List<Double> values) {
            addCriterion("af_money not in", values, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyBetween(Double value1, Double value2) {
            addCriterion("af_money between", value1, value2, "afMoney");
            return (Criteria) this;
        }

        public Criteria andAfMoneyNotBetween(Double value1, Double value2) {
            addCriterion("af_money not between", value1, value2, "afMoney");
            return (Criteria) this;
        }

        public Criteria andTxTypeIsNull() {
            addCriterion("tx_type is null");
            return (Criteria) this;
        }

        public Criteria andTxTypeIsNotNull() {
            addCriterion("tx_type is not null");
            return (Criteria) this;
        }

        public Criteria andTxTypeEqualTo(Byte value) {
            addCriterion("tx_type =", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotEqualTo(Byte value) {
            addCriterion("tx_type <>", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeGreaterThan(Byte value) {
            addCriterion("tx_type >", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tx_type >=", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeLessThan(Byte value) {
            addCriterion("tx_type <", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tx_type <=", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeIn(List<Byte> values) {
            addCriterion("tx_type in", values, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotIn(List<Byte> values) {
            addCriterion("tx_type not in", values, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeBetween(Byte value1, Byte value2) {
            addCriterion("tx_type between", value1, value2, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tx_type not between", value1, value2, "txType");
            return (Criteria) this;
        }

        public Criteria andRecordInfoIsNull() {
            addCriterion("record_info is null");
            return (Criteria) this;
        }

        public Criteria andRecordInfoIsNotNull() {
            addCriterion("record_info is not null");
            return (Criteria) this;
        }

        public Criteria andRecordInfoEqualTo(String value) {
            addCriterion("record_info =", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotEqualTo(String value) {
            addCriterion("record_info <>", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoGreaterThan(String value) {
            addCriterion("record_info >", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoGreaterThanOrEqualTo(String value) {
            addCriterion("record_info >=", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoLessThan(String value) {
            addCriterion("record_info <", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoLessThanOrEqualTo(String value) {
            addCriterion("record_info <=", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoLike(String value) {
            addCriterion("record_info like", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotLike(String value) {
            addCriterion("record_info not like", value, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoIn(List<String> values) {
            addCriterion("record_info in", values, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotIn(List<String> values) {
            addCriterion("record_info not in", values, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoBetween(String value1, String value2) {
            addCriterion("record_info between", value1, value2, "recordInfo");
            return (Criteria) this;
        }

        public Criteria andRecordInfoNotBetween(String value1, String value2) {
            addCriterion("record_info not between", value1, value2, "recordInfo");
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