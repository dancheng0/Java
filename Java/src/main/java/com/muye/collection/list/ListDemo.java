package com.muye.collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author : gwh
 * @Desc:
 * @date : 2020-07-18 07:40
 **/
public class ListDemo {


    @Test
    public void test1() {
        List<Integer> list1 = new ArrayList();
        List list2 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(3);
        list2.add(4);

//        list1.addAll(list2);  //求并集 ，有重复

//        list1.removeAll(list2);  //移除交集

//        list1.retainAll(list2); //求交集

        Collections.synchronizedList(list1); // 线程安全的List
        System.out.println(list1.toString());
    }

    @Test
    public void test2(){
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);

    }

}
