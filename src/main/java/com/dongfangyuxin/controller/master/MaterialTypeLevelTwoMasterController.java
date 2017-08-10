package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.common.dao.bean.MaterialTypeLevelOneBean;
import com.dongfangyuxin.common.dao.bean.MaterialTypeLevelTwoBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.MaterialTypeLevelTwoMasterService;
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
 * 原材料二级信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/materialTypeLevelTwoMaster")
public class MaterialTypeLevelTwoMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(MaterialTypeLevelTwoMasterController.class);
    // 原材料二级维护相关服务
    @Autowired
    private MaterialTypeLevelTwoMasterService materialTypeLevelTwoMasterService;

    /**
     * 原材料二级界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(Map<String, Object> map) {
        return "MaterialTypeLevelTwoMaster";
    }

    /**
     * 原材料二级单位维护初始化界面
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
        // 查询原材料二级信息
        resultMap.put("rows", materialTypeLevelTwoMasterService.getDataInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", materialTypeLevelTwoMasterService.getCountInfo(null));
        // 返回原材料二级信息
        return resultMap;
    }

    /**
     * 原材料二级单位新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String code,
                                   @RequestParam String name, @RequestParam String parent, @RequestParam String remark) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialTypeLevelTwoBean materialTypeLevelTwoBean = new MaterialTypeLevelTwoBean();
        // 二级分类编号
        materialTypeLevelTwoBean.setCode(code);
        // 二级分类名称
        materialTypeLevelTwoBean.setName(name);
        // 父分类
        materialTypeLevelTwoBean.setParent(parent);
        // 备注
        materialTypeLevelTwoBean.setRemark(remark);
        long key = materialTypeLevelTwoMasterService.addDataInfo(materialTypeLevelTwoBean);
        // 返回原材料二级信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 原材料二级单位修改
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "edit", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> edit(HttpServletRequest request, HttpServletResponse response, @RequestParam int id,
                                    @RequestParam String code, @RequestParam String name, @RequestParam String parent,
                                    @RequestParam String remark) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialTypeLevelTwoBean materialTypeLevelTwoBean = new MaterialTypeLevelTwoBean();
        // 主键
        materialTypeLevelTwoBean.setId(id);
        // 二级分类编号
        materialTypeLevelTwoBean.setCode(code);
        // 二级分类名称
        materialTypeLevelTwoBean.setName(name);
        // 父分类
        materialTypeLevelTwoBean.setParent(parent);
        // 备注
        materialTypeLevelTwoBean.setRemark(remark);
        int key = materialTypeLevelTwoMasterService.editDataInfo(materialTypeLevelTwoBean);
        // 返回原材料二级信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 原材料二级单位删除
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
        MaterialTypeLevelTwoBean materialTypeLevelTwoBean = new MaterialTypeLevelTwoBean();
        // 主键
        materialTypeLevelTwoBean.setId(id);
        int key = materialTypeLevelTwoMasterService.removeDataInfo(materialTypeLevelTwoBean);
        // 返回原材料二级信息
        return convertReponse(resultMap, true, null);
    }
}
