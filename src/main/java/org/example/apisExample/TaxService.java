package org.example.apisExample;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input){
        return (input.equalsIgnoreCase("tax"))
        ? DataBase.getEmployees().stream().filter(employee -> employee.getSalary()>500000).collect(Collectors.toList())
        : DataBase.getEmployees().stream().filter(employee -> employee.getSalary()<=500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("non tax"));
    }
}
