package com.zyx.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zyx.bean.User;
import com.zyx.jdbc.JDBCUtils;

public class UserDaoImpl implements UserDao {
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	
	@Override
	public List<User> findAllUser() {
		String sql ="select* from person";
		List<User> list =jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return list;
	}
	
}
