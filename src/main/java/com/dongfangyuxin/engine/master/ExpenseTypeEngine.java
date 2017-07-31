package com.dongfangyuxin.engine.master;

import com.dongfangyuxin.common.dao.ExpenseTypeInfoBeanMapper;
import com.dongfangyuxin.common.dao.bean.ExpenseTypeInfoBean;
import com.dongfangyuxin.common.dao.bean.ExpenseTypeInfoBeanExample;
import com.dongfangyuxin.common.util.Utils;
import com.dongfangyuxin.controller.common.Page;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 报销项目表相关操作
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Component
public class ExpenseTypeEngine {

    // 报销项目信息表DAO
    @Autowired
    private ExpenseTypeInfoBeanMapper expenseTypeInfoBeanMapper;

    /**
     * 查询数据信息(分页)
     *
     * @param condition 查询条件
     * @param page      分页信息
     * @return 度量衡信息List
     */
    public List<ExpenseTypeInfoBean> getExpenseType(ExpenseTypeInfoBeanExample condition, Page page) {
        // 设置分页信息
        RowBounds rowBounds = new RowBounds(page.getOffset(), page.getLimit());
        // 取得数据信息
        List<ExpenseTypeInfoBean> dataList = expenseTypeInfoBeanMapper.selectByExampleWithRowbounds(condition, rowBounds);
        return dataList;
    }

    /**
     * 查询数据信息
     *
     * @return 度量衡信息List
     */
    public List<ExpenseTypeInfoBean> getExpenseType() {
        // 取得数据信息
        List<ExpenseTypeInfoBean> dataList = expenseTypeInfoBeanMapper.selectByExample(null);
        return dataList;
    }

    /**
     * 查询数据数量信息
     *
     * @param condition 查询条件
     * @return 度量衡信息List ExpenseType
     */
    public long getExpenseTypeCount(ExpenseTypeInfoBeanExample condition) {
        // 取得数据数量信息
        long dataList = expenseTypeInfoBeanMapper.countByExample(condition);
        return dataList;
    }

    /**
     * 增加数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ExpenseType
     */
    public long addExpenseType(ExpenseTypeInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityCreateAndOperInfo(data);
        // 新增数据信息
        long key = expenseTypeInfoBeanMapper.insertSelective(data);
        return key;
    }

    /**
     * 修改数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ExpenseType
     */
    public int editExpenseType(ExpenseTypeInfoBean data) {
        // 设置数据库后4项
        Utils.setEntityOperInfo(data);
        // 修改度量衡信息
        int updateCnt = expenseTypeInfoBeanMapper.updateByPrimaryKeySelective(data);
        return updateCnt;
    }

    /**
     * 删除数据信息
     *
     * @param data 数据
     * @return 度量衡信息List ExpenseType
     */
    public int removeExpenseType(ExpenseTypeInfoBean data) {
        // 删除数据信息
        int updateCnt = expenseTypeInfoBeanMapper.deleteByPrimaryKey(data.getId());
        return updateCnt;
    }
}
