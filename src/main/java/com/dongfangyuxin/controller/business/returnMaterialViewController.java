package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.common.vo.ProjectInfo;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.sample.Sample;
import com.dongfangyuxin.service.business.MaterialRequisitionDetailService;
import com.dongfangyuxin.service.business.MaterialRequisitionService;
import com.dongfangyuxin.service.business.MaterialReturningDetailService;
import com.dongfangyuxin.service.business.MaterialReturningSlipService;
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
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/returnMaterialView")
public class returnMaterialViewController extends BaseAction {

    private Logger logger = LogManager.getLogger(returnMaterialViewController.class);
    @Autowired
    private MaterialReturningSlipService materialReturningSlipService;
    @Autowired
    private Sample sampleMapper;
    @Autowired
    private MaterialReturningDetailService materialReturningDetailService;

    /**
     * 开工确认
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String returnMaterialView(Model model) throws ParseException {
        logger.info("进入请求了");
        List<ProjectInfo>  summaryArray = sampleMapper.getReturn("");
        model.addAttribute("summaryArray", summaryArray);
        return "returnMaterialView";
    }

    /**
     * 报销信息新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "getDetail", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> getDetail(HttpServletRequest request, HttpServletResponse response, @RequestParam String summaryCode) {

        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        Map<String, Object> materialMap = new HashMap<>();

        materialMap.put("code",summaryCode);
        List<String>  summaryArray = sampleMapper.getReturnMaterialName(materialMap);
        resultMap.put("detailArray",summaryArray);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
