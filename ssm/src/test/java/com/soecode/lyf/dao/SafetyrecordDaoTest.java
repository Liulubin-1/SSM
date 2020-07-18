package com.soecode.lyf.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Safetyrecord;

public class SafetyrecordDaoTest extends BaseTest {
	@Autowired
	private SafetyrecordDao SafetyrecordDao;

	@Test
	public void testQueryById() throws Exception {
		int Id = 1;
		Safetyrecord Safetyrecord = SafetyrecordDao.queryById(Id);
		System.out.println(Safetyrecord);
	}
	@Test
	public void testQueryAll() throws Exception {
		List<Safetyrecord> Safetyrecords = SafetyrecordDao.queryByDate("20200625");
		for (Safetyrecord Safetyrecord : Safetyrecords) {
			System.out.println(Safetyrecord);
		}
	}
}
