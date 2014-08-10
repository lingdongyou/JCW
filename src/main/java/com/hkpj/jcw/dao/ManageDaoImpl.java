package com.hkpj.jcw.dao;

import com.hkpj.jcw.model.ManageBean;
import com.hkpj.platform.base.dao.BasicDaoSupport;

public class ManageDaoImpl extends BasicDaoSupport implements ManageDao {
	@Override
	public ManageBean getUser() {
		return getSqlSession().selectOne("com.mybatis.models.UserMapper.selectUsrById", 2);
	}

}
