package org.example.projectUnderstanding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataBase {
    public static List<Customer> getAll (){
        return Stream.of(
        new Customer(101,"john","john@gmail.com", Arrays.asList("5465465","65648464")),
        new Customer(102,"smith","smith@gmail.com", Arrays.asList("656856","2054651")),
        new Customer(103,"peter","peter@gmail.com", Arrays.asList("650652","5056405")),
        new Customer(104,"kely","kely@gmail.com", Arrays.asList("840985","6854655"))
        ).collect(Collectors.toList());


    }
}
