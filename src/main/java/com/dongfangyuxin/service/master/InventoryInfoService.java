package com.dongfangyuxin.service.master;

import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.dao.common.bean.InventoryInfoBean;
import com.dongfangyuxin.dao.common.bean.InventoryInfoBeanExample;
import com.dongfangyuxin.dao.common.bean.MaterialBean;
import com.dongfangyuxin.dao.common.bean.MaterialBeanExample;
import com.dongfangyuxin.engine.common.InventoryInfoEngine;
import com.dongfangyuxin.engine.common.MaterialEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 库存信息表维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class InventoryInfoService {

    // 库存信息表相关操作
    @Autowired
    private InventoryInfoEngine inventoryInfoEngine;

    /**
     * 库存信息表
     *
     * @param condition 查询条件
     * @return 库存信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<InventoryInfoBean> getDataInfo(InventoryInfoBeanExample condition, Page page) {
        // 查询原材料信息
        List<InventoryInfoBean> dataList = inventoryInfoEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 库存信息表
     *
     * @param condition 查询条件
     * @return 库存信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<InventoryInfoBean> getDataByCondition(InventoryInfoBeanExample condition) {
        // 查询原材料信息
        List<InventoryInfoBean> dataList = inventoryInfoEngine.getDataByCondition(condition);
        return dataList;
    }

    /**
     * 修改原材料信息
     *
     * @param data 修改数据内容
     * @return 原材料信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(InventoryInfoBean data) {
        // 查询原材料信息
        int key = inventoryInfoEngine.editData(data);
        return key;
    }
}
