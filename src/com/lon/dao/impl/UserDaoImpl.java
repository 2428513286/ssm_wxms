package com.lon.dao.impl;


import org.springframework.stereotype.Repository;

import com.lon.dao.UserDao;
import com.lon.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
