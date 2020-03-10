package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class usersExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected Integer limitStart;

	protected Integer limitSize;

	public usersExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNull() {
			addCriterion("user_pwd is null");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNotNull() {
			addCriterion("user_pwd is not null");
			return (Criteria) this;
		}

		public Criteria andUserPwdEqualTo(String value) {
			addCriterion("user_pwd =", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotEqualTo(String value) {
			addCriterion("user_pwd <>", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThan(String value) {
			addCriterion("user_pwd >", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
			addCriterion("user_pwd >=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThan(String value) {
			addCriterion("user_pwd <", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThanOrEqualTo(String value) {
			addCriterion("user_pwd <=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLike(String value) {
			addCriterion("user_pwd like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotLike(String value) {
			addCriterion("user_pwd not like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdIn(List<String> values) {
			addCriterion("user_pwd in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotIn(List<String> values) {
			addCriterion("user_pwd not in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdBetween(String value1, String value2) {
			addCriterion("user_pwd between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotBetween(String value1, String value2) {
			addCriterion("user_pwd not between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNull() {
			addCriterion("nick_name is null");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNotNull() {
			addCriterion("nick_name is not null");
			return (Criteria) this;
		}

		public Criteria andNickNameEqualTo(String value) {
			addCriterion("nick_name =", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotEqualTo(String value) {
			addCriterion("nick_name <>", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThan(String value) {
			addCriterion("nick_name >", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThanOrEqualTo(String value) {
			addCriterion("nick_name >=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThan(String value) {
			addCriterion("nick_name <", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThanOrEqualTo(String value) {
			addCriterion("nick_name <=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLike(String value) {
			addCriterion("nick_name like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotLike(String value) {
			addCriterion("nick_name not like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameIn(List<String> values) {
			addCriterion("nick_name in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotIn(List<String> values) {
			addCriterion("nick_name not in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameBetween(String value1, String value2) {
			addCriterion("nick_name between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotBetween(String value1, String value2) {
			addCriterion("nick_name not between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andGendarIsNull() {
			addCriterion("gendar is null");
			return (Criteria) this;
		}

		public Criteria andGendarIsNotNull() {
			addCriterion("gendar is not null");
			return (Criteria) this;
		}

		public Criteria andGendarEqualTo(String value) {
			addCriterion("gendar =", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarNotEqualTo(String value) {
			addCriterion("gendar <>", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarGreaterThan(String value) {
			addCriterion("gendar >", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarGreaterThanOrEqualTo(String value) {
			addCriterion("gendar >=", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarLessThan(String value) {
			addCriterion("gendar <", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarLessThanOrEqualTo(String value) {
			addCriterion("gendar <=", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarLike(String value) {
			addCriterion("gendar like", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarNotLike(String value) {
			addCriterion("gendar not like", value, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarIn(List<String> values) {
			addCriterion("gendar in", values, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarNotIn(List<String> values) {
			addCriterion("gendar not in", values, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarBetween(String value1, String value2) {
			addCriterion("gendar between", value1, value2, "gendar");
			return (Criteria) this;
		}

		public Criteria andGendarNotBetween(String value1, String value2) {
			addCriterion("gendar not between", value1, value2, "gendar");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNull() {
			addCriterion("birthday is null");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNotNull() {
			addCriterion("birthday is not null");
			return (Criteria) this;
		}

		public Criteria andBirthdayEqualTo(Date value) {
			addCriterionForJDBCDate("birthday =", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotEqualTo(Date value) {
			addCriterionForJDBCDate("birthday <>", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThan(Date value) {
			addCriterionForJDBCDate("birthday >", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birthday >=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThan(Date value) {
			addCriterionForJDBCDate("birthday <", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birthday <=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayIn(List<Date> values) {
			addCriterionForJDBCDate("birthday in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotIn(List<Date> values) {
			addCriterionForJDBCDate("birthday not in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNull() {
			addCriterion("user_phone is null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNotNull() {
			addCriterion("user_phone is not null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneEqualTo(String value) {
			addCriterion("user_phone =", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotEqualTo(String value) {
			addCriterion("user_phone <>", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThan(String value) {
			addCriterion("user_phone >", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("user_phone >=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThan(String value) {
			addCriterion("user_phone <", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThanOrEqualTo(String value) {
			addCriterion("user_phone <=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLike(String value) {
			addCriterion("user_phone like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotLike(String value) {
			addCriterion("user_phone not like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIn(List<String> values) {
			addCriterion("user_phone in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotIn(List<String> values) {
			addCriterion("user_phone not in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneBetween(String value1, String value2) {
			addCriterion("user_phone between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotBetween(String value1, String value2) {
			addCriterion("user_phone not between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andHeadUrlIsNull() {
			addCriterion("head_url is null");
			return (Criteria) this;
		}

		public Criteria andHeadUrlIsNotNull() {
			addCriterion("head_url is not null");
			return (Criteria) this;
		}

		public Criteria andHeadUrlEqualTo(String value) {
			addCriterion("head_url =", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlNotEqualTo(String value) {
			addCriterion("head_url <>", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlGreaterThan(String value) {
			addCriterion("head_url >", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlGreaterThanOrEqualTo(String value) {
			addCriterion("head_url >=", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlLessThan(String value) {
			addCriterion("head_url <", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlLessThanOrEqualTo(String value) {
			addCriterion("head_url <=", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlLike(String value) {
			addCriterion("head_url like", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlNotLike(String value) {
			addCriterion("head_url not like", value, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlIn(List<String> values) {
			addCriterion("head_url in", values, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlNotIn(List<String> values) {
			addCriterion("head_url not in", values, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlBetween(String value1, String value2) {
			addCriterion("head_url between", value1, value2, "headUrl");
			return (Criteria) this;
		}

		public Criteria andHeadUrlNotBetween(String value1, String value2) {
			addCriterion("head_url not between", value1, value2, "headUrl");
			return (Criteria) this;
		}

		public Criteria andBiographyIsNull() {
			addCriterion("biography is null");
			return (Criteria) this;
		}

		public Criteria andBiographyIsNotNull() {
			addCriterion("biography is not null");
			return (Criteria) this;
		}

		public Criteria andBiographyEqualTo(String value) {
			addCriterion("biography =", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyNotEqualTo(String value) {
			addCriterion("biography <>", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyGreaterThan(String value) {
			addCriterion("biography >", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyGreaterThanOrEqualTo(String value) {
			addCriterion("biography >=", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyLessThan(String value) {
			addCriterion("biography <", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyLessThanOrEqualTo(String value) {
			addCriterion("biography <=", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyLike(String value) {
			addCriterion("biography like", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyNotLike(String value) {
			addCriterion("biography not like", value, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyIn(List<String> values) {
			addCriterion("biography in", values, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyNotIn(List<String> values) {
			addCriterion("biography not in", values, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyBetween(String value1, String value2) {
			addCriterion("biography between", value1, value2, "biography");
			return (Criteria) this;
		}

		public Criteria andBiographyNotBetween(String value1, String value2) {
			addCriterion("biography not between", value1, value2, "biography");
			return (Criteria) this;
		}

		public Criteria andBeginTimeIsNull() {
			addCriterion("begin_time is null");
			return (Criteria) this;
		}

		public Criteria andBeginTimeIsNotNull() {
			addCriterion("begin_time is not null");
			return (Criteria) this;
		}

		public Criteria andBeginTimeEqualTo(Date value) {
			addCriterion("begin_time =", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeNotEqualTo(Date value) {
			addCriterion("begin_time <>", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeGreaterThan(Date value) {
			addCriterion("begin_time >", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("begin_time >=", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeLessThan(Date value) {
			addCriterion("begin_time <", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
			addCriterion("begin_time <=", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeIn(List<Date> values) {
			addCriterion("begin_time in", values, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeNotIn(List<Date> values) {
			addCriterion("begin_time not in", values, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeBetween(Date value1, Date value2) {
			addCriterion("begin_time between", value1, value2, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
			addCriterion("begin_time not between", value1, value2, "beginTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeIsNull() {
			addCriterion("login_time is null");
			return (Criteria) this;
		}

		public Criteria andLoginTimeIsNotNull() {
			addCriterion("login_time is not null");
			return (Criteria) this;
		}

		public Criteria andLoginTimeEqualTo(Date value) {
			addCriterion("login_time =", value, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeNotEqualTo(Date value) {
			addCriterion("login_time <>", value, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeGreaterThan(Date value) {
			addCriterion("login_time >", value, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("login_time >=", value, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeLessThan(Date value) {
			addCriterion("login_time <", value, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
			addCriterion("login_time <=", value, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeIn(List<Date> values) {
			addCriterion("login_time in", values, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeNotIn(List<Date> values) {
			addCriterion("login_time not in", values, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeBetween(Date value1, Date value2) {
			addCriterion("login_time between", value1, value2, "loginTime");
			return (Criteria) this;
		}

		public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
			addCriterion("login_time not between", value1, value2, "loginTime");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNull() {
			addCriterion("user_status is null");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNotNull() {
			addCriterion("user_status is not null");
			return (Criteria) this;
		}

		public Criteria andUserStatusEqualTo(Integer value) {
			addCriterion("user_status =", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotEqualTo(Integer value) {
			addCriterion("user_status <>", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThan(Integer value) {
			addCriterion("user_status >", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_status >=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThan(Integer value) {
			addCriterion("user_status <", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
			addCriterion("user_status <=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusIn(List<Integer> values) {
			addCriterion("user_status in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotIn(List<Integer> values) {
			addCriterion("user_status not in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusBetween(Integer value1, Integer value2) {
			addCriterion("user_status between", value1, value2, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("user_status not between", value1, value2, "userStatus");
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