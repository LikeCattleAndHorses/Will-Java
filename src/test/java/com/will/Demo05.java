package com.will;

import java.util.StringTokenizer;

public class Demo05 {
    public static void main(String[] args) {
        String s = "ABCDEFG";
        // 前三个不要，后五个不要
        System.out.println(s.substring(3,5));
        System.out.println(s.substring(0));

        String a = "i am a chinese";

        System.out.println(a.indexOf("a",2));


        StringTokenizer stringTokenizer = new StringTokenizer("public static void main"," ");
        System.out.println(stringTokenizer.countTokens());
    }
}
