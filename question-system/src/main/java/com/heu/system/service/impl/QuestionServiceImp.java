package com.heu.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.heu.commom.utils.RandomOrder;
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
    public List<Question> findAll() {
        List<Question> questions = questionMapper.findAll();
        for (Question question : questions) {
            RandomOrder.knuth(question.getOptions());
        }
        return questions;
    }

    @Override
    public void add(int oid, int qid) {
        questionMapper.add(oid, qid);
    }

}
