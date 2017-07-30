package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.ClassificationLevelOneBeanMapper;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelOneBean;
import com.dongfangyuxin.common.dao.bean.ClassificationLevelOneBeanExample;
import com.dongfangyuxin.common.dao.bean.UnitBean;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 成本一级分类表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class ClassificationLevelOneEngine {

    // 成本一级分类信息表DAO
    @Autowired
    private ClassificationLevelOneBeanMapper classificationLevelOneBeanMapper;

    /**
     * 查询数据信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 度量衡信息List
     */
    public List<ClassificationLevelOneBean> getUnit(ClassificationLevelOneBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得数据信息
        List<ClassificationLevelOneBean> dataList = classificationLevelOneBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询数据数量信息
     *
     * @param condition 查询条件
     * @return 度量衡信息List unit
     */
    public long getUnitCount(ClassificationLevelOneBeanExample condition) {
        // 取得数据数量信息
        long dataList = classificationLevelOneBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加数据信息
     *
     * @param data 数据
     * @return 度量衡信息List unit
     */
    public long addUnit(ClassificationLevelOneBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增数据信息
        long key = classificationLevelOneBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改数据信息
     *
     * @param data 数据
     * @return 度量衡信息List unit
     */
    public int editUnit(ClassificationLevelOneBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改度量衡信息
        int updateCnt = classificationLevelOneBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除数据信息
     *
     * @param data 数据
     * @return 度量衡信息List unit
     */
    public int removeUnit(ClassificationLevelOneBean data) {
        // 删除数据信息
        int updateCnt = classificationLevelOneBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
