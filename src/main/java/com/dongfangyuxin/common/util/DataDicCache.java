package com.dongfangyuxin.common.util;

import com.dongfangyuxin.common.constants.GlobalConstants;
import com.dongfangyuxin.dao.common.DataDicBeanMapper;
import com.dongfangyuxin.dao.common.bean.DataDicBean;
import com.dongfangyuxin.dao.common.bean.DataDicBeanExample;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 字典项缓存
 */
@Component
public class DataDicCache {
    // 日志
    private static final Logger logger = LogManager.getLogger(DataDicCache.class);

    /**
     * 数据字典缓存map
     */
    public static Map<String, List<DataDicBean>> dictCodeMapAll = new HashMap<String, List<DataDicBean>>();

    /**
     * 数据字典缓存map(FOR COMBOBOX)
     */
    public static Map<String, List<DataDicBean>> dictCodeMapValid = new HashMap<String, List<DataDicBean>>();

    @Autowired
    ApplicationContext applicationContext;

    public void init() {
        logger.info("****************************初始化数据字典开始！****************************");
        DataDicBeanMapper dataDicBeanMapper = applicationContext.getBean(DataDicBeanMapper.class);
        DataDicBeanExample condition = new DataDicBeanExample();
        condition.setOrderByClause("DICT_TYPE ASC,SEQUENCE ASC");
        List<DataDicBean> dicDataCacheList = dataDicBeanMapper.selectByExample(condition);
        Iterator<DataDicBean> iterator = dicDataCacheList.iterator();
        while (iterator.hasNext()) {
            DataDicBean dic = iterator.next();
            if (dictCodeMapAll.get(dic.getDictType()) != null) {
                dictCodeMapAll.get(dic.getDictType()).add(dic);
                if (GlobalConstants.VALID.equals(dic.getStatus())) {
                    // 如果此字典项有效，则放入有效字典项缓存
                    dictCodeMapValid.get(dic.getDictType()).add(dic);
                }
            } else {
                List<DataDicBean> dicList = new ArrayList<DataDicBean>();
                dicList.add(dic);
                dictCodeMapAll.put(dic.getDictType(), dicList);
                if (GlobalConstants.VALID.equals(dic.getStatus())) {
                    // 如果此字典项有效，则放入有效字典项缓存
                    dictCodeMapValid.get(dic.getDictType()).add(dic);
                }
            }
        }
    }
}
