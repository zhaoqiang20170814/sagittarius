package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelOneBean;
import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelOneBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.MaterialTypeLevelOneEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 原材料一级分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialTypeLevelOneMasterService {

    // 原材料一级分类表相关操作
    @Autowired
    private MaterialTypeLevelOneEngine materialTypeLevelOneEngine;

    /**
     * 取得原材料一级分类信息(分页)
     *
     * @param condition 查询条件
     * @return 原材料一级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialTypeLevelOneBean> getDataInfo(MaterialTypeLevelOneBeanExample condition, Page page) {
        // 查询原材料一级分类信息
        List<MaterialTypeLevelOneBean> dataList = materialTypeLevelOneEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得原材料一级分类信息
     *
     * @param condition 查询条件
     * @return 原材料一级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialTypeLevelOneBean> getDataAll() {
        // 查询原材料一级分类信息
        List<MaterialTypeLevelOneBean> dataList = materialTypeLevelOneEngine.getData();
        return dataList;
    }

    /**
     * 取得原材料一级分类信息数量
     *
     * @param condition 查询条件
     * @return 原材料一级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(MaterialTypeLevelOneBeanExample condition) {
        // 查询原材料一级分类信息
        long dataCnt = materialTypeLevelOneEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加原材料一级分类信息
     *
     * @param condition 查询条件
     * @return 原材料一级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(MaterialTypeLevelOneBean data) {
        // 查询原材料一级分类信息
        long key = materialTypeLevelOneEngine.addData(data);
        return key;
    }

    /**
     * 修改原材料一级分类信息
     *
     * @param data 修改数据内容
     * @return 原材料一级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(MaterialTypeLevelOneBean data) {
        // 查询原材料一级分类信息
        int key = materialTypeLevelOneEngine.editData(data);
        return key;
    }

    /**
     * 删除原材料一级分类信息
     *
     * @param data 修改数据内容
     * @return 原材料一级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(MaterialTypeLevelOneBean data) {
        // 查询原材料一级分类信息
        int key = materialTypeLevelOneEngine.removeData(data);
        return key;
    }
}
