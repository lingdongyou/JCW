/**
 * 
 */
package com.hkpj.platform.constant;

/**
 * <p>
 * Title: ContentType.java
 * </p>
 * Description: 枚举类，定义response的contenttype类型
 * <p>
 * Modify histoty:
 * 
 * @author 
 * @version 1.0
 * @created 
 **/
public enum ContentType {

	XML("text/xml; charset=UTF-8"), HTML("text/html; charset=UTF-8");

	private String type;

	ContentType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
