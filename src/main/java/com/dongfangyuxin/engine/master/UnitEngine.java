package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.MaterialBeanMapper;
import com.dongfangyuxin.common.dao.UnitBeanMapper;
import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import com.dongfangyuxin.common.dao.bean.UnitBean;
import com.dongfangyuxin.common.dao.bean.UnitBeanExample;
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
     * @return 度量衡信息List
     */
    public List<UnitBean> getUnit(UnitBeanExample condition) {
        // 取得度量衡信息
        List<UnitBean> dataList = unitBeanMapper.selectByExample(condition);
        return dataList;
    }
}
