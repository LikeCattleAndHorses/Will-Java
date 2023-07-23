package com.mambazzh.demo;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;

import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {
        String QQ = "5684634";
        Long timestamp = System.currentTimeMillis();
        String url = "http://120.78.198.45:1688/search.asp?search={}&t={}";
        url = StrUtil.format(url, QQ, timestamp);
        String body = HttpUtil.createGet(url)
                .charset("gb2312")
                .execute()
                .body();
        int length = (QQ + " = 000000 = ").length();
        int length2 = "0000年00月00日".length();
        int beginIndex = body.lastIndexOf("2023年06月01日");
        DateTime offset = DateUtil.offset(new Date(), DateField.DAY_OF_MONTH, -1);
        String t_1 = DateUtil.format(offset, "yyyy年MM月dd日");
        int endIndex = body.lastIndexOf(t_1);
        String[] split = body.substring(beginIndex - length, endIndex + length2).split("=");
        int sum = 0;
        for (String s : split) {
            s = s.trim();
            if (!QQ.equals(s) && s.length() == 6) {
                int integer = Integer.parseInt(s);
                sum += integer;
            }
        }
        System.out.println(sum);
    }
}
