package com.guet.gdcoal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guet.gdcoal.dao.CheckedInfoDao;
import com.guet.gdcoal.model.CheckedInfo;
import com.guet.gdcoal.service.CheckedInfoService;

@Service
public class CheckedInfoServiceImpl implements CheckedInfoService {

	@Autowired
	private CheckedInfoDao checkedInfoDao;
	
	@Override
	public int addCheckedInfo(CheckedInfo checkedInfo) {
		return this.checkedInfoDao.addCheckedInfo(checkedInfo);
	}

	@Override
	public List<CheckedInfo> getCheckedInfoByUserId(Integer userId) {
		return this.checkedInfoDao.getCheckedInfoByUserId(userId);
	}

}
