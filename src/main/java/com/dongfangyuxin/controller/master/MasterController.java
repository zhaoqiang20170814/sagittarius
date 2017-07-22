package com.dongfangyuxin.controller.master;

import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.service.master.MaterialMasterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主档界面请求
 *
 * @author dl 2017/05/20 1.0.1
 * @version 1.0.1
 */
@Controller
@RequestMapping("/materialMaster")
public class MasterController {
    // 日志
    public static final Logger LOGGER = LogManager.getLogger(MasterController.class);

    @Autowired
    private MaterialMasterService materialMasterService;

    /**
     * 原材料维护
     *
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String materialMaster(Map<String, Object> map) {
        return "materialMaster";
    }

    /**
     * 界面初始化
     *
     * @return
     */
    @RequestMapping(value = "init", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> init(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<>();
        List<MaterialBean> dataList = materialMasterService.getMaterialInfo(null);
        resultMap.put("rows", dataList);
        resultMap.put("total", dataList.size());
        return resultMap;
    }


}
