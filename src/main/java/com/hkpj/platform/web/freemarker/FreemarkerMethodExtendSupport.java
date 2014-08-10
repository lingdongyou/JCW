/**
 * 
 */
package com.hkpj.platform.web.freemarker;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

/**
 * <p>
 * Title: FreemarkerSupport.java
 * </p>
 * Description: 为页面提供自定义freermarker方法支持
 * <p>
 * Modify histoty:
 * 
 * @author 
 * @version 1.0
 * @created
 **/
@SuppressWarnings("rawtypes")
public abstract class FreemarkerMethodExtendSupport extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 动态引入页面
	 * 
	 * @return
	 */
	public final TemplateMethodModel getInclude() {
		return new TemplateMethodModel() {
			public Object exec(List arg) throws TemplateModelException {
				if (arg.size() != 1) {
					throw new TemplateModelException(this.getClass() + ": Wrong arguments! The required arguments is 1, but there is " + arg.size());
				}
				HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
				StringBuffer urlPath = new StringBuffer(request.getRequestURL().toString().replace(request.getRequestURI(), ""));
				urlPath.append(request.getContextPath());
				urlPath.append(arg.get(0));
				StringBuffer html = new StringBuffer("");
				try {
					URL url = new URL(urlPath.toString());
					HttpURLConnection connection = (HttpURLConnection) url.openConnection();
					connection.connect();
					InputStream inputStream = connection.getInputStream();
					Reader reader = new InputStreamReader(inputStream, "UTF-8");
					BufferedReader bufferedReader = new BufferedReader(reader);
					String str = null;
					while ((str = bufferedReader.readLine()) != null) {
						html.append(str);
					}
					reader.close();
					connection.disconnect();
				} catch (Exception e) {
					throw new TemplateModelException("parse http include error:", e);
				}
				return html.toString();
			}
		};
	}
}
