package com.hkpj.platform.base.action;

import com.hkpj.platform.web.freemarker.FreemarkerMethodExtendSupport;
import com.opensymphony.xwork2.ActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BasicAction extends FreemarkerMethodExtendSupport
{

	private static final long serialVersionUID = 0x42dac61c8c094ab1L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;

	public void prepare()
		throws Exception
	{
	}

	public BasicAction()
	{

	}

	protected ActionContext getActionContext()
	{
		ActionContext ac = ActionContext.getContext();
		request = (HttpServletRequest)ac.get("com.opensymphony.xwork.dispatcher.HttpServletRequest");
		response = (HttpServletResponse)ac.get("com.opensymphony.xwork.dispatcher.HttpServletResponse");
		return ac;
	}
}
