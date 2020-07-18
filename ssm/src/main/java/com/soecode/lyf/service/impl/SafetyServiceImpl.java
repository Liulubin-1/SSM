package com.soecode.lyf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soecode.lyf.dao.SafetyrecordDao;
import com.soecode.lyf.dao.SafetysigDao;
import com.soecode.lyf.dao.UserDao;
import com.soecode.lyf.entity.Safetyrecord;
import com.soecode.lyf.entity.Safetyrecordsig;
import com.soecode.lyf.service.SafetyService;

@Service
public class SafetyServiceImpl implements SafetyService {

	// 注入Service依赖
		@Autowired
		private SafetyrecordDao SafetyrecordDao;
		@Autowired
		private SafetysigDao SafetysigDao;
		@Autowired
		private UserDao UserDao;
	
	@Override
	public Safetyrecord queryById(int id) {
		// TODO Auto-generated method stub
		return SafetyrecordDao.queryById(id);
	}

	@Override
	public Map<Integer,Safetyrecord> queryByDate(String Date) {
		// TODO Auto-generated method stub
		
		List<Safetyrecord> Safetyrecords=SafetyrecordDao.queryByDate(Date);
		
		Map<Integer,Safetyrecord>  SafetyMap = new HashMap<Integer,Safetyrecord>();
		
		for(Safetyrecord safetyrecord:Safetyrecords)
		{
			SafetyMap.put(safetyrecord.getHour(), safetyrecord);//key值为该记录的时间（小时），value为一条safetyrecord记录
		}
		
		return SafetyMap;
	}

	@Override
	public List<Safetyrecordsig> queryByDate_sig(String Date) {
		// TODO Auto-generated method stub
		List<Safetyrecordsig> Safetyrecordsigs = SafetysigDao.queryByDate(Date);
		for(Safetyrecordsig safetyrecordsig:Safetyrecordsigs)
		{
			int id=safetyrecordsig.getInspector();
			safetyrecordsig.setName(UserDao.queryById(id));
		}
		return Safetyrecordsigs;
	}

}
