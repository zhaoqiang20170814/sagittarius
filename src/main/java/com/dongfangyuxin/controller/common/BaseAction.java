package com.dongfangyuxin.controller.common;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * 基础Action
 */
public class BaseAction {
    /**
     * 分页信息设置
     *
     * @param page the page
     * @param rows the rows
     * @return page
     */
    protected Page paging(int page, int rows) {
        // 数据范围开始：每页的行数*页数
        int offset = rows * (page - 1);
        // 数据范围结束：每页的行数*（页数+1）
        int limit = rows;
        return new Page(offset, limit);
    }
}
