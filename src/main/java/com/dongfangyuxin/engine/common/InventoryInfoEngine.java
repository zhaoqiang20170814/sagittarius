package com.dongfangyuxin.engine.common;

import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.dao.common.InventoryInfoBeanMapper;
import com.dongfangyuxin.dao.common.MaterialBeanMapper;
import com.dongfangyuxin.dao.common.bean.InventoryInfoBean;
import com.dongfangyuxin.dao.common.bean.InventoryInfoBeanExample;
import com.dongfangyuxin.dao.common.bean.MaterialBean;
import com.dongfangyuxin.dao.common.bean.MaterialBeanExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 库存信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class InventoryInfoEngine {

    // 库存信息DAO
    @Autowired
    private InventoryInfoBeanMapper inventoryInfoBeanMapper;

    /**
     * 查询库存信息表
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 库存信息表List
     */
    public List<InventoryInfoBean> getData(InventoryInfoBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得原材料信息信息
        List<InventoryInfoBean> dataList = inventoryInfoBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询库存信息表
     *
     * @param condition 查询条件
     * @return 库存信息表List
     */
    public List<InventoryInfoBean> getDataByCondition(InventoryInfoBeanExample condition) {
        // 取得原材料信息信息
        List<InventoryInfoBean> dataList = inventoryInfoBeanMapper.selectByExample(condition);
        return dataList;
    }

    /**
     * 修改原材料信息数据信息
     *
     * @param data 数据
     * @return 原材料信息信息List unit
     */
    public int editData(InventoryInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改原材料信息信息
        int updateCnt = inventoryInfoBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

}
