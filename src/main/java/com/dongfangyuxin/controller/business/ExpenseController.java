package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.dao.common.bean.*;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.common.vo.*;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.business.ExpenseInfoDetailService;
import com.dongfangyuxin.service.business.ExpenseInfoService;
import com.dongfangyuxin.service.master.ExpenseTypeMasterService;
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
@RequestMapping(value = "/expense")
public class ExpenseController extends BaseAction {

    private Logger logger = LogManager.getLogger(ExpenseController.class);

    @Autowired
    private ExpenseTypeMasterService expenseTypeMasterService;

    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;

    @Autowired
    private ExpenseInfoService expenseInfoService;

    @Autowired
    private ExpenseInfoDetailService expenseInfoDetailService;

    /**
     * 测试hello
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String expense(Model model) {
        logger.info("进入请求了");
        List<ExpenseTypeInfoBean> volist= expenseTypeMasterService.getExpenseTypeAllInfo();

        ProjectInfoBeanExample condition = new ProjectInfoBeanExample();
        condition.createCriteria().andStatusEqualTo("002");
        List<ProjectInfoBean> taskArray= projectInfoMasterService.getAllInfo(condition);

        model.addAttribute("taskArray", taskArray);
        model.addAttribute("expenseArray", volist);
        return "expense";
    }

    /**
     * 报销信息新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String taskCode,
                                   @RequestParam String dataList) {

        List<ExpenseVo> detailList = Utils.deserializeList(dataList, ExpenseVo.class);
        BigDecimal totalAmount=new BigDecimal(0);
        String orderCode=Utils.getOrderIdByUuid();
        ExpenseInfoDetailBean expenseInfoDetailBean;
        for (ExpenseVo vo:detailList) {
            if(vo.getAmount().compareTo(new BigDecimal(0))>0){
                totalAmount=totalAmount.add(vo.getAmount());
            }
            expenseInfoDetailBean = new ExpenseInfoDetailBean();
            expenseInfoDetailBean.setCode(orderCode);
            expenseInfoDetailBean.setType(vo.getExpenseType());
            expenseInfoDetailBean.setAmount(vo.getAmount());
            long key = expenseInfoDetailService.addDataInfo(expenseInfoDetailBean);
        }

        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        ExpenseInfoBean expenseInfoBean = new ExpenseInfoBean();

        expenseInfoBean.setCode(orderCode);
        expenseInfoBean.setAmount(new BigDecimal(0));
        expenseInfoBean.setTaskCode(taskCode);

        long key = expenseInfoService.addDataInfo(expenseInfoBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }
}
