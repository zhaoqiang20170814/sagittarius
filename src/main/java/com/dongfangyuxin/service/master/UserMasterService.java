package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.UserBean;
import com.dongfangyuxin.dao.common.bean.UserBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.UserEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class UserMasterService {

    // 用户表相关操作
    @Autowired
    private UserEngine userEngine;

    /**
     * 取得用户信息
     *
     * @param condition 查询条件
     * @return 用户信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<UserBean> getDataInfo(UserBeanExample condition, Page page) {
        // 查询用户信息
        List<UserBean> dataList = userEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得用户信息（所有）
     *
     * @return 用户信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<UserBean> getDataInfoAll(UserBeanExample condition) {
        // 查询用户信息
        List<UserBean> dataList = userEngine.getDataAll(condition);
        return dataList;
    }

    /**
     * 取得用户信息数量
     *
     * @param condition 查询条件
     * @return 用户信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(UserBeanExample condition) {
        // 查询用户信息
        long dataCnt = userEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加用户信息
     *
     * @param data 查询条件
     * @return 用户信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(UserBean data) {
        // 查询用户信息
        long key = userEngine.addData(data);
        return key;
    }

    /**
     * 修改用户信息
     *
     * @param data 修改数据内容
     * @return 用户信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(UserBean data) {
        // 查询用户信息
        int key = userEngine.editData(data);
        return key;
    }

    /**
     * 删除用户信息
     *
     * @param data 修改数据内容
     * @return 用户信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(UserBean data) {
        // 查询用户信息
        int key = userEngine.removeData(data);
        return key;
    }
}
