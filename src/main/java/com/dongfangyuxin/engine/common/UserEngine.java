package com.dongfangyuxin.engine.common;

import com.dongfangyuxin.dao.common.UserBeanMapper;
import com.dongfangyuxin.dao.common.bean.UserBean;
import com.dongfangyuxin.dao.common.bean.UserBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户信息表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class UserEngine {

    // 用户信息信息表DAO
    @Autowired
    private UserBeanMapper userBeanMapper;

    /**
     * 查询用户信息信息
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 用户信息信息List
     */
    public List<UserBean> getData(UserBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得用户信息信息
        List<UserBean> dataList = userBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询用户信息信息（全部）
     *
     * @param condition 查询条件
     * @return 用户信息信息List
     */
    public List<UserBean> getDataAll(UserBeanExample condition) {
        // 取得用户信息信息
        List<UserBean> dataList = userBeanMapper.selectByExample(condition);
        return dataList;
    }

    /**
     * 查询用户信息数据信息
     *
     * @param condition 查询条件
     * @return 用户信息信息List unit
     */
    public long getCount(UserBeanExample condition) {
        // 取得用户信息信息
        long dataList = userBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加用户信息数据信息
     *
     * @param data 数据
     * @return 用户信息信息List unit
     */
    public long addData(UserBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增用户信息信息
        long key = userBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改用户信息数据信息
     *
     * @param data 数据
     * @return 用户信息信息List unit
     */
    public int editData(UserBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改用户信息信息
        int updateCnt = userBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除用户信息数据信息
     *
     * @param data 数据
     * @return 用户信息信息List unit
     */
    public int removeData(UserBean data) {
        // 删除用户信息信息
        int updateCnt = userBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
