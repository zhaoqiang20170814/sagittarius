package com.dongfangyuxin.controller.common;

/**
 * 分页信息对象
 */
public class Page {
    /**
     * 分页查询开始记录位置
     */
    private int begin;
    /**
     * 分页查看下结束位置
     */
    private int end;

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
