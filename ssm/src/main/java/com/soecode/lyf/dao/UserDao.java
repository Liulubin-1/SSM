package com.soecode.lyf.dao;

import com.soecode.lyf.entity.User;

public interface UserDao {
	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	String queryById(int id);
}
