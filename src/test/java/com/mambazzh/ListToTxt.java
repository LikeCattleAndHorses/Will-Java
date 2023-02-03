package com.mambazzh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListToTxt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        try {
            File outFile1 = new File("/Users/mambazzh/Desktop/Test.txt");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile1, true), "utf-8"), 10240);
            for (int i = 0; i < list.size(); i++) {
                out.write(list.get(i) + "\r\n");
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
