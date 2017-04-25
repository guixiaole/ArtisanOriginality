package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOpayIsNull() {
            addCriterion("opay is null");
            return (Criteria) this;
        }

        public Criteria andOpayIsNotNull() {
            addCriterion("opay is not null");
            return (Criteria) this;
        }

        public Criteria andOpayEqualTo(Double value) {
            addCriterion("opay =", value, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayNotEqualTo(Double value) {
            addCriterion("opay <>", value, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayGreaterThan(Double value) {
            addCriterion("opay >", value, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayGreaterThanOrEqualTo(Double value) {
            addCriterion("opay >=", value, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayLessThan(Double value) {
            addCriterion("opay <", value, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayLessThanOrEqualTo(Double value) {
            addCriterion("opay <=", value, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayIn(List<Double> values) {
            addCriterion("opay in", values, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayNotIn(List<Double> values) {
            addCriterion("opay not in", values, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayBetween(Double value1, Double value2) {
            addCriterion("opay between", value1, value2, "opay");
            return (Criteria) this;
        }

        public Criteria andOpayNotBetween(Double value1, Double value2) {
            addCriterion("opay not between", value1, value2, "opay");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNull() {
            addCriterion("ophone is null");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNotNull() {
            addCriterion("ophone is not null");
            return (Criteria) this;
        }

        public Criteria andOphoneEqualTo(String value) {
            addCriterion("ophone =", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotEqualTo(String value) {
            addCriterion("ophone <>", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThan(String value) {
            addCriterion("ophone >", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ophone >=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThan(String value) {
            addCriterion("ophone <", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThanOrEqualTo(String value) {
            addCriterion("ophone <=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLike(String value) {
            addCriterion("ophone like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotLike(String value) {
            addCriterion("ophone not like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneIn(List<String> values) {
            addCriterion("ophone in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotIn(List<String> values) {
            addCriterion("ophone not in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneBetween(String value1, String value2) {
            addCriterion("ophone between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotBetween(String value1, String value2) {
            addCriterion("ophone not between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNull() {
            addCriterion("oaddress is null");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNotNull() {
            addCriterion("oaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOaddressEqualTo(String value) {
            addCriterion("oaddress =", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotEqualTo(String value) {
            addCriterion("oaddress <>", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThan(String value) {
            addCriterion("oaddress >", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThanOrEqualTo(String value) {
            addCriterion("oaddress >=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThan(String value) {
            addCriterion("oaddress <", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThanOrEqualTo(String value) {
            addCriterion("oaddress <=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLike(String value) {
            addCriterion("oaddress like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotLike(String value) {
            addCriterion("oaddress not like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressIn(List<String> values) {
            addCriterion("oaddress in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotIn(List<String> values) {
            addCriterion("oaddress not in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressBetween(String value1, String value2) {
            addCriterion("oaddress between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotBetween(String value1, String value2) {
            addCriterion("oaddress not between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andDeTimeIsNull() {
            addCriterion("de_time is null");
            return (Criteria) this;
        }

        public Criteria andDeTimeIsNotNull() {
            addCriterion("de_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeTimeEqualTo(String value) {
            addCriterion("de_time =", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotEqualTo(String value) {
            addCriterion("de_time <>", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeGreaterThan(String value) {
            addCriterion("de_time >", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("de_time >=", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeLessThan(String value) {
            addCriterion("de_time <", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeLessThanOrEqualTo(String value) {
            addCriterion("de_time <=", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeLike(String value) {
            addCriterion("de_time like", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotLike(String value) {
            addCriterion("de_time not like", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeIn(List<String> values) {
            addCriterion("de_time in", values, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotIn(List<String> values) {
            addCriterion("de_time not in", values, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeBetween(String value1, String value2) {
            addCriterion("de_time between", value1, value2, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotBetween(String value1, String value2) {
            addCriterion("de_time not between", value1, value2, "deTime");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Double value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Double value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Double value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Double value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Double value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Double> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Double> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Double value1, Double value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Double value1, Double value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNull() {
            addCriterion("onumber is null");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNotNull() {
            addCriterion("onumber is not null");
            return (Criteria) this;
        }

        public Criteria andOnumberEqualTo(Integer value) {
            addCriterion("onumber =", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotEqualTo(Integer value) {
            addCriterion("onumber <>", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThan(Integer value) {
            addCriterion("onumber >", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("onumber >=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThan(Integer value) {
            addCriterion("onumber <", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThanOrEqualTo(Integer value) {
            addCriterion("onumber <=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberIn(List<Integer> values) {
            addCriterion("onumber in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotIn(List<Integer> values) {
            addCriterion("onumber not in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberBetween(Integer value1, Integer value2) {
            addCriterion("onumber between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("onumber not between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andProTPriceIsNull() {
            addCriterion("pro_t_price is null");
            return (Criteria) this;
        }

        public Criteria andProTPriceIsNotNull() {
            addCriterion("pro_t_price is not null");
            return (Criteria) this;
        }

        public Criteria andProTPriceEqualTo(Double value) {
            addCriterion("pro_t_price =", value, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceNotEqualTo(Double value) {
            addCriterion("pro_t_price <>", value, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceGreaterThan(Double value) {
            addCriterion("pro_t_price >", value, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pro_t_price >=", value, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceLessThan(Double value) {
            addCriterion("pro_t_price <", value, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceLessThanOrEqualTo(Double value) {
            addCriterion("pro_t_price <=", value, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceIn(List<Double> values) {
            addCriterion("pro_t_price in", values, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceNotIn(List<Double> values) {
            addCriterion("pro_t_price not in", values, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceBetween(Double value1, Double value2) {
            addCriterion("pro_t_price between", value1, value2, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andProTPriceNotBetween(Double value1, Double value2) {
            addCriterion("pro_t_price not between", value1, value2, "proTPrice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
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