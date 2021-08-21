package com.heu.commom.core.page;

import java.util.List;

/**
 * 分页数据返回类
 */
public class PageResult {
    //总记录数
    private Long total;
    //返回数据列表
    private List<?> data;
    //消息状态码
    private int code;
    //消息内容
    private String msg;

    public PageResult() {
    }

    public PageResult(Long total, List<?> data) {
        this.total = total;
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
