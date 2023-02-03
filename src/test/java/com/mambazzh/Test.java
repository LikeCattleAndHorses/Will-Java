package com.mambazzh;


import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Ziheng·Zhang
 * @date Created in 2020-01-09 16:10
 */
public class Test {

    public static void main(String[] args) {

//        Optional<Student> o = Optional.empty();
//        Student student = o.get();
//        System.out.println(student);
//        String s = null;
//
//        String bilibili = Optional.ofNullable(s).orElse("bilibili");
//        System.out.println(bilibili);
        BigDecimal bigDecimal = new BigDecimal(1.515151);
        BigDecimal bigDecimal1 = bigDecimal.setScale(4,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal1.toString());



    }
}

@Data
class Student{
    private String name;
    private Integer age;
}
