package com.spt.helloworld.domain;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSCountIsNull() {
            addCriterion("s_count is null");
            return (Criteria) this;
        }

        public Criteria andSCountIsNotNull() {
            addCriterion("s_count is not null");
            return (Criteria) this;
        }

        public Criteria andSCountEqualTo(Integer value) {
            addCriterion("s_count =", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotEqualTo(Integer value) {
            addCriterion("s_count <>", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThan(Integer value) {
            addCriterion("s_count >", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_count >=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThan(Integer value) {
            addCriterion("s_count <", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThanOrEqualTo(Integer value) {
            addCriterion("s_count <=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountIn(List<Integer> values) {
            addCriterion("s_count in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotIn(List<Integer> values) {
            addCriterion("s_count not in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountBetween(Integer value1, Integer value2) {
            addCriterion("s_count between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotBetween(Integer value1, Integer value2) {
            addCriterion("s_count not between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNull() {
            addCriterion("s_price is null");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNotNull() {
            addCriterion("s_price is not null");
            return (Criteria) this;
        }

        public Criteria andSPriceEqualTo(Double value) {
            addCriterion("s_price =", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotEqualTo(Double value) {
            addCriterion("s_price <>", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThan(Double value) {
            addCriterion("s_price >", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("s_price >=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThan(Double value) {
            addCriterion("s_price <", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThanOrEqualTo(Double value) {
            addCriterion("s_price <=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceIn(List<Double> values) {
            addCriterion("s_price in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotIn(List<Double> values) {
            addCriterion("s_price not in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceBetween(Double value1, Double value2) {
            addCriterion("s_price between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotBetween(Double value1, Double value2) {
            addCriterion("s_price not between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsGoIsNull() {
            addCriterion("is_go is null");
            return (Criteria) this;
        }

        public Criteria andIsGoIsNotNull() {
            addCriterion("is_go is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoEqualTo(String value) {
            addCriterion("is_go =", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotEqualTo(String value) {
            addCriterion("is_go <>", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoGreaterThan(String value) {
            addCriterion("is_go >", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoGreaterThanOrEqualTo(String value) {
            addCriterion("is_go >=", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLessThan(String value) {
            addCriterion("is_go <", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLessThanOrEqualTo(String value) {
            addCriterion("is_go <=", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLike(String value) {
            addCriterion("is_go like", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotLike(String value) {
            addCriterion("is_go not like", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoIn(List<String> values) {
            addCriterion("is_go in", values, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotIn(List<String> values) {
            addCriterion("is_go not in", values, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoBetween(String value1, String value2) {
            addCriterion("is_go between", value1, value2, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotBetween(String value1, String value2) {
            addCriterion("is_go not between", value1, value2, "isGo");
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