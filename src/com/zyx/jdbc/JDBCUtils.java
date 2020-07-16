package com.zyx.jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class JDBCUtils {
	
	static DataSource  dataSource;
	
	// ��Ϣ20����
	static {
		// DriverManager ע������
		try {
			//1 Properties
			Properties pro = new Properties();
			//2 ������
			InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("zzl.properties");
			//3 load
			pro.load(is);
			dataSource = DruidDataSourceFactory.createDataSource(pro);
			
			
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	/*
	 * �ṩ����
	 */
	public static Connection getConnection() throws SQLException {
		return  dataSource.getConnection();
	}
}
