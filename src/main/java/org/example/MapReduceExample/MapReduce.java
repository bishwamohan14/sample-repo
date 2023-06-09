package org.example.MapReduceExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);
        List<String> words = Arrays.asList("corejava","spring","hiberante");




//        int sum=0;
//        for (Integer n:numbers) {
//            sum=sum+n;
//        }
//        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);

        Integer maxvalue =numbers.stream().reduce(Integer::max).get();
        System.out.println(maxvalue);


        String longest=words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(longest);

        //we need to get employee whose grade is A
        double averageSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(averageSalary);

        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();

        System.out.println(sumSalary);
    }
}
