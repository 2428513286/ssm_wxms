package com.lon.dao;

import java.util.List;
import java.util.Map;

import com.lon.entity.UserPublicNumber;
import com.lon.vo.UserPublicNumberVo;

public interface UserPublicNumberDao extends BaseDao<UserPublicNumber>{

	public List<UserPublicNumberVo> uqueryByPage(Map<String,Integer> map);
	
}
