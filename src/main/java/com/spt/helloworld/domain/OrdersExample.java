package com.spt.helloworld.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andONumberIsNull() {
            addCriterion("o_number is null");
            return (Criteria) this;
        }

        public Criteria andONumberIsNotNull() {
            addCriterion("o_number is not null");
            return (Criteria) this;
        }

        public Criteria andONumberEqualTo(Integer value) {
            addCriterion("o_number =", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotEqualTo(Integer value) {
            addCriterion("o_number <>", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberGreaterThan(Integer value) {
            addCriterion("o_number >", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_number >=", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberLessThan(Integer value) {
            addCriterion("o_number <", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberLessThanOrEqualTo(Integer value) {
            addCriterion("o_number <=", value, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberIn(List<Integer> values) {
            addCriterion("o_number in", values, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotIn(List<Integer> values) {
            addCriterion("o_number not in", values, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberBetween(Integer value1, Integer value2) {
            addCriterion("o_number between", value1, value2, "oNumber");
            return (Criteria) this;
        }

        public Criteria andONumberNotBetween(Integer value1, Integer value2) {
            addCriterion("o_number not between", value1, value2, "oNumber");
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

        public Criteria andOAddressIsNull() {
            addCriterion("o_address is null");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNotNull() {
            addCriterion("o_address is not null");
            return (Criteria) this;
        }

        public Criteria andOAddressEqualTo(String value) {
            addCriterion("o_address =", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotEqualTo(String value) {
            addCriterion("o_address <>", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThan(String value) {
            addCriterion("o_address >", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThanOrEqualTo(String value) {
            addCriterion("o_address >=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThan(String value) {
            addCriterion("o_address <", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThanOrEqualTo(String value) {
            addCriterion("o_address <=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLike(String value) {
            addCriterion("o_address like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotLike(String value) {
            addCriterion("o_address not like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressIn(List<String> values) {
            addCriterion("o_address in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotIn(List<String> values) {
            addCriterion("o_address not in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressBetween(String value1, String value2) {
            addCriterion("o_address between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotBetween(String value1, String value2) {
            addCriterion("o_address not between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOMoneyIsNull() {
            addCriterion("o_money is null");
            return (Criteria) this;
        }

        public Criteria andOMoneyIsNotNull() {
            addCriterion("o_money is not null");
            return (Criteria) this;
        }

        public Criteria andOMoneyEqualTo(Double value) {
            addCriterion("o_money =", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotEqualTo(Double value) {
            addCriterion("o_money <>", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyGreaterThan(Double value) {
            addCriterion("o_money >", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("o_money >=", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyLessThan(Double value) {
            addCriterion("o_money <", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyLessThanOrEqualTo(Double value) {
            addCriterion("o_money <=", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyIn(List<Double> values) {
            addCriterion("o_money in", values, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotIn(List<Double> values) {
            addCriterion("o_money not in", values, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyBetween(Double value1, Double value2) {
            addCriterion("o_money between", value1, value2, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotBetween(Double value1, Double value2) {
            addCriterion("o_money not between", value1, value2, "oMoney");
            return (Criteria) this;
        }

        public Criteria andODateIsNull() {
            addCriterion("o_date is null");
            return (Criteria) this;
        }

        public Criteria andODateIsNotNull() {
            addCriterion("o_date is not null");
            return (Criteria) this;
        }

        public Criteria andODateEqualTo(Date value) {
            addCriterion("o_date =", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotEqualTo(Date value) {
            addCriterion("o_date <>", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThan(Date value) {
            addCriterion("o_date >", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThanOrEqualTo(Date value) {
            addCriterion("o_date >=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThan(Date value) {
            addCriterion("o_date <", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThanOrEqualTo(Date value) {
            addCriterion("o_date <=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateIn(List<Date> values) {
            addCriterion("o_date in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotIn(List<Date> values) {
            addCriterion("o_date not in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateBetween(Date value1, Date value2) {
            addCriterion("o_date between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotBetween(Date value1, Date value2) {
            addCriterion("o_date not between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(String value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(String value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(String value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(String value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(String value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(String value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLike(String value) {
            addCriterion("o_status like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotLike(String value) {
            addCriterion("o_status not like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<String> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<String> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(String value1, String value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(String value1, String value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
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