package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.CarInfoBean;
import com.dongfangyuxin.dao.common.bean.CarInfoBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.CarEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 车辆信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class CarMasterService {

    // 车辆表相关操作
    @Autowired
    private CarEngine carEngine;

    /**
     * 取得车辆信息
     *
     * @param condition 查询条件
     * @return 车辆信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CarInfoBean> getDataInfo(CarInfoBeanExample condition, Page page) {
        // 查询车辆信息
        List<CarInfoBean> dataList = carEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得车辆信息数量
     *
     * @param condition 查询条件
     * @return 车辆信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(CarInfoBeanExample condition) {
        // 查询车辆信息
        long dataCnt = carEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加车辆信息
     *
     * @param condition 查询条件
     * @return 车辆信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(CarInfoBean data) {
        // 查询车辆信息
        long key = carEngine.addData(data);
        return key;
    }

    /**
     * 修改车辆信息
     *
     * @param data 修改数据内容
     * @return 车辆信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(CarInfoBean data) {
        // 查询车辆信息
        int key = carEngine.editData(data);
        return key;
    }

    /**
     * 删除车辆信息
     *
     * @param data 修改数据内容
     * @return 车辆信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(CarInfoBean data) {
        // 查询车辆信息
        int key = carEngine.removeData(data);
        return key;
    }
}
