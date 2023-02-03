package com.mambazzh.scheduleds;

import cn.hutool.http.HttpUtil;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author MambaZzh
 * @version 1.0
 * @date 2022/1/28 5:17 下午
 */
public class EPoolNotice {
    public static void main(String[] args) {
//        String s = HttpUtil.get("https://www.ethermine.org/miners/Ae776E3f4c24A9b968446C53bc906204cAA9495D/dashboard");
//        System.out.println(s);
//        JSON parse = JSONUtil.parse(s);
//        System.out.println(parse);
        Random random = new Random();
        IntStream ints = random.ints(10000, 65534);
        ints.forEach(System.out::print);
//        System.out.println(ints.toString());
    }
}
