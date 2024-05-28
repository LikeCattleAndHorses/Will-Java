package com.will.demo;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONTokener;

/**
 * @author MambaZzh
 * @version 1.0
 * @date 2021/12/24 6:05 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            String str = "[{\"name\":\"name1\"},{\"name\":\"name2\"}]";
            Object typeObject = new JSONTokener(str).nextValue();
            if (typeObject instanceof JSONArray) {
                System.out.print("JSONArray");
            } else if (typeObject instanceof JSONObject) {
                System.out.print("JSONObject");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
