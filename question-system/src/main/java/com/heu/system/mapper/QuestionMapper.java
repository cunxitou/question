package com.heu.system.mapper;

import com.heu.system.domain.Option;
import com.heu.system.domain.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionMapper {
    /**
     * 查询所有问题
     * @return
     */
    List<Question> findAll();

    /**
     * 通过qid查询选项
     * @param qid
     * @return
     */
    List<Option> findOptionById(int qid);
}
