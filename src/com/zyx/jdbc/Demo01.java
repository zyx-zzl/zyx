package com.zyx.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demo01 {

	public static void main(String[] args) throws Exception{
		//�����
		//���������ļ�
		//���������ļ�
		Properties pro = new Properties();
		//������
		InputStream resourceAsStream = Demo01.class.getClassLoader().getResourceAsStream("zzl.properties");
		//load
		pro.load(resourceAsStream);
		
		String property = pro.getProperty("name");
		String password = pro.getProperty("password");
		System.out.println(password);
		System.out.println(property);
		//���ݿ����ӳض���
		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);
		//���ݿ�����
		System.out.println(datasource.getConnection());
		//��ȡ����
		Connection connection = datasource.getConnection();
		System.out.println("��ȡ������"+connection);
		//ִ��sql����
		Statement createStatement =connection.createStatement();
		//����sql
		String sql = "select * from t_user";
		//ִ�в�ѯ
		ResultSet rs = createStatement.executeQuery(sql);
		//�������
		while(rs.next()) {
			String name = rs.getString("name");
			String address = rs.getString("address");
			Integer age= rs.getInt("age");
			System.out.println(name+address+age);
		}
		connection.close();
		
		

	}

}
