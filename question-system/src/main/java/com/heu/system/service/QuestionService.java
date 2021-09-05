package com.heu.system.service;

import com.heu.system.domain.Option;
import com.heu.system.domain.Question;

import java.util.List;

public interface QuestionService {
    /**
     * 查询所有问题
     * @return
     */
    List<Question> findAll();

    void add(int oid, int qid);
}
