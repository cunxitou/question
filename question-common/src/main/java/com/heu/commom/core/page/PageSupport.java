package com.heu.commom.core.page;

public class PageSupport {
    private static final Integer pageNum = 1;
    private static final Integer pageSize = 5;

    /**
     * 封装分页对象
     * @return
     */
    public static PageDomain getPageDomain(){
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(pageNum);
        pageDomain.setPageSize(pageSize);
        return pageDomain;
    }
}
