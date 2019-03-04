package com.lon.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lon.dao.PublicNumberCheckDao;
import com.lon.entity.PublicNumberCheck;
import com.lon.entity.User;
import com.lon.vo.PublicNumberCheckVo;
@Repository("publicNumberCheckDao")
public class PublicNumberCheckDaoImpl extends BaseDaoImpl<PublicNumberCheck> implements PublicNumberCheckDao{

	@Override
	public List<PublicNumberCheckVo> uqueryByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(PublicNumberCheck.class.getSimpleName()+".uqueryByPage", map);
	}

	

}
