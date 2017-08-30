package com.dongfangyuxin.service.business;

import com.dongfangyuxin.dao.common.bean.MaterialReturningSlipBean;
import com.dongfangyuxin.engine.business.MaterialReturningSlipEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 退料维护服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialReturningSlipService {
    @Autowired
    private MaterialReturningSlipEngine materialReturningSlipEngine;

    /**
     * 增加退料概要表信息
     *
     * @param data 查询条件
     * @return 退料概要表信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(MaterialReturningSlipBean data) {
        // 查询原材料一级分类信息
        long key = materialReturningSlipEngine.addData(data);
        return key;
    }
}
