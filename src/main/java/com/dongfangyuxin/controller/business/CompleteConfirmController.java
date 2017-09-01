package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBean;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBeanExample;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/completeConfirm")
public class CompleteConfirmController extends BaseAction {

    private Logger logger = LogManager.getLogger(CompleteConfirmController.class);


    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;

    /**
     * 开工确认
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String completeConfirm(Model model) {
        logger.info("进入请求了");
        ProjectInfoBeanExample condition = new ProjectInfoBeanExample();
        condition.createCriteria().andStatusEqualTo("004");
        List<ProjectInfoBean> taskArray= projectInfoMasterService.getAllInfo(condition);
        model.addAttribute("taskArray", taskArray);
        return "completeConfirm";
    }

    /**
     * 开工确认
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String taskCode) {

        ProjectInfoBeanExample condition = new ProjectInfoBeanExample();
        condition.createCriteria().andIdEqualTo(Integer.parseInt(taskCode));
        List<ProjectInfoBean> projectInfoList=projectInfoMasterService.getAllInfo(condition);
        if(null!=projectInfoList){
            projectInfoList.get(0).setStatus("005");
            projectInfoMasterService.editDataInfo(projectInfoList.get(0));
        }

        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        return convertReponse(resultMap, true, null);
    }
}
