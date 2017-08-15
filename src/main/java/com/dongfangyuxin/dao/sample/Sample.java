package com.dongfangyuxin.dao.sample;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface Sample {
    String getUserName(Map<String, Object> parameterMap);
}
