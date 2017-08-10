package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.master.MaterialEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 原材料信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialMasterService {

    // 原材料表相关操作
    @Autowired
    private MaterialEngine materialEngine;

    /**
     * 取得原材料信息
     *
     * @param condition 查询条件
     * @return 原材料信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialBean> getDataInfo(MaterialBeanExample condition, Page page) {
        // 查询原材料信息
        List<MaterialBean> dataList = materialEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得原材料信息数量
     *
     * @param condition 查询条件
     * @return 原材料信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(MaterialBeanExample condition) {
        // 查询原材料信息
        long dataCnt = materialEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加原材料信息
     *
     * @param condition 查询条件
     * @return 原材料信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(MaterialBean data) {
        // 查询原材料信息
        long key = materialEngine.addData(data);
        return key;
    }

    /**
     * 修改原材料信息
     *
     * @param data 修改数据内容
     * @return 原材料信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(MaterialBean data) {
        // 查询原材料信息
        int key = materialEngine.editData(data);
        return key;
    }

    /**
     * 删除原材料信息
     *
     * @param data 修改数据内容
     * @return 原材料信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(MaterialBean data) {
        // 查询原材料信息
        int key = materialEngine.removeData(data);
        return key;
    }
}
