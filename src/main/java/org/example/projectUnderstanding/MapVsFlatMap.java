package org.example.projectUnderstanding;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers=EKartDataBase.getAll();
        //list<Customer> customer  convert list<String> email --- data transformation works for 1-1 mapping
        List<String> emails = customers.stream().map(emp -> emp.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        List<String> names = customers.stream()
                .map(customer -> customer.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        // cannot go for 1-1 relationship so flatmap but here 1-2 scenarios
        List<List<String>> collect = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(collect1);


    }
}
