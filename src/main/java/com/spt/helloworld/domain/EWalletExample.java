package com.spt.helloworld.domain;

import java.util.ArrayList;
import java.util.List;

public class EWalletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EWalletExample() {
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

        public Criteria andWalledIdIsNull() {
            addCriterion("walled_id is null");
            return (Criteria) this;
        }

        public Criteria andWalledIdIsNotNull() {
            addCriterion("walled_id is not null");
            return (Criteria) this;
        }

        public Criteria andWalledIdEqualTo(Integer value) {
            addCriterion("walled_id =", value, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdNotEqualTo(Integer value) {
            addCriterion("walled_id <>", value, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdGreaterThan(Integer value) {
            addCriterion("walled_id >", value, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("walled_id >=", value, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdLessThan(Integer value) {
            addCriterion("walled_id <", value, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdLessThanOrEqualTo(Integer value) {
            addCriterion("walled_id <=", value, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdIn(List<Integer> values) {
            addCriterion("walled_id in", values, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdNotIn(List<Integer> values) {
            addCriterion("walled_id not in", values, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdBetween(Integer value1, Integer value2) {
            addCriterion("walled_id between", value1, value2, "walledId");
            return (Criteria) this;
        }

        public Criteria andWalledIdNotBetween(Integer value1, Integer value2) {
            addCriterion("walled_id not between", value1, value2, "walledId");
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

        public Criteria andMoneryIsNull() {
            addCriterion("monery is null");
            return (Criteria) this;
        }

        public Criteria andMoneryIsNotNull() {
            addCriterion("monery is not null");
            return (Criteria) this;
        }

        public Criteria andMoneryEqualTo(Double value) {
            addCriterion("monery =", value, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryNotEqualTo(Double value) {
            addCriterion("monery <>", value, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryGreaterThan(Double value) {
            addCriterion("monery >", value, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryGreaterThanOrEqualTo(Double value) {
            addCriterion("monery >=", value, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryLessThan(Double value) {
            addCriterion("monery <", value, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryLessThanOrEqualTo(Double value) {
            addCriterion("monery <=", value, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryIn(List<Double> values) {
            addCriterion("monery in", values, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryNotIn(List<Double> values) {
            addCriterion("monery not in", values, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryBetween(Double value1, Double value2) {
            addCriterion("monery between", value1, value2, "monery");
            return (Criteria) this;
        }

        public Criteria andMoneryNotBetween(Double value1, Double value2) {
            addCriterion("monery not between", value1, value2, "monery");
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