package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.dao.common.bean.ProjectInfoBean;
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
public class PictureViewController {

    private Logger logger = LogManager.getLogger(PictureViewController.class);
    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;
    /**
     * 测试hello
     *
     * @returnc
     */
    @RequestMapping(value = "/pictureView", method = RequestMethod.GET)
    public String pictureView(Model model) {
        logger.info("进入请求了");

        List<ProjectInfoBean> taskArray= projectInfoMasterService.getAllInfo(null);

        //model.addAttribute("pictureArray", volist4);
        model.addAttribute("taskArray", taskArray);
        return "pictureView";
    }
}
