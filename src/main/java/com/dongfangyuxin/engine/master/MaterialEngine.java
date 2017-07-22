package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.MaterialBeanMapper;
import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 原材料表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class MaterialEngine {
    @Autowired
    private MaterialBeanMapper materialBeanMapper;

    /**
     * 查询原材料信息
     *
     * @param condition 查询条件
     * @return 原材料信息List
     */
    public List<MaterialBean> getMaterial(MaterialBeanExample condition) {
        List<MaterialBean> dataList = materialBeanMapper.selectByExample(condition);
        return dataList;
    }
}
