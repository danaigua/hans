package com.hengyue.hans.utils;

/**
 * 字符串工具类
 * @author 章家宝
 */
public class StringUtils {

    /**
     * 私有化工具类，减少内存使用
     */
    private static StringUtils instance = new StringUtils();

    public static StringUtils build(){return instance;}

    private StringUtils(){}

    /**
     * 是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str == null || "".equals(str)) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * 判断字符串是否不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        if(!isEmpty(str)){
            return true;
        }else{
            return false;
        }
    }
}
