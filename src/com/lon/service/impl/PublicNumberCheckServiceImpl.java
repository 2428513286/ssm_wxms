package com.lon.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lon.dao.PublicNumberCheckDao;
import com.lon.entity.PublicNumberCheck;
import com.lon.entity.User;
import com.lon.service.PublicNumberCheckService;
import com.lon.vo.PublicNumberCheckVo;
@Service("publicNumberCheckService")
public class PublicNumberCheckServiceImpl extends BaseServiceImpl<PublicNumberCheck> implements PublicNumberCheckService{

	@Resource
	private PublicNumberCheckDao publicNumberCheckDao;
	
	@Override
	public List<PublicNumberCheckVo> uqueryByPage(int currentPage, int pageSize) {
		Map<String,Integer> map =new HashMap<String,Integer>();
		map.put("start", currentPage*pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return publicNumberCheckDao.uqueryByPage(map);
	}

	

}
