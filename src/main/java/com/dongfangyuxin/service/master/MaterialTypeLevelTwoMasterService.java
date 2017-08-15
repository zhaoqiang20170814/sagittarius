package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelTwoBean;
import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelTwoBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.MaterialTypeLevelTwoEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 原材料二级分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialTypeLevelTwoMasterService {

    // 原材料二级分类表相关操作
    @Autowired
    private MaterialTypeLevelTwoEngine materialTypeLevelTwoEngine;

    /**
     * 取得原材料二级分类信息(分页)
     *
     * @param condition 查询条件
     * @return 原材料二级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialTypeLevelTwoBean> getDataInfo(MaterialTypeLevelTwoBeanExample condition, Page page) {
        // 查询原材料二级分类信息
        List<MaterialTypeLevelTwoBean> dataList = materialTypeLevelTwoEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得原材料二级分类信息
     *
     * @param condition 查询条件
     * @return 原材料二级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialTypeLevelTwoBean> getDataAll() {
        // 查询原材料二级分类信息
        List<MaterialTypeLevelTwoBean> dataList = materialTypeLevelTwoEngine.getData();
        return dataList;
    }

    /**
     * 取得原材料二级分类信息数量
     *
     * @param condition 查询条件
     * @return 原材料二级分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(MaterialTypeLevelTwoBeanExample condition) {
        // 查询原材料二级分类信息
        long dataCnt = materialTypeLevelTwoEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加原材料二级分类信息
     *
     * @param condition 查询条件
     * @return 原材料二级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(MaterialTypeLevelTwoBean data) {
        // 查询原材料二级分类信息
        long key = materialTypeLevelTwoEngine.addData(data);
        return key;
    }

    /**
     * 修改原材料二级分类信息
     *
     * @param data 修改数据内容
     * @return 原材料二级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(MaterialTypeLevelTwoBean data) {
        // 查询原材料二级分类信息
        int key = materialTypeLevelTwoEngine.editData(data);
        return key;
    }

    /**
     * 删除原材料二级分类信息
     *
     * @param data 修改数据内容
     * @return 原材料二级分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(MaterialTypeLevelTwoBean data) {
        // 查询原材料二级分类信息
        int key = materialTypeLevelTwoEngine.removeData(data);
        return key;
    }
}
