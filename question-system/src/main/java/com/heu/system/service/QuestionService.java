package com.heu.system.service;

import com.heu.system.domain.Option;
import com.heu.system.domain.Question;

import java.util.List;

public interface QuestionService {
    /**
     * 查询所有问题
     * @return
     */
    List<Question> findAll(int pageNum, int pageSize);

    /**
     * 通过qid查询选项
     * @param qid
     * @return
     */
    List<Option> findOptionById(Integer qid);
}
