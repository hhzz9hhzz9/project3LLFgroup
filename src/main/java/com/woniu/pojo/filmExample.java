package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class filmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public filmExample() {
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

        public Criteria andYearIdIsNull() {
            addCriterion("year_id is null");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNotNull() {
            addCriterion("year_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearIdEqualTo(Integer value) {
            addCriterion("year_id =", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotEqualTo(Integer value) {
            addCriterion("year_id <>", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThan(Integer value) {
            addCriterion("year_id >", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_id >=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThan(Integer value) {
            addCriterion("year_id <", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_id <=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdIn(List<Integer> values) {
            addCriterion("year_id in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotIn(List<Integer> values) {
            addCriterion("year_id not in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdBetween(Integer value1, Integer value2) {
            addCriterion("year_id between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_id not between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNull() {
            addCriterion("film_name is null");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNotNull() {
            addCriterion("film_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilmNameEqualTo(String value) {
            addCriterion("film_name =", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotEqualTo(String value) {
            addCriterion("film_name <>", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThan(String value) {
            addCriterion("film_name >", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThanOrEqualTo(String value) {
            addCriterion("film_name >=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThan(String value) {
            addCriterion("film_name <", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThanOrEqualTo(String value) {
            addCriterion("film_name <=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLike(String value) {
            addCriterion("film_name like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotLike(String value) {
            addCriterion("film_name not like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameIn(List<String> values) {
            addCriterion("film_name in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotIn(List<String> values) {
            addCriterion("film_name not in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameBetween(String value1, String value2) {
            addCriterion("film_name between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotBetween(String value1, String value2) {
            addCriterion("film_name not between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNull() {
            addCriterion("img_address is null");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNotNull() {
            addCriterion("img_address is not null");
            return (Criteria) this;
        }

        public Criteria andImgAddressEqualTo(String value) {
            addCriterion("img_address =", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotEqualTo(String value) {
            addCriterion("img_address <>", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThan(String value) {
            addCriterion("img_address >", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("img_address >=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThan(String value) {
            addCriterion("img_address <", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThanOrEqualTo(String value) {
            addCriterion("img_address <=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLike(String value) {
            addCriterion("img_address like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotLike(String value) {
            addCriterion("img_address not like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressIn(List<String> values) {
            addCriterion("img_address in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotIn(List<String> values) {
            addCriterion("img_address not in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressBetween(String value1, String value2) {
            addCriterion("img_address between", value1, value2, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotBetween(String value1, String value2) {
            addCriterion("img_address not between", value1, value2, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andFilmScoreIsNull() {
            addCriterion("film_score is null");
            return (Criteria) this;
        }

        public Criteria andFilmScoreIsNotNull() {
            addCriterion("film_score is not null");
            return (Criteria) this;
        }

        public Criteria andFilmScoreEqualTo(Float value) {
            addCriterion("film_score =", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreNotEqualTo(Float value) {
            addCriterion("film_score <>", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreGreaterThan(Float value) {
            addCriterion("film_score >", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("film_score >=", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreLessThan(Float value) {
            addCriterion("film_score <", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreLessThanOrEqualTo(Float value) {
            addCriterion("film_score <=", value, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreIn(List<Float> values) {
            addCriterion("film_score in", values, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreNotIn(List<Float> values) {
            addCriterion("film_score not in", values, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreBetween(Float value1, Float value2) {
            addCriterion("film_score between", value1, value2, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmScoreNotBetween(Float value1, Float value2) {
            addCriterion("film_score not between", value1, value2, "filmScore");
            return (Criteria) this;
        }

        public Criteria andFilmStatusIsNull() {
            addCriterion("film_status is null");
            return (Criteria) this;
        }

        public Criteria andFilmStatusIsNotNull() {
            addCriterion("film_status is not null");
            return (Criteria) this;
        }

        public Criteria andFilmStatusEqualTo(String value) {
            addCriterion("film_status =", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusNotEqualTo(String value) {
            addCriterion("film_status <>", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusGreaterThan(String value) {
            addCriterion("film_status >", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("film_status >=", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusLessThan(String value) {
            addCriterion("film_status <", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusLessThanOrEqualTo(String value) {
            addCriterion("film_status <=", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusLike(String value) {
            addCriterion("film_status like", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusNotLike(String value) {
            addCriterion("film_status not like", value, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusIn(List<String> values) {
            addCriterion("film_status in", values, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusNotIn(List<String> values) {
            addCriterion("film_status not in", values, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusBetween(String value1, String value2) {
            addCriterion("film_status between", value1, value2, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmStatusNotBetween(String value1, String value2) {
            addCriterion("film_status not between", value1, value2, "filmStatus");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIsNull() {
            addCriterion("film_length is null");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIsNotNull() {
            addCriterion("film_length is not null");
            return (Criteria) this;
        }

        public Criteria andFilmLengthEqualTo(String value) {
            addCriterion("film_length =", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotEqualTo(String value) {
            addCriterion("film_length <>", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthGreaterThan(String value) {
            addCriterion("film_length >", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthGreaterThanOrEqualTo(String value) {
            addCriterion("film_length >=", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLessThan(String value) {
            addCriterion("film_length <", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLessThanOrEqualTo(String value) {
            addCriterion("film_length <=", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLike(String value) {
            addCriterion("film_length like", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotLike(String value) {
            addCriterion("film_length not like", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIn(List<String> values) {
            addCriterion("film_length in", values, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotIn(List<String> values) {
            addCriterion("film_length not in", values, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthBetween(String value1, String value2) {
            addCriterion("film_length between", value1, value2, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotBetween(String value1, String value2) {
            addCriterion("film_length not between", value1, value2, "filmLength");
            return (Criteria) this;
        }

        public Criteria andDirectorIdIsNull() {
            addCriterion("director_id is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIdIsNotNull() {
            addCriterion("director_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorIdEqualTo(Integer value) {
            addCriterion("director_id =", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdNotEqualTo(Integer value) {
            addCriterion("director_id <>", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdGreaterThan(Integer value) {
            addCriterion("director_id >", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("director_id >=", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdLessThan(Integer value) {
            addCriterion("director_id <", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdLessThanOrEqualTo(Integer value) {
            addCriterion("director_id <=", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdIn(List<Integer> values) {
            addCriterion("director_id in", values, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdNotIn(List<Integer> values) {
            addCriterion("director_id not in", values, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdBetween(Integer value1, Integer value2) {
            addCriterion("director_id between", value1, value2, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("director_id not between", value1, value2, "directorId");
            return (Criteria) this;
        }

        public Criteria andFilmHotIsNull() {
            addCriterion("film_hot is null");
            return (Criteria) this;
        }

        public Criteria andFilmHotIsNotNull() {
            addCriterion("film_hot is not null");
            return (Criteria) this;
        }

        public Criteria andFilmHotEqualTo(Integer value) {
            addCriterion("film_hot =", value, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotNotEqualTo(Integer value) {
            addCriterion("film_hot <>", value, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotGreaterThan(Integer value) {
            addCriterion("film_hot >", value, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_hot >=", value, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotLessThan(Integer value) {
            addCriterion("film_hot <", value, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotLessThanOrEqualTo(Integer value) {
            addCriterion("film_hot <=", value, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotIn(List<Integer> values) {
            addCriterion("film_hot in", values, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotNotIn(List<Integer> values) {
            addCriterion("film_hot not in", values, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotBetween(Integer value1, Integer value2) {
            addCriterion("film_hot between", value1, value2, "filmHot");
            return (Criteria) this;
        }

        public Criteria andFilmHotNotBetween(Integer value1, Integer value2) {
            addCriterion("film_hot not between", value1, value2, "filmHot");
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