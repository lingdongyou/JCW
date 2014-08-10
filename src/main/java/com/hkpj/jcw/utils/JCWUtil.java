package com.hkpj.jcw.utils;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by rgy19_000 on 2014/8/10.
 */
public class JCWUtil {
    private JCWUtil(){}
    /**
     * 判断对象为空
     * @param obj
     * @return boolean
     */
    public static boolean isBlank(Object obj){
        return obj == null;
    }

    /**
     * 判断对象不为空
     * @param obj
     * @return boolean
     */
    public static boolean isNotBlank(Object obj){
        return obj != null;
    }

    /**
     * 取得Request
     * @return HttpServletRequest
     */
    public static HttpServletRequest getRequest(){
        return ServletActionContext.getRequest();
    }

    /**
     * 取得Reponse
     * @return HttpServletResponse
     */
    public static HttpServletResponse getResponse(){
        return ServletActionContext.getResponse();
    }
}
