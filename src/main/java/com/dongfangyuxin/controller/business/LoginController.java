package com.dongfangyuxin.controller.business;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
public class LoginController {

    private Logger logger = LogManager.getLogger(LoginController.class);

    /**
     * 测试hello
     *
     * @returnc
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        logger.info("进入请求了");
        return "login";
    }
}
