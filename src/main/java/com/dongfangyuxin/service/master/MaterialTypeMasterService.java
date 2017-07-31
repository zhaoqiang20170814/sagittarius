package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.*;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.master.MaterialTypeEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 原材料分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class MaterialTypeMasterService {

    // 原材料分类信息表相关操作
    @Autowired
    private MaterialTypeEngine materialTypeEngine;

    /**
     * 取得原材料分类信息（分页）
     *
     * @param condition 查询条件
     * @return 原材料分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialTypeBean> getMaterialTypeInfo(MaterialTypeBeanExample condition, Page page) {
        // 查询原材料分类信息
        List<MaterialTypeBean> dataList = materialTypeEngine.getMaterialType(condition, page);
        return dataList;
    }

    /**
     * 取得原材料分类信息
     *
     * @param condition 查询条件
     * @return 原材料分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MaterialTypeBean> getMaterialTypeAllInfo() {
        // 查询原材料分类信息
        List<MaterialTypeBean> dataList = materialTypeEngine.getMaterialType();
        return dataList;
    }

    /**
     * 取得原材料分类信息数量
     *
     * @param condition 查询条件
     * @return 原材料分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getMaterialTypeCountInfo(MaterialTypeBeanExample condition) {
        // 查询原材料分类信息
        long dataCnt = materialTypeEngine.getMaterialTypeCount(condition);
        return dataCnt;
    }

    /**
     * 增加原材料分类信息
     *
     * @param condition 查询条件
     * @return 原材料分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addMaterialTypeInfo(MaterialTypeBean data) {
        // 查询原材料分类信息
        long key = materialTypeEngine.addMaterialType(data);
        return key;
    }

    /**
     * 修改原材料分类信息
     *
     * @param data 修改数据内容
     * @return 原材料分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editMaterialTypeInfo(MaterialTypeBean data) {
        // 查询原材料分类信息
        int key = materialTypeEngine.editMaterialType(data);
        return key;
    }

    /**
     * 删除原材料分类信息
     *
     * @param data 修改数据内容
     * @return 原材料分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeMaterialTypeInfo(MaterialTypeBean data) {
        // 查询原材料分类信息
        int key = materialTypeEngine.removeMaterialType(data);
        return key;
    }
}
