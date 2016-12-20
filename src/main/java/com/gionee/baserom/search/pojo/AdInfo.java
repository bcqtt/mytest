package com.gionee.baserom.search.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AdInfo {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.ad_rule_id
	 * @mbggenerated
	 */
	private Integer adRuleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.ad_tittle
	 * @mbggenerated
	 */
	private String adTittle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.show_tittle_flag
	 * @mbggenerated
	 */
	private Integer showTittleFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.cp_name
	 * @mbggenerated
	 */
	private String cpName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.specification
	 * @mbggenerated
	 */
	private Integer specification;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.ad_image_path
	 * @mbggenerated
	 */
	private String adImagePath;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.ad_behavior_id
	 * @mbggenerated
	 */
	private Integer adBehaviorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.ad_classify_id
	 * @mbggenerated
	 */
	private Integer adClassifyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.start_time
	 * @mbggenerated
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.end_time
	 * @mbggenerated
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.keyword_setting
	 * @mbggenerated
	 */
	private Integer keywordSetting;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.keyword
	 * @mbggenerated
	 */
	private String keyword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.billing_type
	 * @mbggenerated
	 */
	private Integer billingType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.unit_price
	 * @mbggenerated
	 */
	private Float unitPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.weight
	 * @mbggenerated
	 */
	private Integer weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.version
	 * @mbggenerated
	 */
	private String version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ad_info.mechine_type
	 * @mbggenerated
	 */
	private String mechineType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.id
	 * @return  the value of ad_info.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.id
	 * @param id  the value for ad_info.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.ad_rule_id
	 * @return  the value of ad_info.ad_rule_id
	 * @mbggenerated
	 */
	public Integer getAdRuleId() {
		return adRuleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.ad_rule_id
	 * @param adRuleId  the value for ad_info.ad_rule_id
	 * @mbggenerated
	 */
	public void setAdRuleId(Integer adRuleId) {
		this.adRuleId = adRuleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.ad_tittle
	 * @return  the value of ad_info.ad_tittle
	 * @mbggenerated
	 */
	public String getAdTittle() {
		return adTittle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.ad_tittle
	 * @param adTittle  the value for ad_info.ad_tittle
	 * @mbggenerated
	 */
	public void setAdTittle(String adTittle) {
		this.adTittle = adTittle == null ? null : adTittle.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.show_tittle_flag
	 * @return  the value of ad_info.show_tittle_flag
	 * @mbggenerated
	 */
	public Integer getShowTittleFlag() {
		return showTittleFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.show_tittle_flag
	 * @param showTittleFlag  the value for ad_info.show_tittle_flag
	 * @mbggenerated
	 */
	public void setShowTittleFlag(Integer showTittleFlag) {
		this.showTittleFlag = showTittleFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.cp_name
	 * @return  the value of ad_info.cp_name
	 * @mbggenerated
	 */
	public String getCpName() {
		return cpName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.cp_name
	 * @param cpName  the value for ad_info.cp_name
	 * @mbggenerated
	 */
	public void setCpName(String cpName) {
		this.cpName = cpName == null ? null : cpName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.specification
	 * @return  the value of ad_info.specification
	 * @mbggenerated
	 */
	public Integer getSpecification() {
		return specification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.specification
	 * @param specification  the value for ad_info.specification
	 * @mbggenerated
	 */
	public void setSpecification(Integer specification) {
		this.specification = specification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.ad_image_path
	 * @return  the value of ad_info.ad_image_path
	 * @mbggenerated
	 */
	public String getAdImagePath() {
		return adImagePath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.ad_image_path
	 * @param adImagePath  the value for ad_info.ad_image_path
	 * @mbggenerated
	 */
	public void setAdImagePath(String adImagePath) {
		this.adImagePath = adImagePath == null ? null : adImagePath.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.ad_behavior_id
	 * @return  the value of ad_info.ad_behavior_id
	 * @mbggenerated
	 */
	public Integer getAdBehaviorId() {
		return adBehaviorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.ad_behavior_id
	 * @param adBehaviorId  the value for ad_info.ad_behavior_id
	 * @mbggenerated
	 */
	public void setAdBehaviorId(Integer adBehaviorId) {
		this.adBehaviorId = adBehaviorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.ad_classify_id
	 * @return  the value of ad_info.ad_classify_id
	 * @mbggenerated
	 */
	public Integer getAdClassifyId() {
		return adClassifyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.ad_classify_id
	 * @param adClassifyId  the value for ad_info.ad_classify_id
	 * @mbggenerated
	 */
	public void setAdClassifyId(Integer adClassifyId) {
		this.adClassifyId = adClassifyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.start_time
	 * @return  the value of ad_info.start_time
	 * @mbggenerated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.start_time
	 * @param startTime  the value for ad_info.start_time
	 * @mbggenerated
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.end_time
	 * @return  the value of ad_info.end_time
	 * @mbggenerated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.end_time
	 * @param endTime  the value for ad_info.end_time
	 * @mbggenerated
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.keyword_setting
	 * @return  the value of ad_info.keyword_setting
	 * @mbggenerated
	 */
	public Integer getKeywordSetting() {
		return keywordSetting;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.keyword_setting
	 * @param keywordSetting  the value for ad_info.keyword_setting
	 * @mbggenerated
	 */
	public void setKeywordSetting(Integer keywordSetting) {
		this.keywordSetting = keywordSetting;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.keyword
	 * @return  the value of ad_info.keyword
	 * @mbggenerated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.keyword
	 * @param keyword  the value for ad_info.keyword
	 * @mbggenerated
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword == null ? null : keyword.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.billing_type
	 * @return  the value of ad_info.billing_type
	 * @mbggenerated
	 */
	public Integer getBillingType() {
		return billingType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.billing_type
	 * @param billingType  the value for ad_info.billing_type
	 * @mbggenerated
	 */
	public void setBillingType(Integer billingType) {
		this.billingType = billingType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.unit_price
	 * @return  the value of ad_info.unit_price
	 * @mbggenerated
	 */
	public Float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.unit_price
	 * @param unitPrice  the value for ad_info.unit_price
	 * @mbggenerated
	 */
	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.weight
	 * @return  the value of ad_info.weight
	 * @mbggenerated
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.weight
	 * @param weight  the value for ad_info.weight
	 * @mbggenerated
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.version
	 * @return  the value of ad_info.version
	 * @mbggenerated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.version
	 * @param version  the value for ad_info.version
	 * @mbggenerated
	 */
	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ad_info.mechine_type
	 * @return  the value of ad_info.mechine_type
	 * @mbggenerated
	 */
	public String getMechineType() {
		return mechineType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ad_info.mechine_type
	 * @param mechineType  the value for ad_info.mechine_type
	 * @mbggenerated
	 */
	public void setMechineType(String mechineType) {
		this.mechineType = mechineType == null ? null : mechineType.trim();
	}

	private AdDisplayRule rule;
	private AdBehavior behavior;
	private AdClassify classify;
	private SysDictionary billingTypeObj;

	public AdBehavior getBehavior() {
		return behavior;
	}

	public void setBehavior(AdBehavior behavior) {
		this.behavior = behavior;
	}

	public AdClassify getClassify() {
		return classify;
	}

	public void setClassify(AdClassify classify) {
		this.classify = classify;
	}

	public SysDictionary getBillingTypeObj() {
		return billingTypeObj;
	}

	public void setBillingTypeObj(SysDictionary billingTypeObj) {
		this.billingTypeObj = billingTypeObj;
	}

	public AdDisplayRule getRule() {
		return rule;
	}

	public void setRule(AdDisplayRule rule) {
		this.rule = rule;
	}
}