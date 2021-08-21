package com.heu.commom.core;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.heu.commom.constant.HttpStatus;
import com.heu.commom.core.page.PageDomain;
import com.heu.commom.core.page.PageResult;
import com.heu.commom.core.page.PageSupport;
import com.heu.commom.utils.StringUtils;

import java.util.List;

public class BaseController {

    /**
     * 请求分页数据
     */
    public void startPage(){
        PageDomain pageDomain = PageSupport.getPageDomain();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();

        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)){
            PageHelper.startPage(pageNum, pageSize);
        }
    }

    public PageResult getPageResult(List<?> data){
        PageResult pageResult = new PageResult();
        pageResult.setData(data);
        pageResult.setTotal(new PageInfo(data).getTotal());
        pageResult.setCode(HttpStatus.SUCCESS);
        pageResult.setMsg("查询成功");
        return pageResult;
    }
}
