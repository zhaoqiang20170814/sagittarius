package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.common.vo.MaterialRetrunVo;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.common.bean.*;
import com.dongfangyuxin.service.business.ExpenseInfoDetailService;
import com.dongfangyuxin.service.master.UserMasterService;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseAction {

    private Logger logger = LogManager.getLogger(LoginController.class);

    @Autowired
    private UserMasterService userMasterService;
    /**
     * 测试hello
     *
     * @returnc
     */
    @RequestMapping(method = RequestMethod.GET)
    public String login(Model model) {
        logger.info("进入请求了");
        return "login";
    }

    /**
     * 登录信息检查
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "logincheck", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> logincheck(HttpServletRequest request, HttpServletResponse response, @RequestParam String userName,
                                   @RequestParam String password) {

        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        UserBeanExample condition = new UserBeanExample();
        condition.createCriteria().andCodeEqualTo(userName).andPasswordEqualTo(password);
        List<UserBean> taskArray= userMasterService.getDataInfoAll(condition);
        boolean checkresult=true;
        String message="";
        if(taskArray.size()!=1){
            checkresult=false;
            message="输入的用户名或密码错误";
        }else{
            checkresult=true;
            resultMap.put("name",taskArray.get(0).getName());
            resultMap.put("authority",taskArray.get(0).getPost());
        }
//        resultMap.put("rows", carMasterService.getDataInfo(null, paging(page, rows)));
        return convertReponse(resultMap, checkresult, message);
    }
}
