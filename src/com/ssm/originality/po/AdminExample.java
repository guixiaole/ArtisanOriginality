package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdnameIsNull() {
            addCriterion("adname is null");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNotNull() {
            addCriterion("adname is not null");
            return (Criteria) this;
        }

        public Criteria andAdnameEqualTo(String value) {
            addCriterion("adname =", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotEqualTo(String value) {
            addCriterion("adname <>", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThan(String value) {
            addCriterion("adname >", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThanOrEqualTo(String value) {
            addCriterion("adname >=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThan(String value) {
            addCriterion("adname <", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThanOrEqualTo(String value) {
            addCriterion("adname <=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLike(String value) {
            addCriterion("adname like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotLike(String value) {
            addCriterion("adname not like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameIn(List<String> values) {
            addCriterion("adname in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotIn(List<String> values) {
            addCriterion("adname not in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameBetween(String value1, String value2) {
            addCriterion("adname between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotBetween(String value1, String value2) {
            addCriterion("adname not between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdsexIsNull() {
            addCriterion("adsex is null");
            return (Criteria) this;
        }

        public Criteria andAdsexIsNotNull() {
            addCriterion("adsex is not null");
            return (Criteria) this;
        }

        public Criteria andAdsexEqualTo(String value) {
            addCriterion("adsex =", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexNotEqualTo(String value) {
            addCriterion("adsex <>", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexGreaterThan(String value) {
            addCriterion("adsex >", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexGreaterThanOrEqualTo(String value) {
            addCriterion("adsex >=", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexLessThan(String value) {
            addCriterion("adsex <", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexLessThanOrEqualTo(String value) {
            addCriterion("adsex <=", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexLike(String value) {
            addCriterion("adsex like", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexNotLike(String value) {
            addCriterion("adsex not like", value, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexIn(List<String> values) {
            addCriterion("adsex in", values, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexNotIn(List<String> values) {
            addCriterion("adsex not in", values, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexBetween(String value1, String value2) {
            addCriterion("adsex between", value1, value2, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdsexNotBetween(String value1, String value2) {
            addCriterion("adsex not between", value1, value2, "adsex");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNull() {
            addCriterion("ademail is null");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNotNull() {
            addCriterion("ademail is not null");
            return (Criteria) this;
        }

        public Criteria andAdemailEqualTo(String value) {
            addCriterion("ademail =", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotEqualTo(String value) {
            addCriterion("ademail <>", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThan(String value) {
            addCriterion("ademail >", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThanOrEqualTo(String value) {
            addCriterion("ademail >=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThan(String value) {
            addCriterion("ademail <", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThanOrEqualTo(String value) {
            addCriterion("ademail <=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLike(String value) {
            addCriterion("ademail like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotLike(String value) {
            addCriterion("ademail not like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailIn(List<String> values) {
            addCriterion("ademail in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotIn(List<String> values) {
            addCriterion("ademail not in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailBetween(String value1, String value2) {
            addCriterion("ademail between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotBetween(String value1, String value2) {
            addCriterion("ademail not between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNull() {
            addCriterion("adphone is null");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNotNull() {
            addCriterion("adphone is not null");
            return (Criteria) this;
        }

        public Criteria andAdphoneEqualTo(Integer value) {
            addCriterion("adphone =", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotEqualTo(Integer value) {
            addCriterion("adphone <>", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThan(Integer value) {
            addCriterion("adphone >", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("adphone >=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThan(Integer value) {
            addCriterion("adphone <", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThanOrEqualTo(Integer value) {
            addCriterion("adphone <=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneIn(List<Integer> values) {
            addCriterion("adphone in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotIn(List<Integer> values) {
            addCriterion("adphone not in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneBetween(Integer value1, Integer value2) {
            addCriterion("adphone between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("adphone not between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIsNull() {
            addCriterion("adpassword is null");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIsNotNull() {
            addCriterion("adpassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdpasswordEqualTo(String value) {
            addCriterion("adpassword =", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotEqualTo(String value) {
            addCriterion("adpassword <>", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordGreaterThan(String value) {
            addCriterion("adpassword >", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adpassword >=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLessThan(String value) {
            addCriterion("adpassword <", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLessThanOrEqualTo(String value) {
            addCriterion("adpassword <=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLike(String value) {
            addCriterion("adpassword like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotLike(String value) {
            addCriterion("adpassword not like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIn(List<String> values) {
            addCriterion("adpassword in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotIn(List<String> values) {
            addCriterion("adpassword not in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordBetween(String value1, String value2) {
            addCriterion("adpassword between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotBetween(String value1, String value2) {
            addCriterion("adpassword not between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdusernameIsNull() {
            addCriterion("adusername is null");
            return (Criteria) this;
        }

        public Criteria andAdusernameIsNotNull() {
            addCriterion("adusername is not null");
            return (Criteria) this;
        }

        public Criteria andAdusernameEqualTo(String value) {
            addCriterion("adusername =", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameNotEqualTo(String value) {
            addCriterion("adusername <>", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameGreaterThan(String value) {
            addCriterion("adusername >", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameGreaterThanOrEqualTo(String value) {
            addCriterion("adusername >=", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameLessThan(String value) {
            addCriterion("adusername <", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameLessThanOrEqualTo(String value) {
            addCriterion("adusername <=", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameLike(String value) {
            addCriterion("adusername like", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameNotLike(String value) {
            addCriterion("adusername not like", value, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameIn(List<String> values) {
            addCriterion("adusername in", values, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameNotIn(List<String> values) {
            addCriterion("adusername not in", values, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameBetween(String value1, String value2) {
            addCriterion("adusername between", value1, value2, "adusername");
            return (Criteria) this;
        }

        public Criteria andAdusernameNotBetween(String value1, String value2) {
            addCriterion("adusername not between", value1, value2, "adusername");
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