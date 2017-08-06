package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.master.CostItemEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 成本项目信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class CostItemMasterService {

    // 成本项目信息表相关操作
    @Autowired
    private CostItemEngine costItemEngine;

    /**
     * 取得成本项目信息
     *
     * @param condition 查询条件
     * @return 成本项目信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassificationLevelTwoBean> getData(ClassificationLevelTwoBeanExample condition, Page page) {
        // 查询成本项目信息
        List<ClassificationLevelTwoBean> dataList = costItemEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得成本项目信息数量
     *
     * @param condition 查询条件
     * @return 成本项目信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getDataCount(ClassificationLevelTwoBeanExample condition) {
        // 查询成本项目信息
        long dataCnt = costItemEngine.getDataCount(condition);
        return dataCnt;
    }

    /**
     * 增加成本项目信息
     *
     * @param condition 查询条件
     * @return 成本项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addData(ClassificationLevelTwoBean data) {
        // 查询成本项目信息
        long key = costItemEngine.addData(data);
        return key;
    }

    /**
     * 修改成本项目信息
     *
     * @param data 修改数据内容
     * @return 成本项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editData(ClassificationLevelTwoBean data) {
        // 查询成本项目信息
        int key = costItemEngine.editData(data);
        return key;
    }

    /**
     * 删除成本项目信息
     *
     * @param data 修改数据内容
     * @return 成本项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeData(ClassificationLevelTwoBean data) {
        // 查询成本项目信息
        int key = costItemEngine.removeData(data);
        return key;
    }
}
