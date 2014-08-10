package com.hkpj.jcw.utils;

/**
 * Created by rgy19_000 on 2014/8/10.
 */
public final class StringUtil {
    private StringUtil(){}
    /**
     * 判断字符串对象不为空
     * @param string
     * @return
     */
    public static boolean isNotBlank(String string){
        return !(string==null&&string.equals("".trim()));
    }

    /**
     * 判断字符串对象为空
     * @param string
     * @return
     */
    public static boolean isBlank(String string){
        return string==null&&string.equals("".trim());
    }
}
