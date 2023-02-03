package com.mambazzh;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo04 {
    public static void main(String[] args) {
        String s = "{\n" +
                "  \"100\": [\n" +
                "    {\n" +
                "      \"a\": \"2\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"b\": \"Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"d\": \"3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"c\": \"4\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        ArrayList<Map<String,String>> jsonObject = JSONUtil.parseObj(s).getByPath("100", ArrayList.class);
//        JSONUtil.parseArray(jsonObject).sort();
        HashMap<String, String> map = new HashMap<>();
        jsonObject.forEach(map::putAll);
    }
}
