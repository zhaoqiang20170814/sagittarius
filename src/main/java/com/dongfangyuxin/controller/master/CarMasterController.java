package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.dao.common.bean.CarInfoBean;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.master.CarMasterService;
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
@RequestMapping(value = "/carMaster")
public class CarMasterController extends BaseAction {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(CarMasterController.class);
    // 车辆维护相关服务
    @Autowired
    private CarMasterService carMasterService;

    /**
     * 车辆界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String init(Map<String, Object> map) {
        return "carMaster";
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
        resultMap.put("rows", carMasterService.getDataInfo(null, paging(page, rows)));
        // 数据条数
        resultMap.put("total", carMasterService.getCountInfo(null));
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
                                   @RequestParam String type, @RequestParam String status, @RequestParam String memo) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        CarInfoBean carInfoBean = new CarInfoBean();
        // 车辆编号
        carInfoBean.setCode(code);
        // 车辆类型
        carInfoBean.setType(type);
        // 车辆状态
        carInfoBean.setStatus(status);
        // 备注
        carInfoBean.setMemo(memo);
        long key = carMasterService.addDataInfo(carInfoBean);
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
                                    @RequestParam String code, @RequestParam String type, @RequestParam String status,
                                    @RequestParam String memo) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        CarInfoBean carInfoBean = new CarInfoBean();
        // 数据设定
        // 主键
        carInfoBean.setId(id);
        // 车辆编号
        carInfoBean.setCode(code);
        // 车辆类型
        carInfoBean.setType(type);
        // 车辆状态
        carInfoBean.setStatus(status);
        int key = carMasterService.editDataInfo(carInfoBean);
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
        CarInfoBean carInfoBean = new CarInfoBean();
        // 主键
        carInfoBean.setId(id);
        int key = carMasterService.removeDataInfo(carInfoBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
