package com.smxy.campus_recruit.bean.example;

import java.util.ArrayList;
import java.util.List;

public class CRJobListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CRJobListExample() {
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

        public Criteria andJobRequirementIsNull() {
            addCriterion("job_requirement is null");
            return (Criteria) this;
        }

        public Criteria andJobRequirementIsNotNull() {
            addCriterion("job_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andJobRequirementEqualTo(String value) {
            addCriterion("job_requirement =", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementNotEqualTo(String value) {
            addCriterion("job_requirement <>", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementGreaterThan(String value) {
            addCriterion("job_requirement >", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("job_requirement >=", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementLessThan(String value) {
            addCriterion("job_requirement <", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementLessThanOrEqualTo(String value) {
            addCriterion("job_requirement <=", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementLike(String value) {
            addCriterion("job_requirement like", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementNotLike(String value) {
            addCriterion("job_requirement not like", value, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementIn(List<String> values) {
            addCriterion("job_requirement in", values, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementNotIn(List<String> values) {
            addCriterion("job_requirement not in", values, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementBetween(String value1, String value2) {
            addCriterion("job_requirement between", value1, value2, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andJobRequirementNotBetween(String value1, String value2) {
            addCriterion("job_requirement not between", value1, value2, "jobRequirement");
            return (Criteria) this;
        }

        public Criteria andEpNameIsNull() {
            addCriterion("ep_name is null");
            return (Criteria) this;
        }

        public Criteria andEpNameIsNotNull() {
            addCriterion("ep_name is not null");
            return (Criteria) this;
        }

        public Criteria andEpNameEqualTo(String value) {
            addCriterion("ep_name =", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotEqualTo(String value) {
            addCriterion("ep_name <>", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameGreaterThan(String value) {
            addCriterion("ep_name >", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameGreaterThanOrEqualTo(String value) {
            addCriterion("ep_name >=", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameLessThan(String value) {
            addCriterion("ep_name <", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameLessThanOrEqualTo(String value) {
            addCriterion("ep_name <=", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameLike(String value) {
            addCriterion("ep_name like", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotLike(String value) {
            addCriterion("ep_name not like", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameIn(List<String> values) {
            addCriterion("ep_name in", values, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotIn(List<String> values) {
            addCriterion("ep_name not in", values, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameBetween(String value1, String value2) {
            addCriterion("ep_name between", value1, value2, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotBetween(String value1, String value2) {
            addCriterion("ep_name not between", value1, value2, "epName");
            return (Criteria) this;
        }

        public Criteria andEpAvatarIsNull() {
            addCriterion("ep_avatar is null");
            return (Criteria) this;
        }

        public Criteria andEpAvatarIsNotNull() {
            addCriterion("ep_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andEpAvatarEqualTo(String value) {
            addCriterion("ep_avatar =", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarNotEqualTo(String value) {
            addCriterion("ep_avatar <>", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarGreaterThan(String value) {
            addCriterion("ep_avatar >", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("ep_avatar >=", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarLessThan(String value) {
            addCriterion("ep_avatar <", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarLessThanOrEqualTo(String value) {
            addCriterion("ep_avatar <=", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarLike(String value) {
            addCriterion("ep_avatar like", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarNotLike(String value) {
            addCriterion("ep_avatar not like", value, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarIn(List<String> values) {
            addCriterion("ep_avatar in", values, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarNotIn(List<String> values) {
            addCriterion("ep_avatar not in", values, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarBetween(String value1, String value2) {
            addCriterion("ep_avatar between", value1, value2, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpAvatarNotBetween(String value1, String value2) {
            addCriterion("ep_avatar not between", value1, value2, "epAvatar");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceIsNull() {
            addCriterion("ep_introduce is null");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceIsNotNull() {
            addCriterion("ep_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceEqualTo(String value) {
            addCriterion("ep_introduce =", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceNotEqualTo(String value) {
            addCriterion("ep_introduce <>", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceGreaterThan(String value) {
            addCriterion("ep_introduce >", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ep_introduce >=", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceLessThan(String value) {
            addCriterion("ep_introduce <", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ep_introduce <=", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceLike(String value) {
            addCriterion("ep_introduce like", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceNotLike(String value) {
            addCriterion("ep_introduce not like", value, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceIn(List<String> values) {
            addCriterion("ep_introduce in", values, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceNotIn(List<String> values) {
            addCriterion("ep_introduce not in", values, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceBetween(String value1, String value2) {
            addCriterion("ep_introduce between", value1, value2, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpIntroduceNotBetween(String value1, String value2) {
            addCriterion("ep_introduce not between", value1, value2, "epIntroduce");
            return (Criteria) this;
        }

        public Criteria andEpTypeIsNull() {
            addCriterion("ep_type is null");
            return (Criteria) this;
        }

        public Criteria andEpTypeIsNotNull() {
            addCriterion("ep_type is not null");
            return (Criteria) this;
        }

        public Criteria andEpTypeEqualTo(String value) {
            addCriterion("ep_type =", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeNotEqualTo(String value) {
            addCriterion("ep_type <>", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeGreaterThan(String value) {
            addCriterion("ep_type >", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ep_type >=", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeLessThan(String value) {
            addCriterion("ep_type <", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeLessThanOrEqualTo(String value) {
            addCriterion("ep_type <=", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeLike(String value) {
            addCriterion("ep_type like", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeNotLike(String value) {
            addCriterion("ep_type not like", value, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeIn(List<String> values) {
            addCriterion("ep_type in", values, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeNotIn(List<String> values) {
            addCriterion("ep_type not in", values, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeBetween(String value1, String value2) {
            addCriterion("ep_type between", value1, value2, "epType");
            return (Criteria) this;
        }

        public Criteria andEpTypeNotBetween(String value1, String value2) {
            addCriterion("ep_type not between", value1, value2, "epType");
            return (Criteria) this;
        }

        public Criteria andEpCodeIsNull() {
            addCriterion("ep_code is null");
            return (Criteria) this;
        }

        public Criteria andEpCodeIsNotNull() {
            addCriterion("ep_code is not null");
            return (Criteria) this;
        }

        public Criteria andEpCodeEqualTo(String value) {
            addCriterion("ep_code =", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeNotEqualTo(String value) {
            addCriterion("ep_code <>", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeGreaterThan(String value) {
            addCriterion("ep_code >", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ep_code >=", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeLessThan(String value) {
            addCriterion("ep_code <", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeLessThanOrEqualTo(String value) {
            addCriterion("ep_code <=", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeLike(String value) {
            addCriterion("ep_code like", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeNotLike(String value) {
            addCriterion("ep_code not like", value, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeIn(List<String> values) {
            addCriterion("ep_code in", values, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeNotIn(List<String> values) {
            addCriterion("ep_code not in", values, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeBetween(String value1, String value2) {
            addCriterion("ep_code between", value1, value2, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpCodeNotBetween(String value1, String value2) {
            addCriterion("ep_code not between", value1, value2, "epCode");
            return (Criteria) this;
        }

        public Criteria andEpAdrIsNull() {
            addCriterion("ep_adr is null");
            return (Criteria) this;
        }

        public Criteria andEpAdrIsNotNull() {
            addCriterion("ep_adr is not null");
            return (Criteria) this;
        }

        public Criteria andEpAdrEqualTo(String value) {
            addCriterion("ep_adr =", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrNotEqualTo(String value) {
            addCriterion("ep_adr <>", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrGreaterThan(String value) {
            addCriterion("ep_adr >", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrGreaterThanOrEqualTo(String value) {
            addCriterion("ep_adr >=", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrLessThan(String value) {
            addCriterion("ep_adr <", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrLessThanOrEqualTo(String value) {
            addCriterion("ep_adr <=", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrLike(String value) {
            addCriterion("ep_adr like", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrNotLike(String value) {
            addCriterion("ep_adr not like", value, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrIn(List<String> values) {
            addCriterion("ep_adr in", values, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrNotIn(List<String> values) {
            addCriterion("ep_adr not in", values, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrBetween(String value1, String value2) {
            addCriterion("ep_adr between", value1, value2, "epAdr");
            return (Criteria) this;
        }

        public Criteria andEpAdrNotBetween(String value1, String value2) {
            addCriterion("ep_adr not between", value1, value2, "epAdr");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobMoneyIsNull() {
            addCriterion("job_money is null");
            return (Criteria) this;
        }

        public Criteria andJobMoneyIsNotNull() {
            addCriterion("job_money is not null");
            return (Criteria) this;
        }

        public Criteria andJobMoneyEqualTo(String value) {
            addCriterion("job_money =", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyNotEqualTo(String value) {
            addCriterion("job_money <>", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyGreaterThan(String value) {
            addCriterion("job_money >", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("job_money >=", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyLessThan(String value) {
            addCriterion("job_money <", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyLessThanOrEqualTo(String value) {
            addCriterion("job_money <=", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyLike(String value) {
            addCriterion("job_money like", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyNotLike(String value) {
            addCriterion("job_money not like", value, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyIn(List<String> values) {
            addCriterion("job_money in", values, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyNotIn(List<String> values) {
            addCriterion("job_money not in", values, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyBetween(String value1, String value2) {
            addCriterion("job_money between", value1, value2, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobMoneyNotBetween(String value1, String value2) {
            addCriterion("job_money not between", value1, value2, "jobMoney");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeIsNull() {
            addCriterion("job_se_time is null");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeIsNotNull() {
            addCriterion("job_se_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeEqualTo(String value) {
            addCriterion("job_se_time =", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeNotEqualTo(String value) {
            addCriterion("job_se_time <>", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeGreaterThan(String value) {
            addCriterion("job_se_time >", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("job_se_time >=", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeLessThan(String value) {
            addCriterion("job_se_time <", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeLessThanOrEqualTo(String value) {
            addCriterion("job_se_time <=", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeLike(String value) {
            addCriterion("job_se_time like", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeNotLike(String value) {
            addCriterion("job_se_time not like", value, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeIn(List<String> values) {
            addCriterion("job_se_time in", values, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeNotIn(List<String> values) {
            addCriterion("job_se_time not in", values, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeBetween(String value1, String value2) {
            addCriterion("job_se_time between", value1, value2, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobSeTimeNotBetween(String value1, String value2) {
            addCriterion("job_se_time not between", value1, value2, "jobSeTime");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredIsNull() {
            addCriterion("job_degree_required is null");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredIsNotNull() {
            addCriterion("job_degree_required is not null");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredEqualTo(String value) {
            addCriterion("job_degree_required =", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredNotEqualTo(String value) {
            addCriterion("job_degree_required <>", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredGreaterThan(String value) {
            addCriterion("job_degree_required >", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("job_degree_required >=", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredLessThan(String value) {
            addCriterion("job_degree_required <", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredLessThanOrEqualTo(String value) {
            addCriterion("job_degree_required <=", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredLike(String value) {
            addCriterion("job_degree_required like", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredNotLike(String value) {
            addCriterion("job_degree_required not like", value, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredIn(List<String> values) {
            addCriterion("job_degree_required in", values, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredNotIn(List<String> values) {
            addCriterion("job_degree_required not in", values, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredBetween(String value1, String value2) {
            addCriterion("job_degree_required between", value1, value2, "jobDegreeRequired");
            return (Criteria) this;
        }

        public Criteria andJobDegreeRequiredNotBetween(String value1, String value2) {
            addCriterion("job_degree_required not between", value1, value2, "jobDegreeRequired");
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