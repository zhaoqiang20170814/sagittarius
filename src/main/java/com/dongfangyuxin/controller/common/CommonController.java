package com.dongfangyuxin.controller.common;

import com.alibaba.fastjson.JSON;
import com.dongfangyuxin.service.master.ClassificationLevelOneMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 共同用Controller
 */
@Controller
@RequestMapping(value = "/commonController")
public class CommonController {

    @Autowired
    private ClassificationLevelOneMasterService classificationLevelOneMasterService;

    /**
     * 成本一级分类ComboBox
     *
     * @return
     */
    @RequestMapping(value = "combobox/classificationLevelOne", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String load(HttpServletRequest request, HttpServletResponse response) {
        String result = JSON.toJSONString(classificationLevelOneMasterService.getClassificationLevelOneAllInfo());
        return result;
    }
}
