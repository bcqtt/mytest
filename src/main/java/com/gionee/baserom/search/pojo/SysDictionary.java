package com.gionee.baserom.search.pojo;

public class SysDictionary {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dictionary.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dictionary.cls_id
	 * @mbggenerated
	 */
	private Integer clsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dictionary.dic_value
	 * @mbggenerated
	 */
	private String dicValue;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dictionary.id
	 * @return  the value of sys_dictionary.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dictionary.id
	 * @param id  the value for sys_dictionary.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dictionary.cls_id
	 * @return  the value of sys_dictionary.cls_id
	 * @mbggenerated
	 */
	public Integer getClsId() {
		return clsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dictionary.cls_id
	 * @param clsId  the value for sys_dictionary.cls_id
	 * @mbggenerated
	 */
	public void setClsId(Integer clsId) {
		this.clsId = clsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dictionary.dic_value
	 * @return  the value of sys_dictionary.dic_value
	 * @mbggenerated
	 */
	public String getDicValue() {
		return dicValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dictionary.dic_value
	 * @param dicValue  the value for sys_dictionary.dic_value
	 * @mbggenerated
	 */
	public void setDicValue(String dicValue) {
		this.dicValue = dicValue == null ? null : dicValue.trim();
	}

	private SysDictionaryClassify classify;

	public SysDictionaryClassify getClassify() {
		return classify;
	}

	public void setClassify(SysDictionaryClassify classify) {
		this.classify = classify;
	}
}