package com.dongfangyuxin.controller.master;

import com.alibaba.fastjson.JSON;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.ClassificationLevelOneMasterService;
import com.dongfangyuxin.service.master.ClassificationLevelTwoMasterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 成本二级分类信息表
 */
@Controller
@RequestMapping(value = "/classificationLevelTwoMaster")
public class ClassificationLeveTwoController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(ClassificationLeveTwoController.class);
    // 成本一级分类维护相关服务
    @Autowired
    private ClassificationLevelOneMasterService classificationLevelOneMasterService;
    // 成本一级分类维护相关服务
    @Autowired
    private ClassificationLevelTwoMasterService classificationLevelTwoMasterService;

    /**
     * 度量衡界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String htmlPage(Model model) {
        // 获得成本一级分类
        model.addAttribute("classificationLevelOne", JSON.toJSONString(classificationLevelOneMasterService.getClassificationLevelOneAllInfo()));
        return "classificationLevelTwoMaster";
    }

    /**
     * 度量衡单位维护初始化界面
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "load", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> load(HttpServletRequest request, HttpServletResponse response, @RequestParam int page, @RequestParam int rows) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 查询度量衡信息
        resultMap.put("rows", classificationLevelTwoMasterService.getClassificationLevelTwoInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", classificationLevelTwoMasterService.getClassificationLevelTwoCountInfo(null));
        // 返回度量衡信息
        return resultMap;
    }

    /**
     * 度量衡单位新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String code, @RequestParam String name, @RequestParam String parent) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ClassificationLevelTwoBean classificationLevelTwoBean = new ClassificationLevelTwoBean();
        classificationLevelTwoBean.setCode(code);
        classificationLevelTwoBean.setName(name);
        classificationLevelTwoBean.setParent(parent);
        long key = classificationLevelTwoMasterService.addClassificationLevelTwoInfo(classificationLevelTwoBean);
        // 返回度量衡信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 度量衡单位修改
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "edit", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> edit(HttpServletRequest request, HttpServletResponse response, @RequestParam int id, @RequestParam String code, @RequestParam String name, @RequestParam String parent) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ClassificationLevelTwoBean classificationLevelTwoBean = new ClassificationLevelTwoBean();
        classificationLevelTwoBean.setId(id);
        classificationLevelTwoBean.setCode(code);
        classificationLevelTwoBean.setName(name);
        classificationLevelTwoBean.setParent(parent);
        int key = classificationLevelTwoMasterService.editClassificationLevelTwoInfo(classificationLevelTwoBean);
        // 返回度量衡信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 度量衡单位删除
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "remove", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> remove(HttpServletRequest request, HttpServletResponse response, @RequestParam int id) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ClassificationLevelTwoBean classificationLevelTwoBean = new ClassificationLevelTwoBean();
        classificationLevelTwoBean.setId(id);
        int key = classificationLevelTwoMasterService.removeClassificationLevelTwoInfo(classificationLevelTwoBean);
        // 返回度量衡信息
        return convertReponse(resultMap, true, null);
    }
}