package com.mambazzh.designer.web;

import com.mambazzh.common.exception.ApiException;
import com.mambazzh.url.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;


/**
 * @author Ziheng.Z
 * @date 15:47 2019-12-09
 */
@RestController
@RequestMapping(Urls.MAMBA)
public class FileController {
    private static final int FILE_SIZE = 20 * 1024 * 1024;

//    @Autowired
//    private UpDownFileServiceImpl upDownFileServiceImpl;

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @PostMapping(Urls.URL_UPLOAD_FILE)
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.getSize() > FILE_SIZE) {
            throw ApiException.create("文件过大，应小于20M");
        }
//        return ResponseEntity.ok(upDownFileServiceImpl.uploadFile(file));
        return null;
    }

    /**
     * 下载文件
     *
     * @return
     */
    @GetMapping(Urls.URL_DOWNLOAD_FILE)
    public ResponseEntity<?> uploadFile(@RequestParam String id, HttpServletResponse response) {
        try {
//            return ResponseEntity.ok(upDownFileServiceImpl.downloadFile(id, response));
            return null;
        } catch (Exception e) {
            throw ApiException.create("下载失败");
        }
    }

    /**
     * 浏览器下载文件
     *
     * @return
     */
    @GetMapping(Urls.URL_DOWNLOAD_FILE_BY_WEB)
    public String downloadFileByWeb() {

        return "下载成功";
    }

}
