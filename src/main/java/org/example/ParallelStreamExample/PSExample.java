package org.example.ParallelStreamExample;

import org.example.MapReduceExample.Employee;
import org.example.MapReduceExample.EmployeeDatabase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PSExample {
    public static void main(String[] args) {
        long start=0;
        long end=0;
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Plain Stream took time: "+(end-start));
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Parallel Stream took time: "+(end-start));

//        start=System.currentTimeMillis();
//        IntStream.range(1,10).forEach(x -> {
//            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
//        });
//        end=System.currentTimeMillis();
//        System.out.println("Parallel Stream took time: "+(end-start));
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,10).parallel().forEach(x -> {
//            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
//        });
//        end=System.currentTimeMillis();
//        System.out.println("Parallel Stream took time: "+(end-start));

        List<Employee> employees =EmployeeDatabase.getEmployees();

        //normal stream
        start=System.currentTimeMillis();
        double normalStreamAverage = employees.stream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(normalStreamAverage);
        end=System.currentTimeMillis();
        System.out.println("Normal Stream execution time  : "+(end-start) + " : Average Salary :"+normalStreamAverage);

        System.out.println("========================================================================");

        start=System.currentTimeMillis();
        double normalStreamAverage1 = employees.parallelStream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(normalStreamAverage1);
        end=System.currentTimeMillis();
        System.out.println("Parallel Stream execution time  : "+(end-start)+ " : Average Salary :"+normalStreamAverage1);

    }
}
