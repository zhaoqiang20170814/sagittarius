package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.common.dao.bean.CarInfoBean;
import com.dongfangyuxin.common.dao.bean.ProjectInfoBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.ProjectInfoMasterService;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 车辆信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/projectInfoMaster")
public class ProjectInfoMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(ProjectInfoMasterController.class);
    // 车辆维护相关服务
    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;

    /**
     * 车辆界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(Map<String, Object> map) {
        return "projectInfoMaster";
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
        resultMap.put("rows", projectInfoMasterService.getDataInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", projectInfoMasterService.getCountInfo(null));
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
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String name,
                                   @RequestParam String status, @RequestParam String owner, @RequestParam String address,
                                   @RequestParam Date startTime, @RequestParam BigDecimal programBudget, @RequestParam BigDecimal realtimeCost) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ProjectInfoBean projectInfoBean = new ProjectInfoBean();
        // 项目名
        projectInfoBean.setName(name);
        // 项目状态
        projectInfoBean.setStatus(status);
        // 项目负责人
        projectInfoBean.setOwner(owner);
        // 项目地址
        projectInfoBean.setAddress(address);
        // 项目开始时间
        projectInfoBean.setStartTime(startTime);
        // 项目预算
        projectInfoBean.setProgramBudget(programBudget);
        // 项目实时成本
        projectInfoBean.setRealtimeCost(realtimeCost);
        long key = projectInfoMasterService.addDataInfo(projectInfoBean);
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
                                    @RequestParam String name, @RequestParam String status, @RequestParam String owner,
                                    @RequestParam String address, @RequestParam Date startTime, @RequestParam BigDecimal programBudget,
                                    @RequestParam BigDecimal realtimeCost) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        CarInfoBean carInfoBean = new CarInfoBean();
        // 数据设定
        ProjectInfoBean projectInfoBean = new ProjectInfoBean();
        // 主键
        projectInfoBean.setId(id);
        // 项目名
        projectInfoBean.setName(name);
        // 项目状态
        projectInfoBean.setStatus(status);
        // 项目负责人
        projectInfoBean.setOwner(owner);
        // 项目地址
        projectInfoBean.setAddress(address);
        // 项目开始时间
        projectInfoBean.setStartTime(startTime);
        // 项目预算
        projectInfoBean.setProgramBudget(programBudget);
        // 项目实时成本
        projectInfoBean.setRealtimeCost(realtimeCost);
        int key = projectInfoMasterService.editDataInfo(projectInfoBean);
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
        ProjectInfoBean projectInfoBean = new ProjectInfoBean();
        // 主键
        projectInfoBean.setId(id);
        int key = projectInfoMasterService.removeDataInfo(projectInfoBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
