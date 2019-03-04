package com.lon.dao;

import java.util.List;
import java.util.Map;

import com.lon.entity.PublicNumberCheck;
import com.lon.entity.User;
import com.lon.vo.PublicNumberCheckVo;

public interface PublicNumberCheckDao extends BaseDao<PublicNumberCheck>{

	public List<PublicNumberCheckVo> uqueryByPage(Map<String,Integer> map);
	
}
