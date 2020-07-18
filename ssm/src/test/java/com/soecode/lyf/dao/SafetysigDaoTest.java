package com.soecode.lyf.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Safetyrecord;
import com.soecode.lyf.entity.Safetyrecordsig;

public class SafetysigDaoTest extends BaseTest{
	@Autowired
	private SafetysigDao SafetysigDao;
	@Test
	public void testQueryAll() throws Exception {
		List<Safetyrecordsig> Safetyrecordsigs = SafetysigDao.queryByDate("20200625");
		for (Safetyrecordsig Safetyrecordsig : Safetyrecordsigs) {
			System.out.println(Safetyrecordsig);
		}
	}

}
