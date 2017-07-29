package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.MaterialBeanMapper;
import com.dongfangyuxin.common.dao.UnitBeanMapper;
import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import com.dongfangyuxin.common.dao.bean.UnitBean;
import com.dongfangyuxin.common.dao.bean.UnitBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 度量衡表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class UnitEngine {

    // 度量衡信息表DAO
    @Autowired
    private UnitBeanMapper unitBeanMapper;

    /**
     * 查询度量衡信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 度量衡信息List
     */
    public List<UnitBean> getUnit(UnitBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得度量衡信息
        List<UnitBean> dataList = unitBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询度量衡数据信息
     *
     * @param condition 查询条件
     * @return 度量衡信息List unit
     */
    public long getUnitCount(UnitBeanExample condition) {
        // 取得度量衡信息
        long dataList = unitBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加度量衡数据信息
     *
     * @param data 数据
     * @return 度量衡信息List unit
     */
    public long addUnit(UnitBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增度量衡信息
        long key = unitBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改度量衡数据信息
     *
     * @param data 数据
     * @return 度量衡信息List unit
     */
    public int editUnit(UnitBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改度量衡信息
        int updateCnt = unitBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除度量衡数据信息
     *
     * @param data 数据
     * @return 度量衡信息List unit
     */
    public int removeUnit(UnitBean data) {
        // 删除度量衡信息
        int updateCnt = unitBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
