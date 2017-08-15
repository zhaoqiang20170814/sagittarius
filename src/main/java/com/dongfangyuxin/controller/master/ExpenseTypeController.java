package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.dao.common.bean.ExpenseTypeInfoBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.ExpenseTypeMasterService;
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
 * 报销项目信息表
 */
@Controller
@RequestMapping(value = "/expenseTypeMaster")
public class ExpenseTypeController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(ExpenseTypeController.class);
    // 报销项目分类维护相关服务
    @Autowired
    private ExpenseTypeMasterService expenseTypeMasterService;

    /**
     * 度量衡界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String htmlPage(Model model) {
        return "expenseTypeMaster";
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
        resultMap.put("rows", expenseTypeMasterService.getExpenseTypeInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", expenseTypeMasterService.getExpenseTypeCountInfo(null));
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
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String code, @RequestParam String name) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ExpenseTypeInfoBean expenseTypeInfoBean = new ExpenseTypeInfoBean();
        expenseTypeInfoBean.setCode(code);
        expenseTypeInfoBean.setName(name);
        long key = expenseTypeMasterService.addExpenseTypeInfo(expenseTypeInfoBean);
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
    public Map<String, Object> edit(HttpServletRequest request, HttpServletResponse response, @RequestParam int id, @RequestParam String code, @RequestParam String name) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ExpenseTypeInfoBean expenseTypeInfoBean = new ExpenseTypeInfoBean();
        expenseTypeInfoBean.setId(id);
        expenseTypeInfoBean.setCode(code);
        expenseTypeInfoBean.setName(name);
        int key = expenseTypeMasterService.editExpenseTypeInfo(expenseTypeInfoBean);
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
        ExpenseTypeInfoBean expenseTypeInfoBean = new ExpenseTypeInfoBean();
        expenseTypeInfoBean.setId(id);
        int key = expenseTypeMasterService.removeExpenseTypeInfo(expenseTypeInfoBean);
        // 返回度量衡信息
        return convertReponse(resultMap, true, null);
    }
}