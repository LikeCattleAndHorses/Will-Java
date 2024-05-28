package com.will;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class Demo06 {
    public static void main(String[] args) {
        String dt = "2022-06-01";
        DateTime parse = DateUtil.parse(dt);
        long t1 = parse.getTime();
        long t2 = new Date().getTime();

        long finalDay = (t1 - t2) / (24 * 60 * 60 * 1000);
        System.out.println("剩余天数：" + finalDay);
        System.out.println("剩余结算次数：" + finalDay / 5);
        System.out.println("剩余回本金额：" + (finalDay / 5) * 2000);
    }
}
