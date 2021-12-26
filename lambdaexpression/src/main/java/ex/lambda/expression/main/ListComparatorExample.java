package ex.lambda.expression.main;

import ex.lambda.expression.model.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ListComparatorExample {
    public static void main(String[] args) {

        // Lambda pront
      //  employees.forEach((employee)->System.out.println(employee));

        List<Employee> employees=new ArrayList<Employee>();
         employees.add(new Employee("Ashutosh","Jha",LocalDate.of(2000, 1, 8),"Delhi, India",5000000.01));
        employees.add(new Employee("Mohit","Jha",LocalDate.of(2019, 2, 9),"Delhi, Bihar",5000000.02));
        employees.add(new Employee("Amit","Jha",LocalDate.of(2018, 3, 10),"Delhi, Banglore",5000000.01));
        employees.add(new Employee("Vikash","Jha",LocalDate.of(2000, 4, 11),"Delhi, Kolkotta",5000000.02));
        employees.add(new Employee("Karthik","Jha",LocalDate.of(2019, 5, 12),"Delhi, Punjab",5000000.01));
        employees.add(new Employee("Ramaswamy","Jha",LocalDate.of(2018, 6, 13),"Delhi, Punjab",5000000.01));
        employees.add(new Employee("Mohan","Jha",LocalDate.of(2020, 7, 14),"Delhi, Bihar",5000000.01));

        employees.forEach(employee -> System.out.println(employee));
        Collections.sort(employees,(o1, o2) -> o1.getDob().compareTo(o2.getDob()));
        // After Sort
        System.out.println("-------------");
        employees.forEach(employee -> System.out.println(employee));

        // Filter data
        List<Employee> employeeInfo=employees.stream()
                .filter(employee -> employee.getDob().isAfter(LocalDate.of(2001,1,8)))
                .collect(Collectors.toList());

        System.out.println("----Filter list---------");
        employeeInfo.forEach(employee -> System.out.println(employee));

        }



}

