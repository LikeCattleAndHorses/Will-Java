package com.mambazzh.common.util;

import cn.hutool.core.exceptions.ExceptionUtil;
import com.mambazzh.common.pojo.dto.FileInfoDTO;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;

/**
 * @author MambaZzh
 * @version 1.0
 * @date 2021/12/21 4:10 下午
 */
public class FileDownLoadUtil {
    /**
     * @param fileInfoDTO
     * @param response
     */
    public void downLoadFileByWeb(FileInfoDTO fileInfoDTO, HttpServletResponse response) {
        try {
            response.setContentType("application/multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileInfoDTO.getFileName() + ".txt");
            response.setCharacterEncoding("gbk");
            BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
            bos.write(1);
            //  最后刷新，关闭
            bos.flush();
            bos.close();
        } catch (IOException e) {
            LogUtil.getExceptionLogger().error("下载错误：{}", ExceptionUtil.getMessage(e));
            e.printStackTrace();
        }
    }
}
