package com.mambazzh.demo;

/**
 * @author MambaZzh
 * @version 1.0
 * @date 2022/1/26 5:52 下午
 */
public class Demo02 {
    public static void main(String[] args) {
        String a = "123456";
        System.out.println(a.length());
        System.out.println(a.substring(0, a.length() - 1));

        String b = "123456";
        b = b + "\r\n";
        System.out.println(b.length());
        System.out.println(b.substring(0, b.length() - 3));
    }
}
