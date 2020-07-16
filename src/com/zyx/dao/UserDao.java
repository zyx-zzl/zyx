package com.zyx.dao;

import java.util.List;

import com.zyx.bean.User;

public interface UserDao {
	List<User> findAllUser();
}
