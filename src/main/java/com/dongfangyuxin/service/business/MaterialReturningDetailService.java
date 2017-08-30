package com.dongfangyuxin.service.business;

import com.dongfangyuxin.dao.common.bean.MaterialReturningDetailBean;
import com.dongfangyuxin.engine.business.MaterialReturningDetailEngine;
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
public class MaterialReturningDetailService {
    @Autowired
    private MaterialReturningDetailEngine materialReturningDetailEngine;

    /**
     * 增加领料概要表信息
     *
     * @param data 查询条件
     * @return 领料概要表信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(MaterialReturningDetailBean data) {
        // 查询原材料一级分类信息
        long key = materialReturningDetailEngine.addData(data);
        return key;
    }
}
