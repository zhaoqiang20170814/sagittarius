package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBean;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBean;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBeanExample;
import com.dongfangyuxin.service.business.CarUsedHistoryService;
import com.dongfangyuxin.service.project.ProjectInfoMasterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
public class CarReturnController {

    private Logger logger = LogManager.getLogger(CarReturnController.class);

    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;

    @Autowired
    private CarUsedHistoryService carUsedHistoryService;
    /**
     * 测试hello
     *
     * @returnc
     */
    @RequestMapping(value = "/carReturn", method = RequestMethod.GET)
    public String carReturn(Model model) {
        ProjectInfoBeanExample condition = new ProjectInfoBeanExample();
        condition.createCriteria().andStatusNotEqualTo("001");
        List<ProjectInfoBean> taskArray= projectInfoMasterService.getAllInfo(condition);

        List<CarUsedHistoryBean> carArray= carUsedHistoryService.getAllInfo();

        model.addAttribute("carArray", carArray);
        model.addAttribute("taskArray", taskArray);
        return "carReturn";
    }
}
