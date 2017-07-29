package com.dongfangyuxin.controller.common;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础Action
 */
public class BaseAction {
    /**
     * 分页信息设置
     *
     * @param page the page
     * @param rows the rows
     * @return page page
     */
    protected Page paging(int page, int rows) {
        // 数据范围开始：每页的行数*页数
        int offset = rows * (page - 1);
        // 数据范围结束：每页的行数*（页数+1）
        int limit = rows;
        return new Page(offset, limit);
    }

    /**
     * 返回请求结果
     *
     * @param data      the data
     * @param resultFlg the result flg
     * @param msg       the msg
     * @return the map
     */
    protected Map<String, Object> convertReponse(Map<String, Object> data, boolean resultFlg, String msg) {
        Map<String, Object> resultMap = new HashMap<>();
        // 设置请求结果
        resultMap.put("success", resultFlg);
        // 设置请求返回消息
        resultMap.put("message", msg);
        // 设置请求数据结果
        resultMap.put("data", data);
        return resultMap;

    }
}
