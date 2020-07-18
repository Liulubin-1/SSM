package com.soecode.lyf.service;

import java.util.List;
import java.util.Map;

import com.soecode.lyf.entity.Safetyrecord;
import com.soecode.lyf.entity.Safetyrecordsig;

public interface SafetyService {
	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	Safetyrecord queryById(int id);
	
	Map<Integer,Safetyrecord> queryByDate(String Date);
	
	List<Safetyrecordsig> queryByDate_sig(String Date);
}
