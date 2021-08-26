package com.heu.commom.utils;

import com.heu.commom.core.text.Convert;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 客户端工具类
 */
public class ServletUtils {
    /**
     * 获取请求参数,并转换为int类型
     * @param name
     * @return
     */
    public static Integer getParameterToInt(String name){
        return Convert.toInt(getRequest().getParameter(name));
    }

    /**
     * 获取HttpServletRequest
     * @return
     */
    public static HttpServletRequest getRequest(){
        return getRequestAttributes().getRequest();
    }

    /**
     * 获取RequestAttributes
     * @return
     */
    public static ServletRequestAttributes getRequestAttributes(){
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes) attributes;
    }
}
