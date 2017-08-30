package com.dongfangyuxin.service.business;

import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBean;
import com.dongfangyuxin.dao.common.bean.CarUsedHistoryBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.business.CarUsedHistoryEngine;
import com.dongfangyuxin.engine.common.ProjectInfoEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 项目信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class CarUsedHistoryService {

    // 项目表相关操作
    @Autowired
    private CarUsedHistoryEngine carUsedHistoryEngine;

    /**
     * 取得项目信息
     *
     * @param condition 查询条件
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CarUsedHistoryBean> getDataInfo(CarUsedHistoryBeanExample condition, Page page) {
        // 查询项目信息
        List<CarUsedHistoryBean> dataList = carUsedHistoryEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得原材料一级分类信息
     *
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CarUsedHistoryBean> getAllInfo() {
        // 查询报销分类信息
        List<CarUsedHistoryBean> dataList = carUsedHistoryEngine.getAllData();
        return dataList;
    }

    /**
     * 增加项目信息
     *
     * @param data 查询条件
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(CarUsedHistoryBean data) {
        // 查询项目信息
        long key = carUsedHistoryEngine.addData(data);
        return key;
    }

    /**
     * 修改项目信息
     *
     * @param data 修改数据内容
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(CarUsedHistoryBean data) {
        // 查询项目信息
        int key = carUsedHistoryEngine.editData(data);
        return key;
    }

    /**
     * 删除项目信息
     *
     * @param data 修改数据内容
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(CarUsedHistoryBean data) {
        // 查询项目信息
        int key = carUsedHistoryEngine.removeData(data);
        return key;
    }
}
