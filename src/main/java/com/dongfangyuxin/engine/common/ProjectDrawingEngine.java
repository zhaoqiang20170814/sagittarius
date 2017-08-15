package com.dongfangyuxin.engine.common;

import com.dongfangyuxin.dao.common.ProjectDrawingBeanMapper;
import com.dongfangyuxin.dao.common.bean.ProjectDrawingBean;
import com.dongfangyuxin.dao.common.bean.ProjectDrawingBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 项目图纸信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class ProjectDrawingEngine {

    // 项目图纸信息信息表DAO
    @Autowired
    private ProjectDrawingBeanMapper projectDrawingBeanMapper;

    /**
     * 查询项目图纸信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 项目图纸信息信息List
     */
    public List<ProjectDrawingBean> getData(ProjectDrawingBeanExample condition, Page page) {
        List<ProjectDrawingBean> dataList;
        if (page == null) {
            // 取得项目图纸信息
            dataList = projectDrawingBeanMapper.selectByExample(condition);
        } else {
            // 设置分页信息
            RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
            // 取得项目图纸信息信息
            dataList = projectDrawingBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        }
        return dataList;
    }

    /**
     * 查询项目图纸信息数据信息
     *
     * @param condition 查询条件
     * @return 项目图纸信息信息List unit
     */
    public long getCount(ProjectDrawingBeanExample condition) {
        // 取得项目图纸信息信息
        long dataList = projectDrawingBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加项目图纸信息数据信息
     *
     * @param data 数据
     * @return 项目图纸信息信息List unit
     */
    public long addData(ProjectDrawingBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增项目图纸信息信息
        long key = projectDrawingBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改项目图纸信息数据信息
     *
     * @param data 数据
     * @return 项目图纸信息信息List unit
     */
    public int editData(ProjectDrawingBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改项目图纸信息信息
        int updateCnt = projectDrawingBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除项目图纸信息数据信息
     *
     * @param data 数据
     * @return 项目图纸信息信息List unit
     */
    public int removeData(ProjectDrawingBean data) {
        // 删除项目图纸信息信息
        int updateCnt = projectDrawingBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
