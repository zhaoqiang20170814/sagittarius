package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.UnitBean;
import com.dongfangyuxin.dao.common.bean.UnitBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.UnitEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 度量衡单位维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class UnitMasterService {

    // 度量衡表相关操作
    @Autowired
    private UnitEngine unitEngine;

    /**
     * 取得度量衡信息
     *
     * @param condition 查询条件
     * @return 度量衡信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<UnitBean> getUnitInfo(UnitBeanExample condition, Page page) {
        // 查询度量衡信息
        List<UnitBean> dataList = unitEngine.getUnit(condition, page);
        return dataList;
    }

    /**
     * 取得度量衡信息数量
     *
     * @param condition 查询条件
     * @return 度量衡信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getUnitCountInfo(UnitBeanExample condition) {
        // 查询度量衡信息
        long dataCnt = unitEngine.getUnitCount(condition);
        return dataCnt;
    }

    /**
     * 增加度量衡信息
     *
     * @param condition 查询条件
     * @return 度量衡信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addUnitInfo(UnitBean data) {
        // 查询度量衡信息
        long key = unitEngine.addUnit(data);
        return key;
    }

    /**
     * 修改度量衡信息
     *
     * @param data 修改数据内容
     * @return 度量衡信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editUnitInfo(UnitBean data) {
        // 查询度量衡信息
        int key = unitEngine.editUnit(data);
        return key;
    }

    /**
     * 删除度量衡信息
     *
     * @param data 修改数据内容
     * @return 度量衡信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeUnitInfo(UnitBean data) {
        // 查询度量衡信息
        int key = unitEngine.removeUnit(data);
        return key;
    }
}
