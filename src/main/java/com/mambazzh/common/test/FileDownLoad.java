package com.mambazzh.common.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

@RestController
@RequestMapping("/file")
public class FileDownLoad {

    /**
     * 浏览器文件下载
     * @param name
     * @param response
     * @throws IOException
     */
    @GetMapping("downLoadWeb")
    public void sss(@RequestParam String name, HttpServletResponse response) throws IOException {
        /* 设置文件ContentType类型，这样设置，会自动判断下载文件类型 */
        response.setContentType("multipart/form-data");
        /* 设置文件头：最后一个参数是设置下载文件名 */
        response.setHeader("Content-Disposition", "attachment;filename=" + name + ".txt");
        ServletOutputStream out = response.getOutputStream();
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.forEach(item->
        {
            try {
                item = item+"\r\n";
                out.write(item.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        out.flush();
        out.close();
    }


}
