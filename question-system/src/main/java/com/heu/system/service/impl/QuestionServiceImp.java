package com.heu.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.heu.system.domain.Option;
import com.heu.system.domain.Question;
import com.heu.system.mapper.QuestionMapper;
import com.heu.system.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public List<Question> findAll(int pageNum, int pageSize) {

        return questionMapper.findAll();
    }

    @Override
    public List<Option> findOptionById(Integer qid) {
        return null;
    }
}
