package com.lon.dao.impl;

import org.springframework.stereotype.Repository;

import com.lon.dao.PublicNumberDao;
import com.lon.entity.PublicNumber;

@Repository("publicNumberDao")
public class PublicNumberDaoImpl extends BaseDaoImpl<PublicNumber> implements PublicNumberDao{

}
