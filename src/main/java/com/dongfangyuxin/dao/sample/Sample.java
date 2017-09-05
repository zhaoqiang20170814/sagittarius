package com.dongfangyuxin.dao.sample;

import com.dongfangyuxin.common.vo.MaterialRetrunVo;
import com.dongfangyuxin.common.vo.ProjectInfo;
import com.dongfangyuxin.common.vo.ThirdLevelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Sample {
    List<ThirdLevelVo> getUserName(String parameterMap);
    List<ProjectInfo> getProjectName(String parameterMap);
    List<ProjectInfo> getReturn(String parameterMap);
    List<String> getMaterialName(Map<String, Object> parameterMap);
    List<String> getReturnMaterialName(Map<String, Object> parameterMap);
    List<MaterialRetrunVo> getReceiveMaterial(Map<String, Object> parameterMap);
}
