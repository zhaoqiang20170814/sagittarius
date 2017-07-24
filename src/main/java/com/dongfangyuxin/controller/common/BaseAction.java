package com.dongfangyuxin.controller.common;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * 基础Action
 */
public class BaseAction {
    /**
     * 分页信息设置
     *
     * @param request
     * @return
     */
    protected Page paging(int page, int rows) {
        // 当前页码
        int page = Integer.parseInt((request.getParameter("page") == null || request.getParameter("page") == "0") ? "1" : request.getParameter("page"));
        // 每页显示数据条数
        int number = Integer.parseInt((request.getParameter("rows") == null || request.getParameter("rows") == "0") ? "20" : request.getParameter("rows"));
        return new Page((page - 1) * number, number);
    }
}
