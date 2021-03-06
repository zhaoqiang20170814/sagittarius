package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelOneBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.MaterialTypeLevelOneMasterService;
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
import java.util.HashMap;
import java.util.Map;

/**
 * 车辆信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/materialTypeLevelOneMaster")
public class MaterialTypeLevelOneMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(MaterialTypeLevelOneMasterController.class);
    // 车辆维护相关服务
    @Autowired
    private MaterialTypeLevelOneMasterService materialTypeLevelOneMasterService;

    /**
     * 车辆界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(Map<String, Object> map) {
        return "materialTypeLevelOneMaster";
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
        resultMap.put("rows", materialTypeLevelOneMasterService.getDataInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", materialTypeLevelOneMasterService.getCountInfo(null));
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
                                   @RequestParam String name, @RequestParam String remark) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialTypeLevelOneBean materialTypeLevelOneBean = new MaterialTypeLevelOneBean();
        // 一级分类编号
        materialTypeLevelOneBean.setCode(code);
        // 一级分类名称
        materialTypeLevelOneBean.setName(name);
        // 备注
        materialTypeLevelOneBean.setRemark(remark);
        long key = materialTypeLevelOneMasterService.addDataInfo(materialTypeLevelOneBean);
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
                                    @RequestParam String code, @RequestParam String name, @RequestParam String remark) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialTypeLevelOneBean materialTypeLevelOneBean = new MaterialTypeLevelOneBean();
        // 主键
        materialTypeLevelOneBean.setId(id);
        // 一级分类编号
        materialTypeLevelOneBean.setCode(code);
        // 一级分类名称
        materialTypeLevelOneBean.setName(name);
        // 备注
        materialTypeLevelOneBean.setRemark(remark);
        int key = materialTypeLevelOneMasterService.editDataInfo(materialTypeLevelOneBean);
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
        MaterialTypeLevelOneBean materialTypeLevelOneBean = new MaterialTypeLevelOneBean();
        // 主键
        materialTypeLevelOneBean.setId(id);
        int key = materialTypeLevelOneMasterService.removeDataInfo(materialTypeLevelOneBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
