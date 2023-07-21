package com.gamewolf.gameinfo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VgInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public VgInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGametitleEnIsNull() {
            addCriterion("gametitle_en is null");
            return (Criteria) this;
        }

        public Criteria andGametitleEnIsNotNull() {
            addCriterion("gametitle_en is not null");
            return (Criteria) this;
        }

        public Criteria andGametitleEnEqualTo(String value) {
            addCriterion("gametitle_en =", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnNotEqualTo(String value) {
            addCriterion("gametitle_en <>", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnGreaterThan(String value) {
            addCriterion("gametitle_en >", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("gametitle_en >=", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnLessThan(String value) {
            addCriterion("gametitle_en <", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnLessThanOrEqualTo(String value) {
            addCriterion("gametitle_en <=", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnLike(String value) {
            addCriterion("gametitle_en like", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnNotLike(String value) {
            addCriterion("gametitle_en not like", value, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnIn(List<String> values) {
            addCriterion("gametitle_en in", values, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnNotIn(List<String> values) {
            addCriterion("gametitle_en not in", values, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnBetween(String value1, String value2) {
            addCriterion("gametitle_en between", value1, value2, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleEnNotBetween(String value1, String value2) {
            addCriterion("gametitle_en not between", value1, value2, "gametitleEn");
            return (Criteria) this;
        }

        public Criteria andGametitleZhIsNull() {
            addCriterion("gametitle_zh is null");
            return (Criteria) this;
        }

        public Criteria andGametitleZhIsNotNull() {
            addCriterion("gametitle_zh is not null");
            return (Criteria) this;
        }

        public Criteria andGametitleZhEqualTo(String value) {
            addCriterion("gametitle_zh =", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhNotEqualTo(String value) {
            addCriterion("gametitle_zh <>", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhGreaterThan(String value) {
            addCriterion("gametitle_zh >", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhGreaterThanOrEqualTo(String value) {
            addCriterion("gametitle_zh >=", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhLessThan(String value) {
            addCriterion("gametitle_zh <", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhLessThanOrEqualTo(String value) {
            addCriterion("gametitle_zh <=", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhLike(String value) {
            addCriterion("gametitle_zh like", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhNotLike(String value) {
            addCriterion("gametitle_zh not like", value, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhIn(List<String> values) {
            addCriterion("gametitle_zh in", values, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhNotIn(List<String> values) {
            addCriterion("gametitle_zh not in", values, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhBetween(String value1, String value2) {
            addCriterion("gametitle_zh between", value1, value2, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andGametitleZhNotBetween(String value1, String value2) {
            addCriterion("gametitle_zh not between", value1, value2, "gametitleZh");
            return (Criteria) this;
        }

        public Criteria andDevComIdIsNull() {
            addCriterion("dev_com_id is null");
            return (Criteria) this;
        }

        public Criteria andDevComIdIsNotNull() {
            addCriterion("dev_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevComIdEqualTo(Integer value) {
            addCriterion("dev_com_id =", value, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdNotEqualTo(Integer value) {
            addCriterion("dev_com_id <>", value, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdGreaterThan(Integer value) {
            addCriterion("dev_com_id >", value, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_com_id >=", value, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdLessThan(Integer value) {
            addCriterion("dev_com_id <", value, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdLessThanOrEqualTo(Integer value) {
            addCriterion("dev_com_id <=", value, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdIn(List<Integer> values) {
            addCriterion("dev_com_id in", values, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdNotIn(List<Integer> values) {
            addCriterion("dev_com_id not in", values, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdBetween(Integer value1, Integer value2) {
            addCriterion("dev_com_id between", value1, value2, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_com_id not between", value1, value2, "devComId");
            return (Criteria) this;
        }

        public Criteria andDevComNameIsNull() {
            addCriterion("dev_com_name is null");
            return (Criteria) this;
        }

        public Criteria andDevComNameIsNotNull() {
            addCriterion("dev_com_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevComNameEqualTo(String value) {
            addCriterion("dev_com_name =", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameNotEqualTo(String value) {
            addCriterion("dev_com_name <>", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameGreaterThan(String value) {
            addCriterion("dev_com_name >", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_com_name >=", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameLessThan(String value) {
            addCriterion("dev_com_name <", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameLessThanOrEqualTo(String value) {
            addCriterion("dev_com_name <=", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameLike(String value) {
            addCriterion("dev_com_name like", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameNotLike(String value) {
            addCriterion("dev_com_name not like", value, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameIn(List<String> values) {
            addCriterion("dev_com_name in", values, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameNotIn(List<String> values) {
            addCriterion("dev_com_name not in", values, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameBetween(String value1, String value2) {
            addCriterion("dev_com_name between", value1, value2, "devComName");
            return (Criteria) this;
        }

        public Criteria andDevComNameNotBetween(String value1, String value2) {
            addCriterion("dev_com_name not between", value1, value2, "devComName");
            return (Criteria) this;
        }

        public Criteria andPubComIdIsNull() {
            addCriterion("pub_com_id is null");
            return (Criteria) this;
        }

        public Criteria andPubComIdIsNotNull() {
            addCriterion("pub_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubComIdEqualTo(Integer value) {
            addCriterion("pub_com_id =", value, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdNotEqualTo(Integer value) {
            addCriterion("pub_com_id <>", value, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdGreaterThan(Integer value) {
            addCriterion("pub_com_id >", value, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_com_id >=", value, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdLessThan(Integer value) {
            addCriterion("pub_com_id <", value, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdLessThanOrEqualTo(Integer value) {
            addCriterion("pub_com_id <=", value, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdIn(List<Integer> values) {
            addCriterion("pub_com_id in", values, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdNotIn(List<Integer> values) {
            addCriterion("pub_com_id not in", values, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdBetween(Integer value1, Integer value2) {
            addCriterion("pub_com_id between", value1, value2, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_com_id not between", value1, value2, "pubComId");
            return (Criteria) this;
        }

        public Criteria andPubComNameIsNull() {
            addCriterion("pub_com_name is null");
            return (Criteria) this;
        }

        public Criteria andPubComNameIsNotNull() {
            addCriterion("pub_com_name is not null");
            return (Criteria) this;
        }

        public Criteria andPubComNameEqualTo(String value) {
            addCriterion("pub_com_name =", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameNotEqualTo(String value) {
            addCriterion("pub_com_name <>", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameGreaterThan(String value) {
            addCriterion("pub_com_name >", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameGreaterThanOrEqualTo(String value) {
            addCriterion("pub_com_name >=", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameLessThan(String value) {
            addCriterion("pub_com_name <", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameLessThanOrEqualTo(String value) {
            addCriterion("pub_com_name <=", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameLike(String value) {
            addCriterion("pub_com_name like", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameNotLike(String value) {
            addCriterion("pub_com_name not like", value, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameIn(List<String> values) {
            addCriterion("pub_com_name in", values, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameNotIn(List<String> values) {
            addCriterion("pub_com_name not in", values, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameBetween(String value1, String value2) {
            addCriterion("pub_com_name between", value1, value2, "pubComName");
            return (Criteria) this;
        }

        public Criteria andPubComNameNotBetween(String value1, String value2) {
            addCriterion("pub_com_name not between", value1, value2, "pubComName");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andGenreidsIsNull() {
            addCriterion("genreids is null");
            return (Criteria) this;
        }

        public Criteria andGenreidsIsNotNull() {
            addCriterion("genreids is not null");
            return (Criteria) this;
        }

        public Criteria andGenreidsEqualTo(String value) {
            addCriterion("genreids =", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsNotEqualTo(String value) {
            addCriterion("genreids <>", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsGreaterThan(String value) {
            addCriterion("genreids >", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsGreaterThanOrEqualTo(String value) {
            addCriterion("genreids >=", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsLessThan(String value) {
            addCriterion("genreids <", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsLessThanOrEqualTo(String value) {
            addCriterion("genreids <=", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsLike(String value) {
            addCriterion("genreids like", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsNotLike(String value) {
            addCriterion("genreids not like", value, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsIn(List<String> values) {
            addCriterion("genreids in", values, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsNotIn(List<String> values) {
            addCriterion("genreids not in", values, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsBetween(String value1, String value2) {
            addCriterion("genreids between", value1, value2, "genreids");
            return (Criteria) this;
        }

        public Criteria andGenreidsNotBetween(String value1, String value2) {
            addCriterion("genreids not between", value1, value2, "genreids");
            return (Criteria) this;
        }

        public Criteria andThemesIsNull() {
            addCriterion("themes is null");
            return (Criteria) this;
        }

        public Criteria andThemesIsNotNull() {
            addCriterion("themes is not null");
            return (Criteria) this;
        }

        public Criteria andThemesEqualTo(String value) {
            addCriterion("themes =", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesNotEqualTo(String value) {
            addCriterion("themes <>", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesGreaterThan(String value) {
            addCriterion("themes >", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesGreaterThanOrEqualTo(String value) {
            addCriterion("themes >=", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesLessThan(String value) {
            addCriterion("themes <", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesLessThanOrEqualTo(String value) {
            addCriterion("themes <=", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesLike(String value) {
            addCriterion("themes like", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesNotLike(String value) {
            addCriterion("themes not like", value, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesIn(List<String> values) {
            addCriterion("themes in", values, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesNotIn(List<String> values) {
            addCriterion("themes not in", values, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesBetween(String value1, String value2) {
            addCriterion("themes between", value1, value2, "themes");
            return (Criteria) this;
        }

        public Criteria andThemesNotBetween(String value1, String value2) {
            addCriterion("themes not between", value1, value2, "themes");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vg_info
     *
     * @mbg.generated do_not_delete_during_merge Sat Jul 15 11:37:11 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vg_info
     *
     * @mbg.generated Sat Jul 15 11:37:11 CST 2023
     */
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