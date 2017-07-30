package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.ClassificationLevelTwoBeanMapper;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelTwoBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 成本二级分类表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class ClassificationLevelTwoEngine {

    // 成本二级分类信息表DAO
    @Autowired
    private ClassificationLevelTwoBeanMapper classificationLevelTwoBeanMapper;

    /**
     * 查询数据信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 度量衡信息List
     */
    public List<ClassificationLevelTwoBean> getClassificationLevelTwo(ClassificationLevelTwoBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得数据信息
        List<ClassificationLevelTwoBean> dataList = classificationLevelTwoBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询数据数量信息
     *
     * @param condition 查询条件
     * @return 度量衡信息List ClassificationLevelTwo
     */
    public long getClassificationLevelTwoCount(ClassificationLevelTwoBeanExample condition) {
        // 取得数据数量信息
        long dataList = classificationLevelTwoBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ClassificationLevelTwo
     */
    public long addClassificationLevelTwo(ClassificationLevelTwoBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增数据信息
        long key = classificationLevelTwoBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ClassificationLevelTwo
     */
    public int editClassificationLevelTwo(ClassificationLevelTwoBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改度量衡信息
        int updateCnt = classificationLevelTwoBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ClassificationLevelTwo
     */
    public int removeClassificationLevelTwo(ClassificationLevelTwoBean data) {
        // 删除数据信息
        int updateCnt = classificationLevelTwoBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
