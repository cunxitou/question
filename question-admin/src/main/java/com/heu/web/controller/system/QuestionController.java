package com.heu.web.controller.system;
import com.heu.commom.core.BaseController;
import com.heu.commom.core.domain.AjaxResult;
import com.heu.commom.core.page.PageResult;
import com.heu.system.domain.Question;
import com.heu.system.service.QuestionService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
/*

    */
/**
     * 数据库修改数据
     * @return
     *//*

    @PutMapping
    public AjaxResult add(){
        int i;
        int m = 62;

        for (int j = 68; j <= 833; j++) {
            int n = 0;
            for (i=m; n < 4 ; i++, n++) {
                questionService.add(i,j);
            }
            m = i;
        }
        return AjaxResult.success();
    }
*/

}
