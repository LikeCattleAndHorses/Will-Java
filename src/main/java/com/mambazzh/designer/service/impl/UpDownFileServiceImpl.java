//package com.mambazzh.designer.service.impl;
//
//import cn.hutool.core.date.DateUtil;
//import com.mambazzh.designer.service.UpDownFileService;
//import org.apache.commons.io.FileUtils;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletResponse;
//import java.io.*;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Ziheng.Z
// * @date 15:53 2019-12-09
// */
//@Service
//@SuppressWarnings("unchecked")
//public class UpDownFileServiceImpl implements UpDownFileService {
//    @Value("${upload-filePath}")
//    private String filePath;
//
//    @Resource
//    private MambaFilePathMapper mambaFilePathMapper;
//
//    /**
//     * 上传文件
//     *
//     * @param file
//     * @return
//     */
//    @Override
//    public Map uploadFile(MultipartFile file) {
//        Map<String, Object> resultMap = new HashMap<>(16);
//        MambaFilePath mambaFilePath = new MambaFilePath();
//        String fileName = file.getOriginalFilename();
//        resultMap.put("文件名", fileName);
//        mambaFilePath.setFileName(fileName);
////        获取最后一个 .的下标
//        int index = fileName.lastIndexOf(".");
////        根据.下标截取，获取文件格式 .doc .txt ....
//        String fileFormat = fileName.substring(index);
////        根据.下标截取，获取去掉文件格式的文件名 xxxx
//        fileName = fileName.substring(0, index);
////        获取时间戳-----start
//        String time = DateUtil.format(new Date(), "yyyyMMddHHmmss");
//        fileName = new StringBuilder(fileName).append(time).append(fileFormat).toString();
////        获取时间戳-----end
//        String newFilePath = new StringBuilder(filePath).append(fileName).toString();
//        startUpload(file, newFilePath);
////        把上传的信息保存到数据库中
//        mambaFilePath.setId(time);
//        mambaFilePath.setFileTimeName(fileName);
//        mambaFilePath.setFilePath(newFilePath);
//        mambaFilePathMapper.insertSelective(mambaFilePath);
//        resultMap.put("文件时间名", fileName);
//        return resultMap;
//    }
//
//    /**
//     * 开始上传
//     *
//     * @param file
//     * @param filePath
//     */
//    private void startUpload(MultipartFile file, String filePath) {
//        File newFile = new File(filePath);
//        if (!newFile.getParentFile().exists()) {
//            newFile.getParentFile().mkdirs();
//        }
//        if (newFile.exists()) {
//            newFile.delete();
//        }
//        try {
//            FileUtils.copyInputStreamToFile(file.getInputStream(), newFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    /**
//     * 下载文件
//     *
//     * @param id
//     * @param response
//     */
//    @Override
//    public String downloadFile(String id, HttpServletResponse response) {
//
//        MambaFilePath mambaFilePathInfo = mambaFilePathMapper.selectByPrimaryKey(id);
//        File file = new File(mambaFilePathInfo.getFilePath());
//        if (file.exists()) {
//            try {
//                startDownload(file, response);
//            } catch (FileNotFoundException e) {
//                return "未找到文件";
//            } catch (IOException e) {
//                return "下载失败";
//            }
//        }
//        return "未找到文件";
//    }
//
//
//    /**
//     * 开始下载
//     *
//     * @param file
//     * @param response
//     * @throws IOException
//     */
//    private void startDownload(File file, HttpServletResponse response) throws IOException {
////        以流形式下载文件
//        InputStream bis = new BufferedInputStream(new FileInputStream(file));
//        byte[] buffer = new byte[bis.available()];
//        bis.read(buffer);
//        bis.close();
////        清空response
//        response.reset();
////        设置response的Header
//        response.addHeader("Content-Disposition", "attachment;filename=" + new String(file.getName().getBytes("utf-8"), "ISO8859-Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)"));
//        response.addHeader("Content-Length", "" + file.length());
//        OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
//        response.setContentType("application/octet-stream");
//        toClient.write(buffer);
//        toClient.flush();
//        toClient.close();
//    }
//}
