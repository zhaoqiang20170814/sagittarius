package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.common.bean.*;
import com.dongfangyuxin.service.business.CarUsedHistoryService;
import com.dongfangyuxin.service.master.CarMasterService;
import com.dongfangyuxin.service.project.ProjectInfoMasterService;
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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/carReturn")
public class CarReturnController  extends BaseAction {

    private Logger logger = LogManager.getLogger(CarReturnController.class);

    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;

    @Autowired
    private CarUsedHistoryService carUsedHistoryService;

    @Autowired
    private CarMasterService carMasterService;

    /**
     * 测试hello
     *
     * @returnc
     */
    @RequestMapping(method = RequestMethod.GET)
    public String carReturn(Model model) {
        ProjectInfoBeanExample condition = new ProjectInfoBeanExample();
        condition.createCriteria().andStatusNotEqualTo("001");
        List<ProjectInfoBean> taskArray= projectInfoMasterService.getAllInfo(condition);

        List<CarUsedHistoryBean> carArray= carUsedHistoryService.getAllInfo();

        model.addAttribute("carArray", carArray);
        model.addAttribute("taskArray", taskArray);
        return "carReturn";
    }

    /**
     * 车辆单位新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "save", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> save(HttpServletRequest request, HttpServletResponse response, @RequestParam String taskCode) {
        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();

        CarUsedHistoryBeanExample condition = new CarUsedHistoryBeanExample();
        condition.createCriteria().andTaskCodeEqualTo(taskCode);
        List<CarUsedHistoryBean> carUsedList=carUsedHistoryService.getDataByCondition(condition);
        if(null!=carUsedList){
            CarInfoBeanExample conditions = new CarInfoBeanExample();
            conditions.createCriteria().andCodeEqualTo(carUsedList.get(0).getCarNumber());
            List<CarInfoBean> carinfoList=carMasterService.getDataByCondition(conditions);
            if(null!=carinfoList){
                for(CarInfoBean carinfo:carinfoList){
                    carinfo.setStatus("001");
                    carMasterService.editDataInfo(carinfo);
                }
            }
        }

        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
