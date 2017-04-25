package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class OrderReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderReturnExample() {
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

        public Criteria andOrderReturnIdIsNull() {
            addCriterion("order_return_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdIsNotNull() {
            addCriterion("order_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdEqualTo(Integer value) {
            addCriterion("order_return_id =", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdNotEqualTo(Integer value) {
            addCriterion("order_return_id <>", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdGreaterThan(Integer value) {
            addCriterion("order_return_id >", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_return_id >=", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdLessThan(Integer value) {
            addCriterion("order_return_id <", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_return_id <=", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdIn(List<Integer> values) {
            addCriterion("order_return_id in", values, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdNotIn(List<Integer> values) {
            addCriterion("order_return_id not in", values, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdBetween(Integer value1, Integer value2) {
            addCriterion("order_return_id between", value1, value2, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_return_id not between", value1, value2, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdIsNull() {
            addCriterion("return_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnIdIsNotNull() {
            addCriterion("return_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnIdEqualTo(Integer value) {
            addCriterion("return_id =", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotEqualTo(Integer value) {
            addCriterion("return_id <>", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThan(Integer value) {
            addCriterion("return_id >", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_id >=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThan(Integer value) {
            addCriterion("return_id <", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThanOrEqualTo(Integer value) {
            addCriterion("return_id <=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdIn(List<Integer> values) {
            addCriterion("return_id in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotIn(List<Integer> values) {
            addCriterion("return_id not in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdBetween(Integer value1, Integer value2) {
            addCriterion("return_id between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("return_id not between", value1, value2, "returnId");
            return (Criteria) this;
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

        public Criteria andReturnPayableIsNull() {
            addCriterion("return_payable is null");
            return (Criteria) this;
        }

        public Criteria andReturnPayableIsNotNull() {
            addCriterion("return_payable is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPayableEqualTo(Double value) {
            addCriterion("return_payable =", value, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableNotEqualTo(Double value) {
            addCriterion("return_payable <>", value, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableGreaterThan(Double value) {
            addCriterion("return_payable >", value, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableGreaterThanOrEqualTo(Double value) {
            addCriterion("return_payable >=", value, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableLessThan(Double value) {
            addCriterion("return_payable <", value, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableLessThanOrEqualTo(Double value) {
            addCriterion("return_payable <=", value, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableIn(List<Double> values) {
            addCriterion("return_payable in", values, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableNotIn(List<Double> values) {
            addCriterion("return_payable not in", values, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableBetween(Double value1, Double value2) {
            addCriterion("return_payable between", value1, value2, "returnPayable");
            return (Criteria) this;
        }

        public Criteria andReturnPayableNotBetween(Double value1, Double value2) {
            addCriterion("return_payable not between", value1, value2, "returnPayable");
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

        public Criteria andReturnPhoneIsNull() {
            addCriterion("return_phone is null");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIsNotNull() {
            addCriterion("return_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneEqualTo(Integer value) {
            addCriterion("return_phone =", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotEqualTo(Integer value) {
            addCriterion("return_phone <>", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneGreaterThan(Integer value) {
            addCriterion("return_phone >", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_phone >=", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLessThan(Integer value) {
            addCriterion("return_phone <", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("return_phone <=", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIn(List<Integer> values) {
            addCriterion("return_phone in", values, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotIn(List<Integer> values) {
            addCriterion("return_phone not in", values, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneBetween(Integer value1, Integer value2) {
            addCriterion("return_phone between", value1, value2, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("return_phone not between", value1, value2, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnAddressIsNull() {
            addCriterion("return_address is null");
            return (Criteria) this;
        }

        public Criteria andReturnAddressIsNotNull() {
            addCriterion("return_address is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAddressEqualTo(String value) {
            addCriterion("return_address =", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotEqualTo(String value) {
            addCriterion("return_address <>", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressGreaterThan(String value) {
            addCriterion("return_address >", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressGreaterThanOrEqualTo(String value) {
            addCriterion("return_address >=", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressLessThan(String value) {
            addCriterion("return_address <", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressLessThanOrEqualTo(String value) {
            addCriterion("return_address <=", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressLike(String value) {
            addCriterion("return_address like", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotLike(String value) {
            addCriterion("return_address not like", value, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressIn(List<String> values) {
            addCriterion("return_address in", values, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotIn(List<String> values) {
            addCriterion("return_address not in", values, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressBetween(String value1, String value2) {
            addCriterion("return_address between", value1, value2, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnAddressNotBetween(String value1, String value2) {
            addCriterion("return_address not between", value1, value2, "returnAddress");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceIsNull() {
            addCriterion("return_province is null");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceIsNotNull() {
            addCriterion("return_province is not null");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceEqualTo(String value) {
            addCriterion("return_province =", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceNotEqualTo(String value) {
            addCriterion("return_province <>", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceGreaterThan(String value) {
            addCriterion("return_province >", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("return_province >=", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceLessThan(String value) {
            addCriterion("return_province <", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceLessThanOrEqualTo(String value) {
            addCriterion("return_province <=", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceLike(String value) {
            addCriterion("return_province like", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceNotLike(String value) {
            addCriterion("return_province not like", value, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceIn(List<String> values) {
            addCriterion("return_province in", values, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceNotIn(List<String> values) {
            addCriterion("return_province not in", values, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceBetween(String value1, String value2) {
            addCriterion("return_province between", value1, value2, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnProvinceNotBetween(String value1, String value2) {
            addCriterion("return_province not between", value1, value2, "returnProvince");
            return (Criteria) this;
        }

        public Criteria andReturnCityIsNull() {
            addCriterion("return_city is null");
            return (Criteria) this;
        }

        public Criteria andReturnCityIsNotNull() {
            addCriterion("return_city is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCityEqualTo(String value) {
            addCriterion("return_city =", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityNotEqualTo(String value) {
            addCriterion("return_city <>", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityGreaterThan(String value) {
            addCriterion("return_city >", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityGreaterThanOrEqualTo(String value) {
            addCriterion("return_city >=", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityLessThan(String value) {
            addCriterion("return_city <", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityLessThanOrEqualTo(String value) {
            addCriterion("return_city <=", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityLike(String value) {
            addCriterion("return_city like", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityNotLike(String value) {
            addCriterion("return_city not like", value, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityIn(List<String> values) {
            addCriterion("return_city in", values, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityNotIn(List<String> values) {
            addCriterion("return_city not in", values, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityBetween(String value1, String value2) {
            addCriterion("return_city between", value1, value2, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCityNotBetween(String value1, String value2) {
            addCriterion("return_city not between", value1, value2, "returnCity");
            return (Criteria) this;
        }

        public Criteria andReturnCountryIsNull() {
            addCriterion("return_country is null");
            return (Criteria) this;
        }

        public Criteria andReturnCountryIsNotNull() {
            addCriterion("return_country is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCountryEqualTo(String value) {
            addCriterion("return_country =", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryNotEqualTo(String value) {
            addCriterion("return_country <>", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryGreaterThan(String value) {
            addCriterion("return_country >", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryGreaterThanOrEqualTo(String value) {
            addCriterion("return_country >=", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryLessThan(String value) {
            addCriterion("return_country <", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryLessThanOrEqualTo(String value) {
            addCriterion("return_country <=", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryLike(String value) {
            addCriterion("return_country like", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryNotLike(String value) {
            addCriterion("return_country not like", value, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryIn(List<String> values) {
            addCriterion("return_country in", values, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryNotIn(List<String> values) {
            addCriterion("return_country not in", values, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryBetween(String value1, String value2) {
            addCriterion("return_country between", value1, value2, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnCountryNotBetween(String value1, String value2) {
            addCriterion("return_country not between", value1, value2, "returnCountry");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdIsNull() {
            addCriterion("return_status_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdIsNotNull() {
            addCriterion("return_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdEqualTo(Integer value) {
            addCriterion("return_status_id =", value, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdNotEqualTo(Integer value) {
            addCriterion("return_status_id <>", value, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdGreaterThan(Integer value) {
            addCriterion("return_status_id >", value, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_status_id >=", value, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdLessThan(Integer value) {
            addCriterion("return_status_id <", value, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("return_status_id <=", value, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdIn(List<Integer> values) {
            addCriterion("return_status_id in", values, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdNotIn(List<Integer> values) {
            addCriterion("return_status_id not in", values, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("return_status_id between", value1, value2, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("return_status_id not between", value1, value2, "returnStatusId");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Double value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Double value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Double value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Double value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Double> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Double> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Double value1, Double value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkIsNull() {
            addCriterion("return_remark is null");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkIsNotNull() {
            addCriterion("return_remark is not null");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkEqualTo(String value) {
            addCriterion("return_remark =", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkNotEqualTo(String value) {
            addCriterion("return_remark <>", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkGreaterThan(String value) {
            addCriterion("return_remark >", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("return_remark >=", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkLessThan(String value) {
            addCriterion("return_remark <", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkLessThanOrEqualTo(String value) {
            addCriterion("return_remark <=", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkLike(String value) {
            addCriterion("return_remark like", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkNotLike(String value) {
            addCriterion("return_remark not like", value, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkIn(List<String> values) {
            addCriterion("return_remark in", values, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkNotIn(List<String> values) {
            addCriterion("return_remark not in", values, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkBetween(String value1, String value2) {
            addCriterion("return_remark between", value1, value2, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnRemarkNotBetween(String value1, String value2) {
            addCriterion("return_remark not between", value1, value2, "returnRemark");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(String value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(String value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(String value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(String value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLike(String value) {
            addCriterion("return_time like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotLike(String value) {
            addCriterion("return_time not like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<String> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<String> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(String value1, String value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(String value1, String value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNull() {
            addCriterion("return_reason is null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNotNull() {
            addCriterion("return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonEqualTo(String value) {
            addCriterion("return_reason =", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotEqualTo(String value) {
            addCriterion("return_reason <>", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThan(String value) {
            addCriterion("return_reason >", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("return_reason >=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThan(String value) {
            addCriterion("return_reason <", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("return_reason <=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLike(String value) {
            addCriterion("return_reason like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotLike(String value) {
            addCriterion("return_reason not like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIn(List<String> values) {
            addCriterion("return_reason in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotIn(List<String> values) {
            addCriterion("return_reason not in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonBetween(String value1, String value2) {
            addCriterion("return_reason between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotBetween(String value1, String value2) {
            addCriterion("return_reason not between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andCustomPriceIsNull() {
            addCriterion("custom_price is null");
            return (Criteria) this;
        }

        public Criteria andCustomPriceIsNotNull() {
            addCriterion("custom_price is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPriceEqualTo(Double value) {
            addCriterion("custom_price =", value, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceNotEqualTo(Double value) {
            addCriterion("custom_price <>", value, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceGreaterThan(Double value) {
            addCriterion("custom_price >", value, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("custom_price >=", value, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceLessThan(Double value) {
            addCriterion("custom_price <", value, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceLessThanOrEqualTo(Double value) {
            addCriterion("custom_price <=", value, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceIn(List<Double> values) {
            addCriterion("custom_price in", values, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceNotIn(List<Double> values) {
            addCriterion("custom_price not in", values, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceBetween(Double value1, Double value2) {
            addCriterion("custom_price between", value1, value2, "customPrice");
            return (Criteria) this;
        }

        public Criteria andCustomPriceNotBetween(Double value1, Double value2) {
            addCriterion("custom_price not between", value1, value2, "customPrice");
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