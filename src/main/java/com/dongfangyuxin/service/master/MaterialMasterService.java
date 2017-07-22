package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import com.dongfangyuxin.engine.master.MaterialEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 原材料主档维护服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialMasterService {
    @Autowired
    private MaterialEngine materialEngine;

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialBean> getMaterialInfo(MaterialBeanExample condition) {
        List<MaterialBean> dataList = materialEngine.getMaterial(condition);
        return dataList;
    }
}
