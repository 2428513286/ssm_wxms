package com.lon.service;


import java.util.List;

import com.lon.entity.UserPublicNumber;
import com.lon.vo.UserPublicNumberVo;

public interface UserPublicNumberService extends BaseService<UserPublicNumber>{

	public List<UserPublicNumberVo> uqueryByPage(int currentPage,int pageSize);

}
