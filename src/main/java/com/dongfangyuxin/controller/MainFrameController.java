package com.dongfangyuxin.controller;

/**
 * Created by dongl on 2017/7/1.
 */

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 系统主页面框架
 *
 * @author dongl 2017/07/01 1.0.1
 * @version 1.0.1
 */
@Controller
public class MainFrameController {
    // 日志
    public static final Logger LOGGER = LogManager.getLogger(MainFrameController.class);

    /**
     * 主框架界面
     */
    @RequestMapping(value = "mainFrame", method = RequestMethod.GET)
    public String mainFrame(Model model) {
        return "mainFrame";
    }


}
