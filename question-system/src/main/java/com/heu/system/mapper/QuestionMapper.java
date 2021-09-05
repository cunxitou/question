package com.heu.system.mapper;

import com.heu.system.domain.Option;
import com.heu.system.domain.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionMapper {
    /**
     * 查询所有问题
     * @return
     */
    List<Question> findAll();

    /**
     * 添加外键
     */
    void add(@Param("oid") int oid, @Param("qid") int qid);

}
