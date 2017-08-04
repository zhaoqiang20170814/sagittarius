package com.dongfangyuxin.service.master;

import com.dongfangyuxin.common.dao.bean.ProjectInfoBean;
import com.dongfangyuxin.common.dao.bean.ProjectInfoBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.master.ProjectInfoEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 项目信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class ProjectInfoMasterService {

    // 项目表相关操作
    @Autowired
    private ProjectInfoEngine projectInfoEngine;

    /**
     * 取得项目信息
     *
     * @param condition 查询条件
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ProjectInfoBean> getDataInfo(ProjectInfoBeanExample condition, Page page) {
        // 查询项目信息
        List<ProjectInfoBean> dataList = projectInfoEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得项目信息数量
     *
     * @param condition 查询条件
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(ProjectInfoBeanExample condition) {
        // 查询项目信息
        long dataCnt = projectInfoEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加项目信息
     *
     * @param condition 查询条件
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(ProjectInfoBean data) {
        // 查询项目信息
        long key = projectInfoEngine.addData(data);
        return key;
    }

    /**
     * 修改项目信息
     *
     * @param data 修改数据内容
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(ProjectInfoBean data) {
        // 查询项目信息
        int key = projectInfoEngine.editData(data);
        return key;
    }

    /**
     * 删除项目信息
     *
     * @param data 修改数据内容
     * @return 项目信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(ProjectInfoBean data) {
        // 查询项目信息
        int key = projectInfoEngine.removeData(data);
        return key;
    }
}
