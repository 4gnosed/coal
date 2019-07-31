package com.guet.gdcoal.service;

import java.util.List;

import com.guet.gdcoal.model.CheckedInfo;

public interface CheckedInfoService {

	int addCheckedInfo(CheckedInfo checkedInfo);

	List<CheckedInfo> getCheckedInfoByUserId(Integer userId);
	
}
