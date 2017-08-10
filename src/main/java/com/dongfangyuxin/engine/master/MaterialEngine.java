package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.MaterialBeanMapper;
import com.dongfangyuxin.common.dao.bean.MaterialBean;
import com.dongfangyuxin.common.dao.bean.MaterialBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 原材料信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class MaterialEngine {

    // 原材料信息信息表DAO
    @Autowired
    private MaterialBeanMapper materialBeanMapper;

    /**
     * 查询原材料信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 原材料信息信息List
     */
    public List<MaterialBean> getData(MaterialBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得原材料信息信息
        List<MaterialBean> dataList = materialBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询原材料信息数据信息
     *
     * @param condition 查询条件
     * @return 原材料信息信息List unit
     */
    public long getCount(MaterialBeanExample condition) {
        // 取得原材料信息信息
        long dataList = materialBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加原材料信息数据信息
     *
     * @param data 数据
     * @return 原材料信息信息List unit
     */
    public long addData(MaterialBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增原材料信息信息
        long key = materialBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改原材料信息数据信息
     *
     * @param data 数据
     * @return 原材料信息信息List unit
     */
    public int editData(MaterialBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改原材料信息信息
        int updateCnt = materialBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除原材料信息数据信息
     *
     * @param data 数据
     * @return 原材料信息信息List unit
     */
    public int removeData(MaterialBean data) {
        // 删除原材料信息信息
        int updateCnt = materialBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
