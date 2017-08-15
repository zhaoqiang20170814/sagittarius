package com.dongfangyuxin.service.master;

import com.dongfangyuxin.dao.common.bean.ExpenseTypeInfoBean;
import com.dongfangyuxin.dao.common.bean.ExpenseTypeInfoBeanExample;
import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.engine.common.ExpenseTypeEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 报销分类信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class ExpenseTypeMasterService {

    // 报销分类信息表相关操作
    @Autowired
    private ExpenseTypeEngine expenseTypeEngine;

    /**
     * 取得报销分类信息（分页）
     *
     * @param condition 查询条件
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ExpenseTypeInfoBean> getExpenseTypeInfo(ExpenseTypeInfoBeanExample condition, Page page) {
        // 查询报销分类信息
        List<ExpenseTypeInfoBean> dataList = expenseTypeEngine.getExpenseType(condition, page);
        return dataList;
    }

    /**
     * 取得报销分类信息
     *
     * @param condition 查询条件
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ExpenseTypeInfoBean> getExpenseTypeAllInfo() {
        // 查询报销分类信息
        List<ExpenseTypeInfoBean> dataList = expenseTypeEngine.getExpenseType();
        return dataList;
    }

    /**
     * 取得报销分类信息数量
     *
     * @param condition 查询条件
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getExpenseTypeCountInfo(ExpenseTypeInfoBeanExample condition) {
        // 查询报销分类信息
        long dataCnt = expenseTypeEngine.getExpenseTypeCount(condition);
        return dataCnt;
    }

    /**
     * 增加报销分类信息
     *
     * @param condition 查询条件
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addExpenseTypeInfo(ExpenseTypeInfoBean data) {
        // 查询报销分类信息
        long key = expenseTypeEngine.addExpenseType(data);
        return key;
    }

    /**
     * 修改报销分类信息
     *
     * @param data 修改数据内容
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editExpenseTypeInfo(ExpenseTypeInfoBean data) {
        // 查询报销分类信息
        int key = expenseTypeEngine.editExpenseType(data);
        return key;
    }

    /**
     * 删除报销分类信息
     *
     * @param data 修改数据内容
     * @return 报销分类信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeExpenseTypeInfo(ExpenseTypeInfoBean data) {
        // 查询报销分类信息
        int key = expenseTypeEngine.removeExpenseType(data);
        return key;
    }
}
