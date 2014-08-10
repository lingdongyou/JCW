package com.hkpj.jcw.utils;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpSession;

/**
 * Created by rgy19_000 on 2014/8/10.
 */
public final class SessionUtil {
    public static HttpSession session;
    private SessionUtil(){}

    static {
        session = ServletActionContext.getRequest().getSession();
    }

    /**
     * 存放session操作
     * @param key
     * @param value
     */
    public static void set(String key,Object value){
        session.setAttribute(key,value);
    }

    /**
     * 取session操作
     * @param key
     * @return Object
     */
    public static Object get(String key){
        return session.getAttribute(key);
    }
    /**
     * 取得用户ID
     * @return String
     */
    public static String getOpid(){
        Object obj = session.getAttribute("OPID");
        if(JCWUtil.isBlank(obj)){
            return "";
        }
        return obj.toString();
    }

    /**
     * 取得用户登录名
     * @return String
     */
    public static String getOpno(){
        Object obj = session.getAttribute("OPNO");
        if(JCWUtil.isBlank(obj)){
            return "";
        }
        return obj.toString();
    }

    /**
     * 取得用户名字
     * @return String
     */
    public static String getOpName(){
        Object obj = session.getAttribute("OPNAME");
        if(JCWUtil.isBlank(obj)){
            return "";
        }
        return obj.toString();
    }
}
