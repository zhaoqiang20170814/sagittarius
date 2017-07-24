package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.common.dao.bean.UnitBean;
import com.dongfangyuxin.service.master.UnitMasterService;
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
import java.util.List;
import java.util.Map;

/**
 * 度量衡信息维护
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping(value = "/unitMaster")
public class UnitMasterController {
    // 日志
    private static final Logger LOGGER = LogManager.getLogger(UnitMasterController.class);
    // 度量衡单位维护相关服务
    @Autowired
    private UnitMasterService unitMasterService;

    /**
     * 度量衡界面
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String materialMaster(Map<String, Object> map) {
        return "unitMaster";
    }

    /**
     * 度量衡单位维护初始化界面
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "init", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> init(HttpServletRequest request, HttpServletResponse response, @RequestParam int page, @RequestParam int rows) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 查询度量衡信息
        List<UnitBean> dataList = unitMasterService.getUnitInfo(null);
        // 数据信息
        resultMap.put("rows", dataList);
        // 数据条数
        resultMap.put("total", dataList.size());
        // 返回度量衡信息
        return resultMap;
    }
}
