package com.zyx.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zyx.bean.User;


public class Template {
	

	public static void main(String[] args) { 
		//调用 方法
		findAll();
		//adduser();
		//updateUser();
		//deleteUser();
		//deleteUser1();
		//findOnly();
		
	}
		//添加
		
		private static void adduser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		String sql="insert into person(name,username,password,age,zyx,height) values('金克斯','暴走萝莉','321',16,'射手',163.0)";
		int update=jt.update(sql);
		System.out.println(update);
	}
		//修改
		private static void updateUser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update=jt.update("  update person set name = ?,username=?,password=?,age =?,zyx=?,height=? where id =?","卡莎","虚空之女","753",17,"射手",173.0,2 );
		System.out.println(update);
		}
		//根据id删除
		private  static void deleteUser() {
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			int update = jt.update("delete from person where id=?", 5);
			System.out.println(update);
		}
		//根据姓名删除
		private  static void deleteUser1() {
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			int update = jt.update("delete from person where name=?", "奥恩");
			System.out.println(update);
		}
		//通过id查询
		private static void findOnly() {
			
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			List<User> list = jt.query("select * from person where id=?", new BeanPropertyRowMapper(User.class),1);
			User user2=list.get(0);
			System.out.println(user2);
			System.out.println(list);
		}
		

	
		private static void findAll() {
		//查询所有
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "select * from person";
		
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		
	for(User user :list) {
		System.out.println(user);
	}
	}

}

