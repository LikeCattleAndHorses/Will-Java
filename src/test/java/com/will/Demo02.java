package com.will;

import java.util.HashMap;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("一","Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)");
        map.put("二","2");
        map.put("三","3");
        map.put("四","4");
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });
        
    }
}
