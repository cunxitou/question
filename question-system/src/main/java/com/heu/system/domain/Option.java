package com.heu.system.domain;

/**
 * 答案类
 */
public class Option {
    private String optionDec;//答案描述
    private int answer;//问题答案 0：错误  1：正确

    public String getOptionDec() {
        return optionDec;
    }

    public void setOptionDec(String optionDec) {
        this.optionDec = optionDec;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
