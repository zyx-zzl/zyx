package com.zyx.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zyx.bean.User;


public class Template {
	

	public static void main(String[] args) { 
		//���� ����
		findAll();
		//adduser();
		//updateUser();
		//deleteUser();
		//deleteUser1();
		//findOnly();
		
	}
		//���
		
		private static void adduser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		String sql="insert into person(name,username,password,age,zyx,height) values('���˹','��������','321',16,'����',163.0)";
		int update=jt.update(sql);
		System.out.println(update);
	}
		//�޸�
		private static void updateUser() {
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update=jt.update("  update person set name = ?,username=?,password=?,age =?,zyx=?,height=? where id =?","��ɯ","���֮Ů","753",17,"����",173.0,2 );
		System.out.println(update);
		}
		//����idɾ��
		private  static void deleteUser() {
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			int update = jt.update("delete from person where id=?", 5);
			System.out.println(update);
		}
		//��������ɾ��
		private  static void deleteUser1() {
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			int update = jt.update("delete from person where name=?", "�¶�");
			System.out.println(update);
		}
		//ͨ��id��ѯ
		private static void findOnly() {
			
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			List<User> list = jt.query("select * from person where id=?", new BeanPropertyRowMapper(User.class),1);
			User user2=list.get(0);
			System.out.println(user2);
			System.out.println(list);
		}
		

	
		private static void findAll() {
		//��ѯ����
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "select * from person";
		
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		
	for(User user :list) {
		System.out.println(user);
	}
	}

}

