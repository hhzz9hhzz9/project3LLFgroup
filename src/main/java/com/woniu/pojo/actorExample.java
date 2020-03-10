package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class actorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public actorExample() {
        oredCriteria = new ArrayList<>();
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public Integer getLimitSize() {
        return limitSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andActorIdIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActorIdEqualTo(Integer value) {
            addCriterion("actor_id =", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotEqualTo(Integer value) {
            addCriterion("actor_id <>", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThan(Integer value) {
            addCriterion("actor_id >", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("actor_id >=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThan(Integer value) {
            addCriterion("actor_id <", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThanOrEqualTo(Integer value) {
            addCriterion("actor_id <=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdIn(List<Integer> values) {
            addCriterion("actor_id in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotIn(List<Integer> values) {
            addCriterion("actor_id not in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdBetween(Integer value1, Integer value2) {
            addCriterion("actor_id between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("actor_id not between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorNameIsNull() {
            addCriterion("actor_name is null");
            return (Criteria) this;
        }

        public Criteria andActorNameIsNotNull() {
            addCriterion("actor_name is not null");
            return (Criteria) this;
        }

        public Criteria andActorNameEqualTo(String value) {
            addCriterion("actor_name =", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotEqualTo(String value) {
            addCriterion("actor_name <>", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameGreaterThan(String value) {
            addCriterion("actor_name >", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameGreaterThanOrEqualTo(String value) {
            addCriterion("actor_name >=", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLessThan(String value) {
            addCriterion("actor_name <", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLessThanOrEqualTo(String value) {
            addCriterion("actor_name <=", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLike(String value) {
            addCriterion("actor_name like", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotLike(String value) {
            addCriterion("actor_name not like", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameIn(List<String> values) {
            addCriterion("actor_name in", values, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotIn(List<String> values) {
            addCriterion("actor_name not in", values, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameBetween(String value1, String value2) {
            addCriterion("actor_name between", value1, value2, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotBetween(String value1, String value2) {
            addCriterion("actor_name not between", value1, value2, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorDescIsNull() {
            addCriterion("actor_desc is null");
            return (Criteria) this;
        }

        public Criteria andActorDescIsNotNull() {
            addCriterion("actor_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActorDescEqualTo(String value) {
            addCriterion("actor_desc =", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescNotEqualTo(String value) {
            addCriterion("actor_desc <>", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescGreaterThan(String value) {
            addCriterion("actor_desc >", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescGreaterThanOrEqualTo(String value) {
            addCriterion("actor_desc >=", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescLessThan(String value) {
            addCriterion("actor_desc <", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescLessThanOrEqualTo(String value) {
            addCriterion("actor_desc <=", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescLike(String value) {
            addCriterion("actor_desc like", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescNotLike(String value) {
            addCriterion("actor_desc not like", value, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescIn(List<String> values) {
            addCriterion("actor_desc in", values, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescNotIn(List<String> values) {
            addCriterion("actor_desc not in", values, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescBetween(String value1, String value2) {
            addCriterion("actor_desc between", value1, value2, "actorDesc");
            return (Criteria) this;
        }

        public Criteria andActorDescNotBetween(String value1, String value2) {
            addCriterion("actor_desc not between", value1, value2, "actorDesc");
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