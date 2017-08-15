package com.dongfangyuxin.engine.common;

import com.dongfangyuxin.dao.common.ProjectInfoBeanMapper;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBean;
import com.dongfangyuxin.dao.common.bean.ProjectInfoBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 车辆信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class ProjectInfoEngine {

    // 车辆信息信息表DAO
    @Autowired
    private ProjectInfoBeanMapper projectInfoBeanMapper;

    /**
     * 查询车辆信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 车辆信息信息List
     */
    public List<ProjectInfoBean> getData(ProjectInfoBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得车辆信息信息
        List<ProjectInfoBean> dataList = projectInfoBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询车辆信息数据信息
     *
     * @param condition 查询条件
     * @return 车辆信息信息List unit
     */
    public long getCount(ProjectInfoBeanExample condition) {
        // 取得车辆信息信息
        long dataList = projectInfoBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加车辆信息数据信息
     *
     * @param data 数据
     * @return 车辆信息信息List unit
     */
    public long addData(ProjectInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增车辆信息信息
        long key = projectInfoBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改车辆信息数据信息
     *
     * @param data 数据
     * @return 车辆信息信息List unit
     */
    public int editData(ProjectInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改车辆信息信息
        int updateCnt = projectInfoBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除车辆信息数据信息
     *
     * @param data 数据
     * @return 车辆信息信息List unit
     */
    public int removeData(ProjectInfoBean data) {
        // 删除车辆信息信息
        int updateCnt = projectInfoBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
