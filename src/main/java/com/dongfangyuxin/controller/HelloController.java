package com.dongfangyuxin.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
public class HelloController {

    private Logger logger = LogManager.getLogger(HelloController.class);

    /**
     * 测试hello
     *
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        logger.info("进入请求了");
        model.addAttribute("name", "Dear");
        return "hello";
    }

}
