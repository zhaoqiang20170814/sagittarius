package com.dongfangyuxin.common.util;

import com.dongfangyuxin.common.constants.GlobalConstants;
import org.apache.commons.beanutils.BeanUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by dongl on 2017/7/26.
 */
public class Utils {

    private static ObjectMapper objectMapper = new ObjectMapper();
    /**
     * @param entity
     * @return
     * @Description : 数据库插入时，创建信息设定
     * @Method_Name : setEntityCreateInfo
     * @Creation Date  : 2015年9月24日 上午11:25:05
     * @Author : 董磊
     * @ModificationHistory Date            Author      	Version    	Description
     * ------------------------------------------------------------------
     * 2015年9月24日			董磊				1.0			创建
     */
    private static <T> T setEntityCreateInfo(T entity) {
//        UserInfo userInfo = getUserModel();
        try {
            // 创建时间
            BeanUtils.setProperty(entity, GlobalConstants.DB_FIELDNAME_CREATE_TIME, new Date());
            // 创建人
//            if (userInfo != null) {
//                BeanUtils.setProperty(entity, GlobalConstants.DB_FIELDNAME_CREATE_USER, userInfo.getCode());
//            } else {
            BeanUtils.setProperty(entity, GlobalConstants.DB_FIELDNAME_CREATE_USER, GlobalConstants.SYSTEM_USER);
//            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entity;
    }

    /**
     * @param entity
     * @return
     * @Description : 数据库更新时，更新信息设定
     * @Method_Name : setEntityOperInfo
     * @Creation Date  : 2015年9月24日 上午11:25:05
     * @Author : 董磊
     * @ModificationHistory Date            Author      	Version    	Description
     * ------------------------------------------------------------------
     * 2015年9月24日			董磊				1.0			创建
     */
    public static <T> T setEntityOperInfo(T entity) {
//        UserInfo userInfo = getUserModel();
        try {
            // 修改时间
            BeanUtils.setProperty(entity, GlobalConstants.DB_FIELDNAME_MODIFY_TIME, new Date());
            // 修改人
//            if (userInfo != null) {
//                BeanUtils.setProperty(entity, GlobalConstants.DB_FIELDNAME_MODIFY_USER, userInfo.getCode());
//            } else {
            BeanUtils.setProperty(entity, GlobalConstants.DB_FIELDNAME_MODIFY_USER, GlobalConstants.SYSTEM_USER);
//            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entity;
    }

    /**
     * @param entity
     * @return
     * @Description : 数据库插入时，创建信息和更新信息设定
     * @Method_Name : setEntityCreateAndOperInfo
     * @Creation Date  : 2015年9月24日 上午11:25:05
     * @Author : 董磊
     * @ModificationHistory Date            Author      	Version    	Description
     * ------------------------------------------------------------------
     * 2015年9月24日			董磊				1.0			创建
     */
    public static <T> T setEntityCreateAndOperInfo(T entity) {
        // 创建信息设定
        setEntityCreateInfo(entity);
        // 更新信息设定
        setEntityOperInfo(entity);
        return entity;
    }

    /**
     * 获取UUID
     * @return
     */
    public static String getDefaultUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 获取领料单ID
     * @return   getUuid
     */
    public static String getOrderIdByUuid() {
        int uuidHashCode = getDefaultUuid().hashCode();
        if (uuidHashCode < 0)
            uuidHashCode = -uuidHashCode;
        return (new StringBuilder(String.valueOf(1)))
                .append(String.format("%010d", new Object[] { Integer.valueOf(uuidHashCode) })).toString();
    }

    public static <T> List<T> deserializeList(String json, Class<T> clazz) {
        JavaType javaType = TypeFactory.collectionType(List.class, clazz);
        try {
            return objectMapper.readValue(json, javaType);
        } catch (IOException e) {
        }
        return new ArrayList<T>();
    }
}
