package com.as.mapping;

import java.util.HashMap;
import java.util.List;

import com.as.entity.Temporaryovertime;

public interface TemporaryovertimeDao {

	//通过记录id查找临时加班项
	public Temporaryovertime findTempOvertimeByToid(Integer to_id);
	
	//修改临时加班项
	public void updateTempovertimeByToid(HashMap<String, Object> toMap);
	
	//新增临时加班项
	public int insertTempOvertime(HashMap<String, Object> toMap);
	
	//查询所有记录
	public List<Temporaryovertime> selectAllTempOvertime();
	
	//查询当前日期可选的所有加班记录
	public List<Temporaryovertime> selectTmpOvertimeByNowDate(HashMap<String, Object> toMap);
}