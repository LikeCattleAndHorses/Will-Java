package com.will.io;

import java.io.*;

public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("/Users/mambazzh/Desktop/Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO).txt");
//        for (int i = 0; i < 3; i++) {
//            int read = fis.read();
//            System.out.println(read);
//        }
        byte[] bytes = new byte[1024];
        int read = fis.read(bytes);
        fis.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/mambazzh/Desktop/Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO).txt"));
        int read1 = bis.read();

        int available = bis.available();
        System.out.println(available);
        long skip = bis.skip(20);
        System.out.println(skip);
        int available1 = bis.available();
        System.out.println(available1);

    }
}
