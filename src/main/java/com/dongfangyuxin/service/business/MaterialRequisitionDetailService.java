package com.dongfangyuxin.service.business;

import com.dongfangyuxin.dao.common.bean.MaterialRequisitionDetailBean;
import com.dongfangyuxin.engine.business.MaterialRequisitionDetailEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 原材料主档维护服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialRequisitionDetailService {
    @Autowired
    private MaterialRequisitionDetailEngine materialRequisitionDetailEngine;

    /**
     * 增加领料概要表信息
     *
     * @param data 查询条件
     * @return 领料概要表信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(MaterialRequisitionDetailBean data) {
        // 查询原材料一级分类信息
        long key = materialRequisitionDetailEngine.addData(data);
        return key;
    }
}
