package com.guet.gdcoal.dao;

import java.util.List;

import com.guet.gdcoal.model.CheckedInfo;

public interface CheckedInfoDao {

	int addCheckedInfo(CheckedInfo checkedInfo);

	List<CheckedInfo> getCheckedInfoByUserId(Integer userId);
	
}
