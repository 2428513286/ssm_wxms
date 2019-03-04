package com.lon.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lon.dao.UserPublicNumberDao;
import com.lon.entity.UserPublicNumber;
import com.lon.service.UserPublicNumberService;
import com.lon.vo.UserPublicNumberVo;
@Service("userPublicNumberService")
public class UserPublicNumberServiceImpl extends BaseServiceImpl<UserPublicNumber> implements UserPublicNumberService{
	
	@Resource
	private UserPublicNumberDao userPublicNumberDao;

	@Override
	public List<UserPublicNumberVo> uqueryByPage(int currentPage, int pageSize) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("start", currentPage*pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return userPublicNumberDao.uqueryByPage(map);
	}


}
