package com.dongfangyuxin.engine.common;

import com.dongfangyuxin.dao.common.MaterialTypeLevelTwoBeanMapper;
import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelTwoBean;
import com.dongfangyuxin.dao.common.bean.MaterialTypeLevelTwoBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 原材料二级分类信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class MaterialTypeLevelTwoEngine {

    // 原材料二级分类信息信息表DAO
    @Autowired
    private MaterialTypeLevelTwoBeanMapper materialTypeLevelTwoBeanMapper;

    /**
     * 查询原材料二级分类信息信息(分页)
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 原材料二级分类信息信息List
     */
    public List<MaterialTypeLevelTwoBean> getData(MaterialTypeLevelTwoBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得原材料二级分类信息信息
        List<MaterialTypeLevelTwoBean> dataList = materialTypeLevelTwoBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询原材料二级分类信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 原材料二级分类信息信息List
     */
    public List<MaterialTypeLevelTwoBean> getData() {
        // 取得原材料二级分类信息信息
        List<MaterialTypeLevelTwoBean> dataList = materialTypeLevelTwoBeanMapper.selectByExample(new MaterialTypeLevelTwoBeanExample());
        return dataList;
    }

    /**
     * 查询原材料二级分类信息数据信息
     *
     * @param condition 查询条件
     * @return 原材料二级分类信息信息List unit
     */
    public long getCount(MaterialTypeLevelTwoBeanExample condition) {
        // 取得原材料二级分类信息信息
        long dataList = materialTypeLevelTwoBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加原材料二级分类信息数据信息
     *
     * @param data 数据
     * @return 原材料二级分类信息信息List unit
     */
    public long addData(MaterialTypeLevelTwoBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增原材料二级分类信息信息
        long key = materialTypeLevelTwoBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改原材料二级分类信息数据信息
     *
     * @param data 数据
     * @return 原材料二级分类信息信息List unit
     */
    public int editData(MaterialTypeLevelTwoBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改原材料二级分类信息信息
        int updateCnt = materialTypeLevelTwoBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除原材料二级分类信息数据信息
     *
     * @param data 数据
     * @return 原材料二级分类信息信息List unit
     */
    public int removeData(MaterialTypeLevelTwoBean data) {
        // 删除原材料二级分类信息信息
        int updateCnt = materialTypeLevelTwoBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
