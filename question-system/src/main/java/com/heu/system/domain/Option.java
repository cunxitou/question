package com.heu.system.domain;

/**
 * 答案类
 */
public class Option {
    private int oid;
    private String optionDec;
    private int qid;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOptionDec() {
        return optionDec;
    }

    public void setOptionDec(String optionDec) {
        this.optionDec = optionDec;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }
}
