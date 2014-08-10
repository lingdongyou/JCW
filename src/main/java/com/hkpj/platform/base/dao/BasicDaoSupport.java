// Source File Name:   BasicDaoSupport.java

package com.hkpj.platform.base.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public abstract class BasicDaoSupport extends SqlSessionDaoSupport
{
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
}
