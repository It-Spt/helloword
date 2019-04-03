package com.spt.helloworld.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLMoneyIsNull() {
            addCriterion("l_money is null");
            return (Criteria) this;
        }

        public Criteria andLMoneyIsNotNull() {
            addCriterion("l_money is not null");
            return (Criteria) this;
        }

        public Criteria andLMoneyEqualTo(String value) {
            addCriterion("l_money =", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyNotEqualTo(String value) {
            addCriterion("l_money <>", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyGreaterThan(String value) {
            addCriterion("l_money >", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("l_money >=", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyLessThan(String value) {
            addCriterion("l_money <", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyLessThanOrEqualTo(String value) {
            addCriterion("l_money <=", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyLike(String value) {
            addCriterion("l_money like", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyNotLike(String value) {
            addCriterion("l_money not like", value, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyIn(List<String> values) {
            addCriterion("l_money in", values, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyNotIn(List<String> values) {
            addCriterion("l_money not in", values, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyBetween(String value1, String value2) {
            addCriterion("l_money between", value1, value2, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLMoneyNotBetween(String value1, String value2) {
            addCriterion("l_money not between", value1, value2, "lMoney");
            return (Criteria) this;
        }

        public Criteria andLDateIsNull() {
            addCriterion("l_date is null");
            return (Criteria) this;
        }

        public Criteria andLDateIsNotNull() {
            addCriterion("l_date is not null");
            return (Criteria) this;
        }

        public Criteria andLDateEqualTo(Date value) {
            addCriterion("l_date =", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotEqualTo(Date value) {
            addCriterion("l_date <>", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateGreaterThan(Date value) {
            addCriterion("l_date >", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateGreaterThanOrEqualTo(Date value) {
            addCriterion("l_date >=", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLessThan(Date value) {
            addCriterion("l_date <", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateLessThanOrEqualTo(Date value) {
            addCriterion("l_date <=", value, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateIn(List<Date> values) {
            addCriterion("l_date in", values, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotIn(List<Date> values) {
            addCriterion("l_date not in", values, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateBetween(Date value1, Date value2) {
            addCriterion("l_date between", value1, value2, "lDate");
            return (Criteria) this;
        }

        public Criteria andLDateNotBetween(Date value1, Date value2) {
            addCriterion("l_date not between", value1, value2, "lDate");
            return (Criteria) this;
        }

        public Criteria andZIdIsNull() {
            addCriterion("z_id is null");
            return (Criteria) this;
        }

        public Criteria andZIdIsNotNull() {
            addCriterion("z_id is not null");
            return (Criteria) this;
        }

        public Criteria andZIdEqualTo(Integer value) {
            addCriterion("z_id =", value, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdNotEqualTo(Integer value) {
            addCriterion("z_id <>", value, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdGreaterThan(Integer value) {
            addCriterion("z_id >", value, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("z_id >=", value, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdLessThan(Integer value) {
            addCriterion("z_id <", value, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdLessThanOrEqualTo(Integer value) {
            addCriterion("z_id <=", value, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdIn(List<Integer> values) {
            addCriterion("z_id in", values, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdNotIn(List<Integer> values) {
            addCriterion("z_id not in", values, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdBetween(Integer value1, Integer value2) {
            addCriterion("z_id between", value1, value2, "zId");
            return (Criteria) this;
        }

        public Criteria andZIdNotBetween(Integer value1, Integer value2) {
            addCriterion("z_id not between", value1, value2, "zId");
            return (Criteria) this;
        }

        public Criteria andLMethodIsNull() {
            addCriterion("l_method is null");
            return (Criteria) this;
        }

        public Criteria andLMethodIsNotNull() {
            addCriterion("l_method is not null");
            return (Criteria) this;
        }

        public Criteria andLMethodEqualTo(String value) {
            addCriterion("l_method =", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodNotEqualTo(String value) {
            addCriterion("l_method <>", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodGreaterThan(String value) {
            addCriterion("l_method >", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodGreaterThanOrEqualTo(String value) {
            addCriterion("l_method >=", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodLessThan(String value) {
            addCriterion("l_method <", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodLessThanOrEqualTo(String value) {
            addCriterion("l_method <=", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodLike(String value) {
            addCriterion("l_method like", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodNotLike(String value) {
            addCriterion("l_method not like", value, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodIn(List<String> values) {
            addCriterion("l_method in", values, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodNotIn(List<String> values) {
            addCriterion("l_method not in", values, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodBetween(String value1, String value2) {
            addCriterion("l_method between", value1, value2, "lMethod");
            return (Criteria) this;
        }

        public Criteria andLMethodNotBetween(String value1, String value2) {
            addCriterion("l_method not between", value1, value2, "lMethod");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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