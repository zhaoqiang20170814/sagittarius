package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.common.bean.UserBean;
import com.dongfangyuxin.service.master.UserMasterService;
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
 * 用户信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/userMaster")
public class UserMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(UserMasterController.class);
    // 用户维护相关服务
    @Autowired
    private UserMasterService userMasterService;

    /**
     * 用户界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(Map<String, Object> map) {
        return "UserMaster";
    }

    /**
     * 用户单位维护初始化界面
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
        // 查询用户信息
        resultMap.put("rows", userMasterService.getDataInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", userMasterService.getCountInfo(null));
        // 返回用户信息
        return resultMap;
    }

    /**
     * 用户单位新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String code,
                                   @RequestParam String name, @RequestParam String password, @RequestParam String sex,
                                   @RequestParam int age, @RequestParam String post, @RequestParam String department,
                                   @RequestParam String contact, @RequestParam String idNumber) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        UserBean userBean = new UserBean();
        // 用户编号
        userBean.setCode(code);
        // 用户姓名
        userBean.setName(name);
        // 密码
        userBean.setPassword(password);
        // 性别
        userBean.setSex(sex);
        // 年龄
        userBean.setAge(age);
        // 职位
        userBean.setPost(post);
        // 所属部门
        userBean.setDepartment(department);
        // 联系方式
        userBean.setContact(contact);
        // 身份证号
        userBean.setIdNumber(idNumber);
        long key = userMasterService.addDataInfo(userBean);
        // 返回用户信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 用户单位修改
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "edit", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> edit(HttpServletRequest request, HttpServletResponse response, @RequestParam int id,
                                    @RequestParam String code, @RequestParam String name, @RequestParam String password,
                                    @RequestParam String sex, @RequestParam int age, @RequestParam String post,
                                    @RequestParam String department, @RequestParam String contact, @RequestParam String idNumber) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        UserBean userBean = new UserBean();
        // 主键
        userBean.setId(id);
        // 用户编号
        userBean.setCode(code);
        // 用户姓名
        userBean.setName(name);
        // 密码
        userBean.setPassword(password);
        // 性别
        userBean.setSex(sex);
        // 年龄
        userBean.setAge(age);
        // 职位
        userBean.setPost(post);
        // 所属部门
        userBean.setDepartment(department);
        // 联系方式
        userBean.setContact(contact);
        // 身份证号
        userBean.setIdNumber(idNumber);
        int key = userMasterService.editDataInfo(userBean);
        // 返回用户信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 用户单位删除
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
        UserBean userBean = new UserBean();
        // 主键
        userBean.setId(id);
        int key = userMasterService.removeDataInfo(userBean);
        // 返回用户信息
        return convertReponse(resultMap, true, null);
    }
}