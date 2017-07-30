package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.master.ClassificationLevelTwoEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 成本二级分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class ClassificationLevelTwoMasterService {

    // 成本二级分类信息表相关操作
    @Autowired
    private ClassificationLevelTwoEngine classificationLevelTwoEngine;

    /**
     * 取得成本二级分类信息
     *
     * @param condition 查询条件
     * @return 成本二级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassificationLevelTwoBean> getClassificationLevelTwoInfo(ClassificationLevelTwoBeanExample condition, Page page) {
        // 查询成本二级分类信息
        List<ClassificationLevelTwoBean> dataList = classificationLevelTwoEngine.getClassificationLevelTwo(condition, page);
        return dataList;
    }

    /**
     * 取得成本二级分类信息数量
     *
     * @param condition 查询条件
     * @return 成本二级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getClassificationLevelTwoCountInfo(ClassificationLevelTwoBeanExample condition) {
        // 查询成本二级分类信息
        long dataCnt = classificationLevelTwoEngine.getClassificationLevelTwoCount(condition);
        return dataCnt;
    }

    /**
     * 增加成本二级分类信息
     *
     * @param condition 查询条件
     * @return 成本二级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addClassificationLevelTwoInfo(ClassificationLevelTwoBean data) {
        // 查询成本二级分类信息
        long key = classificationLevelTwoEngine.addClassificationLevelTwo(data);
        return key;
    }

    /**
     * 修改成本二级分类信息
     *
     * @param data 修改数据内容
     * @return 成本二级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editClassificationLevelTwoInfo(ClassificationLevelTwoBean data) {
        // 查询成本二级分类信息
        int key = classificationLevelTwoEngine.editClassificationLevelTwo(data);
        return key;
    }

    /**
     * 删除成本二级分类信息
     *
     * @param data 修改数据内容
     * @return 成本二级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeClassificationLevelTwoInfo(ClassificationLevelTwoBean data) {
        // 查询成本二级分类信息
        int key = classificationLevelTwoEngine.removeClassificationLevelTwo(data);
        return key;
    }
}
