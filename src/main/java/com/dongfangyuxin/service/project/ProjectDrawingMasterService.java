package com.dongfangyuxin.service.project;

import com.dongfangyuxin.controller.common.Page;
import com.dongfangyuxin.dao.common.bean.ProjectDrawingBean;
import com.dongfangyuxin.dao.common.bean.ProjectDrawingBeanExample;
import com.dongfangyuxin.engine.common.ProjectDrawingEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * 项目图纸信息维护相关服务
 *
 * @author dl 2017/07/20 1.0.1
 * @version 1.0.1
 */
@Service
public class ProjectDrawingMasterService {

    // 项目图纸表相关操作
    @Autowired
    private ProjectDrawingEngine projectDrawingEngine;

    /**
     * 取得项目图纸信息
     *
     * @param condition 查询条件
     * @return 项目图纸信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ProjectDrawingBean> getDataInfo(ProjectDrawingBeanExample condition, Page page) {
        // 查询项目图纸信息
        List<ProjectDrawingBean> dataList = projectDrawingEngine.getData(condition, page);
        return dataList;
    }

    /**
     * 取得项目图纸信息数量
     *
     * @param condition 查询条件
     * @return 项目图纸信息
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getCountInfo(ProjectDrawingBeanExample condition) {
        // 查询项目图纸信息
        long dataCnt = projectDrawingEngine.getCount(condition);
        return dataCnt;
    }

    /**
     * 增加项目图纸信息
     *
     * @param condition 查询条件
     * @return 项目图纸信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public long addDataInfo(ProjectDrawingBean data) {
        // 查询项目图纸信息
        long key = projectDrawingEngine.addData(data);
        return key;
    }

    /**
     * 修改项目图纸信息
     *
     * @param data 修改数据内容
     * @return 项目图纸信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int editDataInfo(ProjectDrawingBean data) {
        // 查询项目图纸信息
        int key = projectDrawingEngine.editData(data);
        return key;
    }

    /**
     * 删除项目图纸信息
     *
     * @param data 修改数据内容
     * @return 项目图纸信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int removeDataInfo(ProjectDrawingBean data) {
        // 查询项目图纸信息
        int key = projectDrawingEngine.removeData(data);
        return key;
    }

    /**
     * 删除项目图纸信息
     *
     * @param data 修改数据内容
     * @return 项目图纸信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public String saveProjectDrawing(MultipartFile file, Integer projectCode) {
        String filePath = null;
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 判断文件目录是否存在
                File fileDic = new File("C://devenv/apache-tomcat-7.0.79/webapps/projectDrawing/" + projectCode + "/");
                if (!fileDic.exists()) {
                    fileDic.mkdirs();
                }
                // 文件保存路径
                filePath = "C://devenv/apache-tomcat-7.0.79/webapps/projectDrawing/" + projectCode + "/" + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "http://localhost:8080/projectDrawing/" + projectCode + "/" + file.getOriginalFilename();
    }
}
