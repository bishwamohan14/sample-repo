package org.example.sorting;

import org.example.apisExample.DataBase;
import org.example.apisExample.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(12);

        //Ascending order
//        Collections.sort(list);
//        System.out.println(list);

        // descending order
//        Collections.reverse(list);
//        System.out.println(list);

        //Stream
//        list.stream().sorted().forEach(t -> System.out.println(t)); //ascending order
//        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t)); // descending order


//        List<Employee> employees=DataBase.getEmployees();
        // traditional method of sorting using custom sorting using comparator
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee, Employee t1) {
//                return (int) (employee.getSalary()-t1.getSalary());
//            }
//        });

        //  lambda expression
//        List<Employee> employees=DataBase.getEmployees();
//        Collections.sort(employees,(t1,t2) -> (int) (t1.getSalary()-t2.getSalary()));
//        System.out.println(employees);
        // collection stream employee

//        List<Employee> employees=DataBase.getEmployees();
//        employees.stream().sorted((t1,t2) -> (int) (t1.getSalary()-t2.getSalary())).forEach(System.out::println); //ascending order

//        System.out.println("Descending order");
//      employees.stream().sorted( (t1,t2) -> (int) (t2.getSalary()- t1.getSalary())).forEach(System.out::println);
        List<Employee> employees=DataBase.getEmployees();
//        employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
    }
}

        // traditional method
//    class MyComparator implements Comparator<Employee>{
//
//        @Override
//        public int compare(Employee employee, Employee t1) {
////            return (int) (employee.getSalary()-t1.getSalary()); //ascending order
//            return (int) (t1.getSalary()-employee.getSalary());   // descending order
//        }
//    }

