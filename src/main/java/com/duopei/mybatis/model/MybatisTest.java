package com.duopei.mybatis.model;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MybatisTest {

	private static Logger logger = Logger.getLogger(MybatisTest.class);
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("com/duopei/mybatis/model/user-mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Users user = (Users) session.selectOne("com.duopei.mybatis.model.UserMapper.selectUserByID", 103108);
			if (null != user) {
				logger.info("userName=" + user.getUserName());
			} else {
				logger.warn(" NOT FOUND ... ");
			}
		} finally {
			if (null != session) {
				session.close();
			}
		}
	}

}
