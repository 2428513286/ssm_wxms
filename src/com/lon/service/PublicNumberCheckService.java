package com.lon.service;

import java.util.List;

import com.lon.entity.PublicNumberCheck;
import com.lon.entity.User;
import com.lon.vo.PublicNumberCheckVo;

public interface PublicNumberCheckService extends BaseService<PublicNumberCheck>{

	public List<PublicNumberCheckVo> uqueryByPage(int currentPage,int pageSize);
	
}
