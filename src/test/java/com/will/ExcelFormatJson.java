package com.will;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.List;
import java.util.Map;

/**
 * excel转json
 */
public class ExcelFormatJson {
    public static void main(String[] args) {
        ExcelReader reader = ExcelUtil.getReader("/Users/mambazzh/Desktop/Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO).xlsx");
        List<Map<String, Object>> maps = reader.readAll();
        JSONArray jsonArray = new JSONArray();
        maps.forEach(item->jsonArray.add(JSONUtil.parseObj(item)));
        FileUtil.writeUtf8String(jsonArray.toString(),"/Users/mambazzh/Desktop/2.txt");
    }
}
