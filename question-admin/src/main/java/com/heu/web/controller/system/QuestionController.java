package com.heu.web.controller.system;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.heu.commom.core.BaseController;
import com.heu.commom.core.domain.AjaxResult;
import com.heu.commom.core.page.PageResult;
import com.heu.system.domain.Question;
import com.heu.system.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController extends BaseController {
    @Autowired
    private QuestionService questionService;

    @GetMapping
    public PageResult findAll(){
        //处理分页数据
        startPage();
        List<Question> questions = questionService.findAll();
        //封装分页数据，并返回
        return getPageResult(questions);
    }

}
