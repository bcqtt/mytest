package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.HotkeySource;
import com.gionee.baserom.search.pojo.HotkeySourceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface HotkeySourceMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int countByExample(HotkeySourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int deleteByExample(HotkeySourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int insert(HotkeySource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int insertSelective(HotkeySource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	List<HotkeySource> selectByExample(HotkeySourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	HotkeySource selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") HotkeySource record, @Param("example") HotkeySourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") HotkeySource record, @Param("example") HotkeySourceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(HotkeySource record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hotkey_source
	 * @mbggenerated
	 */
	int updateByPrimaryKey(HotkeySource record);

	/**************************
     * srart manual programing
     **************************/
    
    HotkeySource getUseredSource();
    
    List<HotkeySource> getAllDataSource();
    
    void cleanUseredFlag();
    
    void setUseredFlag(String sourceCode);
    
    List<HotkeySource> queryByPage(Map<String, Object> map);

	String getHotkeySourceUrl();
}