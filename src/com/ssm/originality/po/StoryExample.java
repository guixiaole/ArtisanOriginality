package com.ssm.originality.po;

import java.util.ArrayList;
import java.util.List;

public class StoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoryExample() {
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

        public Criteria andStoryIdIsNull() {
            addCriterion("story_id is null");
            return (Criteria) this;
        }

        public Criteria andStoryIdIsNotNull() {
            addCriterion("story_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoryIdEqualTo(Integer value) {
            addCriterion("story_id =", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotEqualTo(Integer value) {
            addCriterion("story_id <>", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdGreaterThan(Integer value) {
            addCriterion("story_id >", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("story_id >=", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdLessThan(Integer value) {
            addCriterion("story_id <", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("story_id <=", value, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdIn(List<Integer> values) {
            addCriterion("story_id in", values, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotIn(List<Integer> values) {
            addCriterion("story_id not in", values, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdBetween(Integer value1, Integer value2) {
            addCriterion("story_id between", value1, value2, "storyId");
            return (Criteria) this;
        }

        public Criteria andStoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("story_id not between", value1, value2, "storyId");
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

        public Criteria andStoryTitleIsNull() {
            addCriterion("story_title is null");
            return (Criteria) this;
        }

        public Criteria andStoryTitleIsNotNull() {
            addCriterion("story_title is not null");
            return (Criteria) this;
        }

        public Criteria andStoryTitleEqualTo(String value) {
            addCriterion("story_title =", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotEqualTo(String value) {
            addCriterion("story_title <>", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleGreaterThan(String value) {
            addCriterion("story_title >", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("story_title >=", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleLessThan(String value) {
            addCriterion("story_title <", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleLessThanOrEqualTo(String value) {
            addCriterion("story_title <=", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleLike(String value) {
            addCriterion("story_title like", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotLike(String value) {
            addCriterion("story_title not like", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleIn(List<String> values) {
            addCriterion("story_title in", values, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotIn(List<String> values) {
            addCriterion("story_title not in", values, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleBetween(String value1, String value2) {
            addCriterion("story_title between", value1, value2, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotBetween(String value1, String value2) {
            addCriterion("story_title not between", value1, value2, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryContentIsNull() {
            addCriterion("story_content is null");
            return (Criteria) this;
        }

        public Criteria andStoryContentIsNotNull() {
            addCriterion("story_content is not null");
            return (Criteria) this;
        }

        public Criteria andStoryContentEqualTo(String value) {
            addCriterion("story_content =", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotEqualTo(String value) {
            addCriterion("story_content <>", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentGreaterThan(String value) {
            addCriterion("story_content >", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentGreaterThanOrEqualTo(String value) {
            addCriterion("story_content >=", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentLessThan(String value) {
            addCriterion("story_content <", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentLessThanOrEqualTo(String value) {
            addCriterion("story_content <=", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentLike(String value) {
            addCriterion("story_content like", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotLike(String value) {
            addCriterion("story_content not like", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentIn(List<String> values) {
            addCriterion("story_content in", values, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotIn(List<String> values) {
            addCriterion("story_content not in", values, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentBetween(String value1, String value2) {
            addCriterion("story_content between", value1, value2, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotBetween(String value1, String value2) {
            addCriterion("story_content not between", value1, value2, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryTimeIsNull() {
            addCriterion("story_time is null");
            return (Criteria) this;
        }

        public Criteria andStoryTimeIsNotNull() {
            addCriterion("story_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoryTimeEqualTo(String value) {
            addCriterion("story_time =", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeNotEqualTo(String value) {
            addCriterion("story_time <>", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeGreaterThan(String value) {
            addCriterion("story_time >", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("story_time >=", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeLessThan(String value) {
            addCriterion("story_time <", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeLessThanOrEqualTo(String value) {
            addCriterion("story_time <=", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeLike(String value) {
            addCriterion("story_time like", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeNotLike(String value) {
            addCriterion("story_time not like", value, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeIn(List<String> values) {
            addCriterion("story_time in", values, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeNotIn(List<String> values) {
            addCriterion("story_time not in", values, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeBetween(String value1, String value2) {
            addCriterion("story_time between", value1, value2, "storyTime");
            return (Criteria) this;
        }

        public Criteria andStoryTimeNotBetween(String value1, String value2) {
            addCriterion("story_time not between", value1, value2, "storyTime");
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