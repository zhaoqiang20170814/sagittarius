package com.dongfangyuxin.dao.sample;

import com.dongfangyuxin.common.vo.ThirdLevelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Sample {
    List<ThirdLevelVo> getUserName(String parameterMap);
}
