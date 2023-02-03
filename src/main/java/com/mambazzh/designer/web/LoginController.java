package com.mambazzh.designer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ziheng.Z
 * @Date 11:24 2019-11-04
 */
@RestController
public class LoginController {
    @GetMapping("/abc")
    public String getName(@RequestParam("name") String name) {
        return "Hello " + name + "!";
    }
}
