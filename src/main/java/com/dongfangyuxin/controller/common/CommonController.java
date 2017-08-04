package com.dongfangyuxin.controller.common;

import com.alibaba.fastjson.JSON;
import com.dongfangyuxin.common.dao.bean.DataDicBean;
import com.dongfangyuxin.common.util.DataDicCache;
import com.dongfangyuxin.service.master.ClassificationLevelOneMasterService;
import com.dongfangyuxin.service.master.UserMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 共同用Controller
 */
@Controller
@RequestMapping(value = "/commonController")
public class CommonController {

    @Autowired
    private ClassificationLevelOneMasterService classificationLevelOneMasterService;
    @Autowired
    private UserMasterService userMasterService;

    /**
     * 成本一级分类ComboBox
     *
     * @return
     */
    @RequestMapping(value = "combobox/classificationLevelOne", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String loadClassificationLevelOne(HttpServletRequest request, HttpServletResponse response) {
        String result = JSON.toJSONString(classificationLevelOneMasterService.getClassificationLevelOneAllInfo());
        return result;
    }

    /**
     * 员工信息ComboBox
     *
     * @return
     */
    @RequestMapping(value = "combobox/userInfo", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String loadUserInfo(HttpServletRequest request, HttpServletResponse response) {
        String result = JSON.toJSONString(userMasterService.getDataInfoAll());
        return result;
    }

    /**
     * 字典项（全部）
     *
     * @return
     */
    @RequestMapping(value = "loadDataDicAll", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, List<DataDicBean>> loadDataDicAll(HttpServletRequest request, HttpServletResponse response) {
        return DataDicCache.dictCodeMapAll;
    }

    /**
     * 字典项（有效）
     *
     * @return
     */
    @RequestMapping(value = "loadDataDicValid", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, List<DataDicBean>> loadDataDicValid(HttpServletRequest request, HttpServletResponse response) {
        return DataDicCache.dictCodeMapValid;
    }
}
