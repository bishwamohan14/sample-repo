package org.example.sorting;

import org.example.apisExample.Employee;

import java.util.*;

public class ShortMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);


        Map<Employee,Integer> employeeMap = new TreeMap<>((t1,t2) ->(int) (t2.getSalary()-t1.getSalary()));
//                                                        ()
        employeeMap.put(new Employee(176,"Roshan","IT",600000),60);
        employeeMap.put(new Employee(388,"Bikash","CIVIL",900000),90);
        employeeMap.put(new Employee(470,"Bimal","DEFENCE",500000),50);
        employeeMap.put(new Employee(624,"Sourav","Core",400000),40);
        employeeMap.put(new Employee(176,"Prakash","Social",1200000),120);

        //Ascending Order
        employeeMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
                .forEach(System.out::println);
//        System.out.println(employeeMap);
        //descending order
        System.out.println("*****************************************************************************************************************************");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);


        //Traditional method

//        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries,(t1,t2) -> t1.getValue().compareTo(t2.getValue()));
//
//        for (Map.Entry<String, Integer> entry: entries){
//            System.out.println(entry.getKey() + " "+ entry.getValue());
//        }

                    //Stream APIS using
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        // ascending by using comparing by value method
//        System.out.println("-_______________");

//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
                // Stream descending order for key


    }
}
