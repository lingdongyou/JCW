package com.hkpj.jcw.web.backstage;

import com.hkpj.jcw.model.ManageBean;
import com.hkpj.jcw.service.ManageService;
import com.hkpj.jcw.utils.SessionUtil;
import com.hkpj.platform.base.action.BasicAction;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.convention.annotation.Action;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Action("manage")
public class ManageAction extends BasicAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource(name="manageService")
	private ManageService manageService;
	private ManageBean ub;

	public String getUser() throws Exception {
		//userService = (UserService) SpringContextUtil.getBean("userService");
		ub = manageService.getUsers();//得不到这货
		return "user_main";
	}
	
	public String getbbUser() throws Exception {
		ub = manageService.getUsers();//得不到这货
		ActionContext.getContext().getSession().put("user", ub);
        SessionUtil.set("OPNO","Admin");
		return "user_sec";
	}
	
	public List<String> getList() {  
		List<String> bcc = new ArrayList<String>();
		bcc.add("aaa");  
		bcc.add("bbbbbbccaaaacc");
		bcc.add("ccc");  
		bcc.add(ub.getPassword());
        bcc.add(ub.getId()+"");
        return bcc;
	}  
}
