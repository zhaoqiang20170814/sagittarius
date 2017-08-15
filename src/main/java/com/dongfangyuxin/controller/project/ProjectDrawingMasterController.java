package com.dongfangyuxin.controller.project;

import com.dongfangyuxin.dao.common.bean.ProjectDrawingBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.common.bean.ProjectDrawingBeanExample;
import com.dongfangyuxin.service.project.ProjectDrawingMasterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目图纸信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/projectDrawingMaster")
public class ProjectDrawingMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(ProjectDrawingMasterController.class);
    // 项目图纸维护相关服务
    @Autowired
    private ProjectDrawingMasterService projectDrawingMasterService;

    /**
     * 项目图纸界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(@RequestParam int projectCode, Model model) {
        // 项目编号
        model.addAttribute("projectCode", projectCode);
        return "projectDrawingMaster";
    }

    /**
     * 项目图纸单位维护初始化界面
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "load", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> load(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer projectCode,
                                    @RequestParam int page, @RequestParam int rows) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 查询项目图纸信息
        ProjectDrawingBeanExample condition = new ProjectDrawingBeanExample();
        condition.createCriteria().andProjectCodeEqualTo(projectCode);
        resultMap.put("rows", projectDrawingMasterService.getDataInfo(condition, paging(page, rows)));
        // 数据条数
        resultMap.put("total", projectDrawingMasterService.getCountInfo(condition));
        // 返回项目图纸信息
        return resultMap;
    }

    /**
     * 项目图纸单位新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer projectCode,
                                   @RequestParam String code, @RequestParam String name, @RequestParam MultipartFile projectDrawingFile) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 保存项目图纸
        String filePath = projectDrawingMasterService.saveProjectDrawing(projectDrawingFile, projectCode);
        // 数据设定
        ProjectDrawingBean projectDrawingBean = new ProjectDrawingBean();
        // 项目编号
        projectDrawingBean.setProjectCode(projectCode);
        // 项目图纸编号
        projectDrawingBean.setCode(code);
        // 项目图纸描述
        projectDrawingBean.setName(name);
        // 项目图纸URL
        projectDrawingBean.setUrl(filePath);
        long key = projectDrawingMasterService.addDataInfo(projectDrawingBean);
        // 返回项目图纸信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 项目图纸单位修改
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "edit", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> edit(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer id, @RequestParam Integer projectCode,
                                    @RequestParam String code, @RequestParam String name, @RequestParam MultipartFile projectDrawingFile) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 保存项目图纸
        String filePath = projectDrawingMasterService.saveProjectDrawing(projectDrawingFile, projectCode);
        // 数据设定
        ProjectDrawingBean projectDrawingBean = new ProjectDrawingBean();
        // 主键
        projectDrawingBean.setId(id);
        // 项目编号
        projectDrawingBean.setProjectCode(projectCode);
        // 项目图纸编号
        projectDrawingBean.setCode(code);
        // 项目图纸描述
        projectDrawingBean.setName(name);
        // 项目图纸URL
        projectDrawingBean.setUrl(filePath);
        int key = projectDrawingMasterService.editDataInfo(projectDrawingBean);
        // 返回项目图纸信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 项目图纸单位删除
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
        ProjectDrawingBean projectDrawingBean = new ProjectDrawingBean();
        // 主键
        projectDrawingBean.setId(id);
        int key = projectDrawingMasterService.removeDataInfo(projectDrawingBean);
        // 返回项目图纸信息
        return convertReponse(resultMap, true, null);
    }

}
