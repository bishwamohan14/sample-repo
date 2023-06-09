package org.example.FuntionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{
    public static void main(String[] args) {
//        Predicate<Integer> predicate = t-> t%2==0;
//        System.out.println(predicate.test(3));

        List<Integer> list= Arrays.asList(1,2,3,4,5,10,11,101,104,96,95,92,90);
        list.stream().filter(t -> t%2==0 && t<=100).forEach(t -> System.out.println("print even : "+t));

    }
}
