package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.MaterialTypeBeanMapper;
import com.dongfangyuxin.common.dao.bean.MaterialTypeBean;
import com.dongfangyuxin.common.dao.bean.MaterialTypeBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 原材料分类表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class MaterialTypeEngine {

    // 原材料分类信息表DAO
    @Autowired
    private MaterialTypeBeanMapper materialTypeBeanMapper;

    /**
     * 查询数据信息(分页)
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 度量衡信息List
     */
    public List<MaterialTypeBean> getMaterialType(MaterialTypeBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得数据信息
        List<MaterialTypeBean> dataList = materialTypeBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询数据信息
     *
     * @return 度量衡信息List
     */
    public List<MaterialTypeBean> getMaterialType() {
        // 取得数据信息
        List<MaterialTypeBean> dataList = materialTypeBeanMapper.selectByExample(null);
        return dataList;
    }

    /**
     * 查询数据数量信息
     *
     * @param condition 查询条件
     * @return 度量衡信息List ClassificationLevelOne
     */
    public long getMaterialTypeCount(MaterialTypeBeanExample condition) {
        // 取得数据数量信息
        long dataList = materialTypeBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ClassificationLevelOne
     */
    public long addMaterialType(MaterialTypeBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增数据信息
        long key = materialTypeBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ClassificationLevelOne
     */
    public int editMaterialType(MaterialTypeBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改度量衡信息
        int updateCnt = materialTypeBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ClassificationLevelOne
     */
    public int removeMaterialType(MaterialTypeBean data) {
        // 删除数据信息
        int updateCnt = materialTypeBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
