package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.dao.common.bean.MaterialBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.MaterialMasterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 车辆信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/materialMaster")
public class MaterialMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(MaterialMasterController.class);
    // 车辆维护相关服务
    @Autowired
    private MaterialMasterService materialMasterService;

    /**
     * 车辆界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(Map<String, Object> map) {
        return "materialMaster";
    }

    /**
     * 车辆单位维护初始化界面
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "load", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> load(HttpServletRequest request, HttpServletResponse response,
                                    @RequestParam int page, @RequestParam int rows) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 查询车辆信息
        resultMap.put("rows", materialMasterService.getDataInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", materialMasterService.getCountInfo(null));
        // 返回车辆信息
        return resultMap;
    }

    /**
     * 车辆单位新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String code,
                                   @RequestParam String name, @RequestParam String type, @RequestParam String unit,
                                   @RequestParam BigDecimal price) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialBean materialBean = new MaterialBean();
        // 原材料编号
        materialBean.setCode(code);
        // 原料名称
        materialBean.setName(name);
        // 原料分类
        materialBean.setType(type);
        // 单位
        materialBean.setUnit(unit);
        // 单价
        materialBean.setPrice(price);
        long key = materialMasterService.addDataInfo(materialBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 车辆单位修改
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "edit", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> edit(HttpServletRequest request, HttpServletResponse response, @RequestParam int id,
                                    @RequestParam String code, @RequestParam String name, @RequestParam String type,
                                    @RequestParam String unit, @RequestParam BigDecimal price) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialBean materialBean = new MaterialBean();
        // 主键
        materialBean.setId(id);
        // 原材料编号
        materialBean.setCode(code);
        // 原料名称
        materialBean.setName(name);
        // 原料分类
        materialBean.setType(type);
        // 单位
        materialBean.setUnit(unit);
        // 单价
        materialBean.setPrice(price);
        int key = materialMasterService.editDataInfo(materialBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 车辆单位删除
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
        MaterialBean materialBean = new MaterialBean();
        // 主键
        materialBean.setId(id);
        int key = materialMasterService.removeDataInfo(materialBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
