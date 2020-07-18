package com.soecode.lyf.dao;

import java.util.List;

import com.soecode.lyf.entity.Safetyrecordsig;

public interface SafetysigDao {
	/**
	 * 查询所有
	 * 
	 * @param Date
	 * @return
	 */
	List<Safetyrecordsig> queryByDate(String Date);

}
