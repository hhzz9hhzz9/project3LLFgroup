package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class speakerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public speakerExample() {
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

        public Criteria andSpeakerIdIsNull() {
            addCriterion("speaker_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdIsNotNull() {
            addCriterion("speaker_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdEqualTo(Integer value) {
            addCriterion("speaker_id =", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdNotEqualTo(Integer value) {
            addCriterion("speaker_id <>", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdGreaterThan(Integer value) {
            addCriterion("speaker_id >", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speaker_id >=", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdLessThan(Integer value) {
            addCriterion("speaker_id <", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdLessThanOrEqualTo(Integer value) {
            addCriterion("speaker_id <=", value, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdIn(List<Integer> values) {
            addCriterion("speaker_id in", values, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdNotIn(List<Integer> values) {
            addCriterion("speaker_id not in", values, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdBetween(Integer value1, Integer value2) {
            addCriterion("speaker_id between", value1, value2, "speakerId");
            return (Criteria) this;
        }

        public Criteria andSpeakerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speaker_id not between", value1, value2, "speakerId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNull() {
            addCriterion("film_id is null");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNotNull() {
            addCriterion("film_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilmIdEqualTo(Integer value) {
            addCriterion("film_id =", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotEqualTo(Integer value) {
            addCriterion("film_id <>", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThan(Integer value) {
            addCriterion("film_id >", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_id >=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThan(Integer value) {
            addCriterion("film_id <", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("film_id <=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIn(List<Integer> values) {
            addCriterion("film_id in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotIn(List<Integer> values) {
            addCriterion("film_id not in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("film_id between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("film_id not between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextIsNull() {
            addCriterion("speaker_context is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextIsNotNull() {
            addCriterion("speaker_context is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextEqualTo(String value) {
            addCriterion("speaker_context =", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextNotEqualTo(String value) {
            addCriterion("speaker_context <>", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextGreaterThan(String value) {
            addCriterion("speaker_context >", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_context >=", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextLessThan(String value) {
            addCriterion("speaker_context <", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextLessThanOrEqualTo(String value) {
            addCriterion("speaker_context <=", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextLike(String value) {
            addCriterion("speaker_context like", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextNotLike(String value) {
            addCriterion("speaker_context not like", value, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextIn(List<String> values) {
            addCriterion("speaker_context in", values, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextNotIn(List<String> values) {
            addCriterion("speaker_context not in", values, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextBetween(String value1, String value2) {
            addCriterion("speaker_context between", value1, value2, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerContextNotBetween(String value1, String value2) {
            addCriterion("speaker_context not between", value1, value2, "speakerContext");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusIsNull() {
            addCriterion("speaker_status is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusIsNotNull() {
            addCriterion("speaker_status is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusEqualTo(Integer value) {
            addCriterion("speaker_status =", value, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusNotEqualTo(Integer value) {
            addCriterion("speaker_status <>", value, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusGreaterThan(Integer value) {
            addCriterion("speaker_status >", value, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("speaker_status >=", value, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusLessThan(Integer value) {
            addCriterion("speaker_status <", value, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("speaker_status <=", value, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusIn(List<Integer> values) {
            addCriterion("speaker_status in", values, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusNotIn(List<Integer> values) {
            addCriterion("speaker_status not in", values, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusBetween(Integer value1, Integer value2) {
            addCriterion("speaker_status between", value1, value2, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andSpeakerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("speaker_status not between", value1, value2, "speakerStatus");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreIsNull() {
            addCriterion("user_film_socore is null");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreIsNotNull() {
            addCriterion("user_film_socore is not null");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreEqualTo(Float value) {
            addCriterion("user_film_socore =", value, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreNotEqualTo(Float value) {
            addCriterion("user_film_socore <>", value, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreGreaterThan(Float value) {
            addCriterion("user_film_socore >", value, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreGreaterThanOrEqualTo(Float value) {
            addCriterion("user_film_socore >=", value, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreLessThan(Float value) {
            addCriterion("user_film_socore <", value, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreLessThanOrEqualTo(Float value) {
            addCriterion("user_film_socore <=", value, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreIn(List<Float> values) {
            addCriterion("user_film_socore in", values, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreNotIn(List<Float> values) {
            addCriterion("user_film_socore not in", values, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreBetween(Float value1, Float value2) {
            addCriterion("user_film_socore between", value1, value2, "userFilmSocore");
            return (Criteria) this;
        }

        public Criteria andUserFilmSocoreNotBetween(Float value1, Float value2) {
            addCriterion("user_film_socore not between", value1, value2, "userFilmSocore");
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