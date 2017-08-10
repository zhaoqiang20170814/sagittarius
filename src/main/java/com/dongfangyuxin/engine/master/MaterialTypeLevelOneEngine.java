package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.MaterialTypeLevelOneBeanMapper;
import com.dongfangyuxin.common.dao.bean.MaterialTypeLevelOneBean;
import com.dongfangyuxin.common.dao.bean.MaterialTypeLevelOneBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 原材料一级分类信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class MaterialTypeLevelOneEngine {

    // 原材料一级分类信息信息表DAO
    @Autowired
    private MaterialTypeLevelOneBeanMapper materialTypeLevelOneBeanMapper;

    /**
     * 查询原材料一级分类信息信息(分页)
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 原材料一级分类信息信息List
     */
    public List<MaterialTypeLevelOneBean> getData(MaterialTypeLevelOneBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得原材料一级分类信息信息
        List<MaterialTypeLevelOneBean> dataList = materialTypeLevelOneBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询原材料一级分类信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 原材料一级分类信息信息List
     */
    public List<MaterialTypeLevelOneBean> getData() {
        // 取得原材料一级分类信息信息
        List<MaterialTypeLevelOneBean> dataList = materialTypeLevelOneBeanMapper.selectByExample(new MaterialTypeLevelOneBeanExample());
        return dataList;
    }

    /**
     * 查询原材料一级分类信息数据信息
     *
     * @param condition 查询条件
     * @return 原材料一级分类信息信息List unit
     */
    public long getCount(MaterialTypeLevelOneBeanExample condition) {
        // 取得原材料一级分类信息信息
        long dataList = materialTypeLevelOneBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加原材料一级分类信息数据信息
     *
     * @param data 数据
     * @return 原材料一级分类信息信息List unit
     */
    public long addData(MaterialTypeLevelOneBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增原材料一级分类信息信息
        long key = materialTypeLevelOneBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改原材料一级分类信息数据信息
     *
     * @param data 数据
     * @return 原材料一级分类信息信息List unit
     */
    public int editData(MaterialTypeLevelOneBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改原材料一级分类信息信息
        int updateCnt = materialTypeLevelOneBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除原材料一级分类信息数据信息
     *
     * @param data 数据
     * @return 原材料一级分类信息信息List unit
     */
    public int removeData(MaterialTypeLevelOneBean data) {
        // 删除原材料一级分类信息信息
        int updateCnt = materialTypeLevelOneBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
