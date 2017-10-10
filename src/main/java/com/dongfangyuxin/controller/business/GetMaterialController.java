package com.dongfangyuxin.controller.business;

import com.dongfangyuxin.dao.common.CarInfoBeanMapper;
import com.dongfangyuxin.dao.common.bean.*;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.common.vo.ThirdLevelVo;
import com.dongfangyuxin.controller.common.BaseAction;
import com.dongfangyuxin.dao.sample.Sample;
import com.dongfangyuxin.service.business.MaterialRequisitionDetailService;
import com.dongfangyuxin.service.business.MaterialRequisitionService;
import com.dongfangyuxin.service.master.InventoryInfoService;
import com.dongfangyuxin.service.master.MaterialTypeLevelOneMasterService;
import com.dongfangyuxin.service.master.MaterialTypeLevelTwoMasterService;
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
import java.util.*;

/**
 * Created by dongl on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/materialNavigation")
public class GetMaterialController extends BaseAction {

    private Logger logger = LogManager.getLogger(GetMaterialController.class);
    @Autowired
    private MaterialRequisitionService materialRequisitionService;
    @Autowired
    private MaterialRequisitionDetailService materialRequisitionDetailService;
    @Autowired
    private MaterialTypeLevelOneMasterService materialTypeLevelOneMasterService;
    @Autowired
    private MaterialTypeLevelTwoMasterService materialTypeLevelTwoMasterService;
    @Autowired
    private InventoryInfoService inventoryInfoService;

    // 车辆信息信息表DAO
    @Autowired
    public Sample sampleMapper;

    /**
     * 领料概要表新增
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(HttpServletRequest request, HttpServletResponse response, @RequestParam String taskCode,
                                   @RequestParam String dataList) {

        List<ThirdLevelVo> detailList = Utils.deserializeList(dataList, ThirdLevelVo.class);
        int count=0;
        String orderCode=Utils.getOrderIdByUuid();
        MaterialRequisitionDetailBean materialRequisitionDetailBean;
        for (ThirdLevelVo vo:detailList) {
            if(vo.getSelectQuantity()>0){
                count++;
                materialRequisitionDetailBean = new MaterialRequisitionDetailBean();
                materialRequisitionDetailBean.setCode(orderCode);
                materialRequisitionDetailBean.setTaskCode(vo.getLevelId());
                materialRequisitionDetailBean.setQuantity(vo.getSelectQuantity());
                materialRequisitionDetailBean.setAmount(BigDecimal.valueOf(vo.getSelectQuantity()*vo.getPrice()));
                long key = materialRequisitionDetailService.addDataInfo(materialRequisitionDetailBean);
                InventoryInfoBeanExample condition = new InventoryInfoBeanExample();
                condition.createCriteria().andMaterialCodeEqualTo(vo.getLevelId());
                List<InventoryInfoBean> inventoryList=inventoryInfoService.getDataByCondition(condition);
                if(null!=inventoryList){
                    inventoryList.get(0).setQuantity(inventoryList.get(0).getQuantity()-vo.getSelectQuantity());
                    inventoryInfoService.editDataInfo(inventoryList.get(0));
                }
            }

        }

        // 请求结果
        Map<String, Object> resultMap = new HashMap<>();
        // 数据设定
        MaterialRequisitionBean materialRequisitionBean = new MaterialRequisitionBean();

        materialRequisitionBean.setCode(orderCode);
        materialRequisitionBean.setCount(count);
        materialRequisitionBean.setTaskCode(taskCode);
        materialRequisitionBean.setOperatingTime(new Date());

        long key = materialRequisitionService.addDataInfo(materialRequisitionBean);
        // 返回车辆信息
        return convertReponse(resultMap, true, null);
    }

    /**
     * 测试hello
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String materialNavigation(Model model) {
        logger.info("进入请求了");

        //设置一级菜单内容
        List<MaterialTypeLevelOneBean>  FirstLevelList = materialTypeLevelOneMasterService.getDataAll();
        model.addAttribute("firstArray", FirstLevelList);

        //设置二级菜单内容
        List<MaterialTypeLevelTwoBean>  secondLevelList = materialTypeLevelTwoMasterService.getDataAll();
        model.addAttribute("secondArray", secondLevelList);

        List<ThirdLevelVo>  result = sampleMapper.getUserName("");

        model.addAttribute("thirdArray", result);

        return "materialNavigation";
    }
}
