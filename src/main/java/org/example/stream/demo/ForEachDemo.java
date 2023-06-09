package org.example.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murrit");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");

//        for (String s:list) {
//            System.out.println(s);
//        }

//        for (String s:list) {
//            if(s.startsWith("m")){
//                System.out.println(s);
//            }
//        }



//        list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));

        //stream use
//        list.stream().forEach(t -> System.out.println(t)); //consumer interface

        Map<Integer, String> map =new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

//        map.entrySet().stream().forEach(obj -> System.out.println(obj));
//        map.forEach((key,value) -> System.out.println(key +": "+value));

        //stream use for which we use entrySet
//        map.entrySet().stream().forEach( obj -> System.out.println(obj));

       map.entrySet().stream().filter(t -> t.getKey()%2==0).forEach(t -> System.out.println(t));

    }

}
