package com.will.designer.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author MambaZzh
 * @date 10:15 2020-04-27
 */
public interface UpDownFileService {

    /**
     * 文件上传
     *
     * @param file 文件
     * @return
     */

    Map uploadFile(MultipartFile file);

    /**
     * 文件下载
     *
     * @param id       文件id
     * @param response
     * @return
     */
    String downloadFile(String id, HttpServletResponse response);
}
