package com.soecode.lyf.service.impl;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.service.SafetyService;
import com.soecode.lyf.entity.Safetyrecord;
import com.soecode.lyf.entity.Safetyrecordsig;

public class SafetyServiceImplTest extends BaseTest {
	@Autowired
	private SafetyService SafetyService;

	@Test
	public void testMap() throws Exception {
		Map<Integer,Safetyrecord> safetyrecords =SafetyService.queryByDate("20200625");
		System.out.println(safetyrecords.get(3));
	}
	
	@Test
	public void testList() throws Exception {
		List<Safetyrecordsig> Safetysigs=SafetyService.queryByDate_sig("20200625");
		for(Safetyrecordsig safetyrecordsig:Safetysigs)
		{
			System.out.println(safetyrecordsig);
		}
	}
}
