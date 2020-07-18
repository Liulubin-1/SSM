package com.soecode.lyf.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.User;

public class UserDaoTest extends BaseTest {
	@Autowired
	private UserDao UserDao;

	@Test
	public void testQueryById() throws Exception {
		int Id = 4;
		String user = UserDao.queryById(Id);
		System.out.println(user);
	}
}
