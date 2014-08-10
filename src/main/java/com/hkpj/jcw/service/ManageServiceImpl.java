package com.hkpj.jcw.service;

import com.hkpj.jcw.dao.ManageDao;
import com.hkpj.jcw.model.ManageBean;
import com.hkpj.jcw.utils.SpringContextUtil;

public class ManageServiceImpl implements ManageService {
	
	private ManageDao manageDao;

	public ManageBean getUsers() {
        manageDao = (ManageDao) SpringContextUtil.getBean("manageDao");
		return manageDao.getUser();
	}

}
