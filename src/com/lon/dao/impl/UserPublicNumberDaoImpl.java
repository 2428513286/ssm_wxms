package com.lon.dao.impl;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Repository;

import com.lon.dao.UserPublicNumberDao;
import com.lon.entity.UserPublicNumber;
import com.lon.vo.UserPublicNumberVo;

@Repository("userPublicNumberDao")
public class UserPublicNumberDaoImpl extends BaseDaoImpl<UserPublicNumber> implements UserPublicNumberDao{

	@Override
	public List<UserPublicNumberVo> uqueryByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(UserPublicNumber.class.getSimpleName()+".uqueryByPage", map);
	}

	
	
	
}
