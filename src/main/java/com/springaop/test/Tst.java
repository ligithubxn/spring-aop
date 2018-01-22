package com.springaop.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Tst {
    public static void main(String[] args) {
        Map<Object,List<Map<String,Object>>> map = new HashMap<Object,List<Map<String,Object>>>();
        Map map1 = new HashMap();
        List list = new ArrayList();
        list.add("123");
        map.put("1",list);

        List list1 = new ArrayList();
        list1.add("456");

        if (map.containsKey("1")){
            list1 = map.get("1");
        }
    }
}
