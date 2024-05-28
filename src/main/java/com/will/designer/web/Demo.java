package com.will.designer.web;

import com.will.common.util.LogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MambaZzh
 * @version 1.0
 * @date 2022/2/9 4:16 下午
 */
@RestController
@RequestMapping("demo")
public class Demo {
    Logger logger = LoggerFactory.getLogger(Demo.class);
    @GetMapping
    public String demo01(@RequestParam("demo") String demo) {

        Logger l1 = LogUtil.getBusinessLogger();
        l1.info("部署成功{}",demo);
        Logger l2 = LogUtil.getExceptionLogger();
        l2.error("部署失败{}",demo);
        return null;
    }
}
