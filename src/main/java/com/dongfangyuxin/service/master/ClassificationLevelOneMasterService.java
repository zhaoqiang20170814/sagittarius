package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.ClassificationLevelOneBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelOneBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.master.ClassificationLevelOneEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 成本一级分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class ClassificationLevelOneMasterService {

    // 成本一级分类信息表相关操作
    @Autowired
    private ClassificationLevelOneEngine classificationLevelOneEngine;

    /**
     * 取得成本一级分类信息（分页）
     *
     * @param condition 查询条件
     * @return 成本一级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassificationLevelOneBean> getClassificationLevelOneInfo(ClassificationLevelOneBeanExample condition, Page page) {
        // 查询成本一级分类信息
        List<ClassificationLevelOneBean> dataList = classificationLevelOneEngine.getClassificationLevelOne(condition, page);
        return dataList;
    }

    /**
     * 取得成本一级分类信息
     *
     * @param condition 查询条件
     * @return 成本一级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassificationLevelOneBean> getClassificationLevelOneAllInfo() {
        // 查询成本一级分类信息
        List<ClassificationLevelOneBean> dataList = classificationLevelOneEngine.getClassificationLevelOne();
        return dataList;
    }

    /**
     * 取得成本一级分类信息数量
     *
     * @param condition 查询条件
     * @return 成本一级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getClassificationLevelOneCountInfo(ClassificationLevelOneBeanExample condition) {
        // 查询成本一级分类信息
        long dataCnt = classificationLevelOneEngine.getClassificationLevelOneCount(condition);
        return dataCnt;
    }

    /**
     * 增加成本一级分类信息
     *
     * @param condition 查询条件
     * @return 成本一级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addClassificationLevelOneInfo(ClassificationLevelOneBean data) {
        // 查询成本一级分类信息
        long key = classificationLevelOneEngine.addClassificationLevelOne(data);
        return key;
    }

    /**
     * 修改成本一级分类信息
     *
     * @param data 修改数据内容
     * @return 成本一级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editClassificationLevelOneInfo(ClassificationLevelOneBean data) {
        // 查询成本一级分类信息
        int key = classificationLevelOneEngine.editClassificationLevelOne(data);
        return key;
    }

    /**
     * 删除成本一级分类信息
     *
     * @param data 修改数据内容
     * @return 成本一级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeClassificationLevelOneInfo(ClassificationLevelOneBean data) {
        // 查询成本一级分类信息
        int key = classificationLevelOneEngine.removeClassificationLevelOne(data);
        return key;
    }
}
