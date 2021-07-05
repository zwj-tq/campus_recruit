package com.smxy.campus_recruit.bean.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRResumeListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CRResumeListExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andToEpNameIsNull() {
            addCriterion("to_ep_name is null");
            return (Criteria) this;
        }

        public Criteria andToEpNameIsNotNull() {
            addCriterion("to_ep_name is not null");
            return (Criteria) this;
        }

        public Criteria andToEpNameEqualTo(String value) {
            addCriterion("to_ep_name =", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameNotEqualTo(String value) {
            addCriterion("to_ep_name <>", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameGreaterThan(String value) {
            addCriterion("to_ep_name >", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_ep_name >=", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameLessThan(String value) {
            addCriterion("to_ep_name <", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameLessThanOrEqualTo(String value) {
            addCriterion("to_ep_name <=", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameLike(String value) {
            addCriterion("to_ep_name like", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameNotLike(String value) {
            addCriterion("to_ep_name not like", value, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameIn(List<String> values) {
            addCriterion("to_ep_name in", values, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameNotIn(List<String> values) {
            addCriterion("to_ep_name not in", values, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameBetween(String value1, String value2) {
            addCriterion("to_ep_name between", value1, value2, "toEpName");
            return (Criteria) this;
        }

        public Criteria andToEpNameNotBetween(String value1, String value2) {
            addCriterion("to_ep_name not between", value1, value2, "toEpName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(String value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(String value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(String value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(String value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(String value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLike(String value) {
            addCriterion("stu_status like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotLike(String value) {
            addCriterion("stu_status not like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<String> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<String> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(String value1, String value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(String value1, String value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuAvatarIsNull() {
            addCriterion("stu_avatar is null");
            return (Criteria) this;
        }

        public Criteria andStuAvatarIsNotNull() {
            addCriterion("stu_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andStuAvatarEqualTo(String value) {
            addCriterion("stu_avatar =", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarNotEqualTo(String value) {
            addCriterion("stu_avatar <>", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarGreaterThan(String value) {
            addCriterion("stu_avatar >", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("stu_avatar >=", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarLessThan(String value) {
            addCriterion("stu_avatar <", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarLessThanOrEqualTo(String value) {
            addCriterion("stu_avatar <=", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarLike(String value) {
            addCriterion("stu_avatar like", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarNotLike(String value) {
            addCriterion("stu_avatar not like", value, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarIn(List<String> values) {
            addCriterion("stu_avatar in", values, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarNotIn(List<String> values) {
            addCriterion("stu_avatar not in", values, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarBetween(String value1, String value2) {
            addCriterion("stu_avatar between", value1, value2, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuAvatarNotBetween(String value1, String value2) {
            addCriterion("stu_avatar not between", value1, value2, "stuAvatar");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeIsNull() {
            addCriterion("stu_start_time is null");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeIsNotNull() {
            addCriterion("stu_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeEqualTo(Date value) {
            addCriterion("stu_start_time =", value, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeNotEqualTo(Date value) {
            addCriterion("stu_start_time <>", value, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeGreaterThan(Date value) {
            addCriterion("stu_start_time >", value, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_start_time >=", value, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeLessThan(Date value) {
            addCriterion("stu_start_time <", value, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_start_time <=", value, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeIn(List<Date> values) {
            addCriterion("stu_start_time in", values, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeNotIn(List<Date> values) {
            addCriterion("stu_start_time not in", values, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeBetween(Date value1, Date value2) {
            addCriterion("stu_start_time between", value1, value2, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_start_time not between", value1, value2, "stuStartTime");
            return (Criteria) this;
        }

        public Criteria andStuAdrIsNull() {
            addCriterion("stu_adr is null");
            return (Criteria) this;
        }

        public Criteria andStuAdrIsNotNull() {
            addCriterion("stu_adr is not null");
            return (Criteria) this;
        }

        public Criteria andStuAdrEqualTo(String value) {
            addCriterion("stu_adr =", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrNotEqualTo(String value) {
            addCriterion("stu_adr <>", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrGreaterThan(String value) {
            addCriterion("stu_adr >", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrGreaterThanOrEqualTo(String value) {
            addCriterion("stu_adr >=", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrLessThan(String value) {
            addCriterion("stu_adr <", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrLessThanOrEqualTo(String value) {
            addCriterion("stu_adr <=", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrLike(String value) {
            addCriterion("stu_adr like", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrNotLike(String value) {
            addCriterion("stu_adr not like", value, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrIn(List<String> values) {
            addCriterion("stu_adr in", values, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrNotIn(List<String> values) {
            addCriterion("stu_adr not in", values, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrBetween(String value1, String value2) {
            addCriterion("stu_adr between", value1, value2, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuAdrNotBetween(String value1, String value2) {
            addCriterion("stu_adr not between", value1, value2, "stuAdr");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobIsNull() {
            addCriterion("stu_expect_job is null");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobIsNotNull() {
            addCriterion("stu_expect_job is not null");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobEqualTo(String value) {
            addCriterion("stu_expect_job =", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobNotEqualTo(String value) {
            addCriterion("stu_expect_job <>", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobGreaterThan(String value) {
            addCriterion("stu_expect_job >", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobGreaterThanOrEqualTo(String value) {
            addCriterion("stu_expect_job >=", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobLessThan(String value) {
            addCriterion("stu_expect_job <", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobLessThanOrEqualTo(String value) {
            addCriterion("stu_expect_job <=", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobLike(String value) {
            addCriterion("stu_expect_job like", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobNotLike(String value) {
            addCriterion("stu_expect_job not like", value, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobIn(List<String> values) {
            addCriterion("stu_expect_job in", values, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobNotIn(List<String> values) {
            addCriterion("stu_expect_job not in", values, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobBetween(String value1, String value2) {
            addCriterion("stu_expect_job between", value1, value2, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andStuExpectJobNotBetween(String value1, String value2) {
            addCriterion("stu_expect_job not between", value1, value2, "stuExpectJob");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(String value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(String value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(String value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(String value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(String value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(String value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLike(String value) {
            addCriterion("review_status like", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotLike(String value) {
            addCriterion("review_status not like", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<String> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<String> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(String value1, String value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(String value1, String value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
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