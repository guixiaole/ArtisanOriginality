package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPronameIsNull() {
            addCriterion("proname is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proname is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proname =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proname <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proname >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proname >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proname <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proname <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proname like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proname not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proname in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proname not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proname between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proname not between", value1, value2, "proname");
            return (Criteria) this;
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andIsAliveIsNull() {
            addCriterion("is_alive is null");
            return (Criteria) this;
        }

        public Criteria andIsAliveIsNotNull() {
            addCriterion("is_alive is not null");
            return (Criteria) this;
        }

        public Criteria andIsAliveEqualTo(String value) {
            addCriterion("is_alive =", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotEqualTo(String value) {
            addCriterion("is_alive <>", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveGreaterThan(String value) {
            addCriterion("is_alive >", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveGreaterThanOrEqualTo(String value) {
            addCriterion("is_alive >=", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveLessThan(String value) {
            addCriterion("is_alive <", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveLessThanOrEqualTo(String value) {
            addCriterion("is_alive <=", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveLike(String value) {
            addCriterion("is_alive like", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotLike(String value) {
            addCriterion("is_alive not like", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveIn(List<String> values) {
            addCriterion("is_alive in", values, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotIn(List<String> values) {
            addCriterion("is_alive not in", values, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveBetween(String value1, String value2) {
            addCriterion("is_alive between", value1, value2, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotBetween(String value1, String value2) {
            addCriterion("is_alive not between", value1, value2, "isAlive");
            return (Criteria) this;
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

        public Criteria andProIntroIsNull() {
            addCriterion("pro_intro is null");
            return (Criteria) this;
        }

        public Criteria andProIntroIsNotNull() {
            addCriterion("pro_intro is not null");
            return (Criteria) this;
        }

        public Criteria andProIntroEqualTo(String value) {
            addCriterion("pro_intro =", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroNotEqualTo(String value) {
            addCriterion("pro_intro <>", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroGreaterThan(String value) {
            addCriterion("pro_intro >", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroGreaterThanOrEqualTo(String value) {
            addCriterion("pro_intro >=", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroLessThan(String value) {
            addCriterion("pro_intro <", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroLessThanOrEqualTo(String value) {
            addCriterion("pro_intro <=", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroLike(String value) {
            addCriterion("pro_intro like", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroNotLike(String value) {
            addCriterion("pro_intro not like", value, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroIn(List<String> values) {
            addCriterion("pro_intro in", values, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroNotIn(List<String> values) {
            addCriterion("pro_intro not in", values, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroBetween(String value1, String value2) {
            addCriterion("pro_intro between", value1, value2, "proIntro");
            return (Criteria) this;
        }

        public Criteria andProIntroNotBetween(String value1, String value2) {
            addCriterion("pro_intro not between", value1, value2, "proIntro");
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

        public Criteria andModifyAdminIsNull() {
            addCriterion("modify_admin is null");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIsNotNull() {
            addCriterion("modify_admin is not null");
            return (Criteria) this;
        }

        public Criteria andModifyAdminEqualTo(Integer value) {
            addCriterion("modify_admin =", value, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminNotEqualTo(Integer value) {
            addCriterion("modify_admin <>", value, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminGreaterThan(Integer value) {
            addCriterion("modify_admin >", value, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_admin >=", value, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminLessThan(Integer value) {
            addCriterion("modify_admin <", value, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminLessThanOrEqualTo(Integer value) {
            addCriterion("modify_admin <=", value, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIn(List<Integer> values) {
            addCriterion("modify_admin in", values, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminNotIn(List<Integer> values) {
            addCriterion("modify_admin not in", values, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminBetween(Integer value1, Integer value2) {
            addCriterion("modify_admin between", value1, value2, "modifyAdmin");
            return (Criteria) this;
        }

        public Criteria andModifyAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_admin not between", value1, value2, "modifyAdmin");
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