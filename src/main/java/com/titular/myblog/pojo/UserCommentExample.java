package com.titular.myblog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCommentExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Byte value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Byte value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Byte value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Byte value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Byte> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Byte> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNull() {
            addCriterion("commit_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNotNull() {
            addCriterion("commit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitIdEqualTo(Integer value) {
            addCriterion("commit_id =", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotEqualTo(Integer value) {
            addCriterion("commit_id <>", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThan(Integer value) {
            addCriterion("commit_id >", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_id >=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThan(Integer value) {
            addCriterion("commit_id <", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThanOrEqualTo(Integer value) {
            addCriterion("commit_id <=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdIn(List<Integer> values) {
            addCriterion("commit_id in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotIn(List<Integer> values) {
            addCriterion("commit_id not in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdBetween(Integer value1, Integer value2) {
            addCriterion("commit_id between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_id not between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitContentIsNull() {
            addCriterion("commit_content is null");
            return (Criteria) this;
        }

        public Criteria andCommitContentIsNotNull() {
            addCriterion("commit_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommitContentEqualTo(String value) {
            addCriterion("commit_content =", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotEqualTo(String value) {
            addCriterion("commit_content <>", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentGreaterThan(String value) {
            addCriterion("commit_content >", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentGreaterThanOrEqualTo(String value) {
            addCriterion("commit_content >=", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentLessThan(String value) {
            addCriterion("commit_content <", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentLessThanOrEqualTo(String value) {
            addCriterion("commit_content <=", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentLike(String value) {
            addCriterion("commit_content like", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotLike(String value) {
            addCriterion("commit_content not like", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentIn(List<String> values) {
            addCriterion("commit_content in", values, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotIn(List<String> values) {
            addCriterion("commit_content not in", values, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentBetween(String value1, String value2) {
            addCriterion("commit_content between", value1, value2, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotBetween(String value1, String value2) {
            addCriterion("commit_content not between", value1, value2, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdIsNull() {
            addCriterion("commit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdIsNotNull() {
            addCriterion("commit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdEqualTo(Integer value) {
            addCriterion("commit_user_id =", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdNotEqualTo(Integer value) {
            addCriterion("commit_user_id <>", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdGreaterThan(Integer value) {
            addCriterion("commit_user_id >", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_user_id >=", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdLessThan(Integer value) {
            addCriterion("commit_user_id <", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("commit_user_id <=", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdIn(List<Integer> values) {
            addCriterion("commit_user_id in", values, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdNotIn(List<Integer> values) {
            addCriterion("commit_user_id not in", values, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdBetween(Integer value1, Integer value2) {
            addCriterion("commit_user_id between", value1, value2, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_user_id not between", value1, value2, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("commit_time is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(Date value) {
            addCriterion("commit_time =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(Date value) {
            addCriterion("commit_time <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(Date value) {
            addCriterion("commit_time >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commit_time >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(Date value) {
            addCriterion("commit_time <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("commit_time <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<Date> values) {
            addCriterion("commit_time in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<Date> values) {
            addCriterion("commit_time not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(Date value1, Date value2) {
            addCriterion("commit_time between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("commit_time not between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitIpIsNull() {
            addCriterion("commit_ip is null");
            return (Criteria) this;
        }

        public Criteria andCommitIpIsNotNull() {
            addCriterion("commit_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCommitIpEqualTo(String value) {
            addCriterion("commit_ip =", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpNotEqualTo(String value) {
            addCriterion("commit_ip <>", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpGreaterThan(String value) {
            addCriterion("commit_ip >", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpGreaterThanOrEqualTo(String value) {
            addCriterion("commit_ip >=", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpLessThan(String value) {
            addCriterion("commit_ip <", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpLessThanOrEqualTo(String value) {
            addCriterion("commit_ip <=", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpLike(String value) {
            addCriterion("commit_ip like", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpNotLike(String value) {
            addCriterion("commit_ip not like", value, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpIn(List<String> values) {
            addCriterion("commit_ip in", values, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpNotIn(List<String> values) {
            addCriterion("commit_ip not in", values, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpBetween(String value1, String value2) {
            addCriterion("commit_ip between", value1, value2, "commitIp");
            return (Criteria) this;
        }

        public Criteria andCommitIpNotBetween(String value1, String value2) {
            addCriterion("commit_ip not between", value1, value2, "commitIp");
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