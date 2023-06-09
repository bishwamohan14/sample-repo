package org.example.MapReduceExample;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUse {
    public static void main(String[] args) {
        //grade b ->employee salary > 50000, avg salary of grade b list of employees
        List<Employee> employeeList = EmployeeDatabase.getEmployees();

        List<Employee> listOfGradeB = employeeList.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("B") && employee.getSalary()>50000).collect(Collectors.toList());
        System.out.println(listOfGradeB);
        System.out.println("Total no of Group B Employees: "+listOfGradeB.size());


        double averageSalaryOfGradeB = employeeList.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("B") && employee.getSalary()>=50000)
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println("Average Salary: "+averageSalaryOfGradeB);
    }

}
