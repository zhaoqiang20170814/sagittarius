package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.ClassificationLevelOneBean;
import com.dongfangyuxin.dao.common.bean.ClassificationLevelOneBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.CostTypeEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 成本分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class CostTypeMasterService {

    // 成本分类信息表相关操作
    @Autowired
    private CostTypeEngine costTypeEngine;

    /**
     * 取得成本分类信息（分页）
     *
     * @param condition 查询条件
     * @return 成本分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassificationLevelOneBean> getData(ClassificationLevelOneBeanExample condition, Page page) {
        // 查询成本分类信息
        List<ClassificationLevelOneBean> dataList = costTypeEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得成本分类信息
     *
     * @param condition 查询条件
     * @return 成本分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClassificationLevelOneBean> getDataAll() {
        // 查询成本分类信息
        List<ClassificationLevelOneBean> dataList = costTypeEngine.getData();
        return dataList;
    }

    /**
     * 取得成本分类信息数量
     *
     * @param condition 查询条件
     * @return 成本分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getDataCount(ClassificationLevelOneBeanExample condition) {
        // 查询成本分类信息
        long dataCnt = costTypeEngine.getDataCount(condition);
        return dataCnt;
    }

    /**
     * 增加成本分类信息
     *
     * @param condition 查询条件
     * @return 成本分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addData(ClassificationLevelOneBean data) {
        // 查询成本分类信息
        long key = costTypeEngine.addData(data);
        return key;
    }

    /**
     * 修改成本分类信息
     *
     * @param data 修改数据内容
     * @return 成本分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editData(ClassificationLevelOneBean data) {
        // 查询成本分类信息
        int key = costTypeEngine.editData(data);
        return key;
    }

    /**
     * 删除成本分类信息
     *
     * @param data 修改数据内容
     * @return 成本分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeData(ClassificationLevelOneBean data) {
        // 查询成本分类信息
        int key = costTypeEngine.removeData(data);
        return key;
    }
}
