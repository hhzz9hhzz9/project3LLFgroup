package com.woniu.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	static SqlSessionFactory sessionFactory;
	static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();
	static {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		SqlSession session = tl.get();
		if(session==null) {
			session = sessionFactory.openSession();
			tl.set(session);
		}
		return session;
	}
	public static void closeSession() {
		SqlSession session = tl.get();
		if(session!=null) {
			session.close();
			tl.set(null);
		}
	}
}
