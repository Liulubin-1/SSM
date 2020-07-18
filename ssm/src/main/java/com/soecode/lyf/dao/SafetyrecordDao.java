package com.soecode.lyf.dao;

import java.util.List;
import com.soecode.lyf.entity.Safetyrecord;

public interface SafetyrecordDao {
	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	Safetyrecord queryById(int id);
	
	/**
	 * 查询所有
	 * 
	 * @param Date
	 * @return
	 */
	List<Safetyrecord> queryByDate(String Date);
}
