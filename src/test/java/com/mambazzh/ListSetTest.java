package com.mambazzh;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author MambaZzh
 * @date 20:43 2020-05-22
 */
public class ListSetTest {
    public static void main(String[] args) {
        HashSet<Object> set = Sets.newHashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);

        LinkedHashSet<Object> lhSet = Sets.newLinkedHashSet();
        lhSet.add(1);
        lhSet.add(1);
        lhSet.add(2);
        System.out.println(lhSet);

        TreeSet<Comparable> treeSet = Sets.newTreeSet();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(1);
        System.out.println(treeSet);


        HashMap<String,String> map = Maps.newHashMap();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");
        Set set1 = map.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        map.forEach((k,v)-> System.out.println(k));

    }

}
