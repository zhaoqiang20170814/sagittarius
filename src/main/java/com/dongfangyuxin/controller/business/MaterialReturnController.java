package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.dao.common.bean.*;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.common.vo.*;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.service.business.MaterialReturningDetailService;
import com.dongfangyuxin.service.business.MaterialReturningSlipService;
import com.dongfangyuxin.service.master.InventoryInfoService;
import com.dongfangyuxin.service.master.MaterialMasterService;
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
@RequestMapping(value = "/materialReturn")
public class MaterialReturnController extends BaseAction {

    private Logger logger = LogManager.getLogger(MaterialReturnController.class);

    @Autowired
    private MaterialMasterService materialMasterService;
    @Autowired
    private ProjectInfoMasterService projectInfoMasterService;
    @Autowired
    private MaterialReturningSlipService materialReturningSlipService;
    @Autowired
    private MaterialReturningDetailService materialReturningDetailService;
    @Autowired
    private InventoryInfoService inventoryInfoService;

    /**
     * 测试hello
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String materialReturn(Model model) {
        List<MaterialBean> thirdArray= materialMasterService.getMaterialInfo(null);
        ProjectInfoBeanExample condition = new ProjectInfoBeanExample();
        condition.createCriteria().andStatusNotEqualTo("001");
        List<ProjectInfoBean> taskArray= projectInfoMasterService.getAllInfo(condition);
        model.addAttribute("thirdArray", thirdArray);
        model.addAttribute("taskArray", taskArray);
        return "materialReturn";
    }

    /**
     * 退料信息新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String taskCode,
                                   @RequestParam String dataList) {

        List<MaterialRetrunVo> detailList = Utils.deserializeList(dataList, MaterialRetrunVo.class);
        int count=0;
        String orderCode=Utils.getOrderIdByUuid();
        MaterialReturningDetailBean materialReturningDetailBean;
        for (MaterialRetrunVo vo:detailList) {
            count++;
            materialReturningDetailBean = new MaterialReturningDetailBean();
            materialReturningDetailBean.setCode(orderCode);
            //原料编号
            materialReturningDetailBean.setTaskCode(vo.getMaterialCode());
            materialReturningDetailBean.setQuantity(vo.getQuantity());
            long key = materialReturningDetailService.addDataInfo(materialReturningDetailBean);

            //更新库存
            if(vo.getReason().equals("2")){
                InventoryInfoBeanExample condition = new InventoryInfoBeanExample();
                condition.createCriteria().andMaterialCodeEqualTo(vo.getMaterialCode());
                List<InventoryInfoBean> inventoryList=inventoryInfoService.getDataByCondition(condition);
                if(null!=inventoryList){
                    inventoryList.get(0).setQuantity(inventoryList.get(0).getQuantity()+vo.getQuantity());
                    inventoryInfoService.editDataInfo(inventoryList.get(0));
                }
            }
        }

        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialReturningSlipBean materialReturningSlipBean = new MaterialReturningSlipBean();

        materialReturningSlipBean.setCode(orderCode);
        materialReturningSlipBean.setCount(count);
        materialReturningSlipBean.setTaskCode(taskCode);

        long key = materialReturningSlipService.addDataInfo(materialReturningSlipBean);
        return convertReponse(resultMap, true, null);
    }
}
