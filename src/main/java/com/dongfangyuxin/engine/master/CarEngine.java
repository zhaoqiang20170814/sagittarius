package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.CarInfoBeanMapper;
import com.dongfangyuxin.common.dao.bean.CarInfoBean;
import com.dongfangyuxin.common.dao.bean.CarInfoBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 车辆信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class CarEngine {

    // 车辆信息信息表DAO
    @Autowired
    private CarInfoBeanMapper carInfoBeanMapper;

    /**
     * 查询车辆信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 车辆信息信息List
     */
    public List<CarInfoBean> getData(CarInfoBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得车辆信息信息
        List<CarInfoBean> dataList = carInfoBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询车辆信息数据信息
     *
     * @param condition 查询条件
     * @return 车辆信息信息List unit
     */
    public long getCount(CarInfoBeanExample condition) {
        // 取得车辆信息信息
        long dataList = carInfoBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加车辆信息数据信息
     *
     * @param data 数据
     * @return 车辆信息信息List unit
     */
    public long addData(CarInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增车辆信息信息
        long key = carInfoBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改车辆信息数据信息
     *
     * @param data 数据
     * @return 车辆信息信息List unit
     */
    public int editData(CarInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改车辆信息信息
        int updateCnt = carInfoBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除车辆信息数据信息
     *
     * @param data 数据
     * @return 车辆信息信息List unit
     */
    public int removeData(CarInfoBean data) {
        // 删除车辆信息信息
        int updateCnt = carInfoBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
