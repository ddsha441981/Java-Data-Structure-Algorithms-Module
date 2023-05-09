package com.cwc.java8.streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeManager {


    public static void main(String[] args) {
        List<Employee> e1 = new ArrayList<>();
      e1.add(new Employee(101,"Deendayal", "Software", 40000,2019,"Male",23));
      e1.add(new Employee(102,"Muskan", "HR", 23000,2016,"Female",30));
      e1.add(new Employee(103,"Sofil", "Finance", 23000,2014,"Male",23));
      e1.add(new Employee(104,"Manisha", "Account", 35000,2022,"Female",55));
      e1.add(new Employee(105,"Priya", "Quality Engineer", 29999,2022,"Female",35));


      //Check Male and Female
      System.out.println("Check Male and Female");
        Map<String, Long> genderCount = e1
                .stream()
                .collect(Collectors
                        .groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderCount);

        //Get Name of Department
      System.out.println("Get Name of Department");
        List<String> nameOfDepartment = e1
                .stream()
                .map(Employee::getDepName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nameOfDepartment);

        //Average Age of Employee Male and Female
      System.out.println("Average Age of Employee Male and Female");
        Map<String, Double> calculateAge = e1
                .stream()
                .collect(Collectors
                        .groupingBy(Employee::getGender, Collectors
                                .averagingInt(Employee::getAge)));
        System.out.println(calculateAge);

        //Highest Paying Employee
      System.out.println("Highest Paying Employee");
        Optional<Employee> highestSalary = e1
                .stream()
                .collect(Collectors.maxBy(Comparator
                        .comparing(Employee::getSalary)));
        System.out.println(highestSalary.get().getEmpName());

        //Print all employee Salary
      System.out.println("Print all employee Salary");
       e1.stream().map((w) -> w.getSalary()).forEach(System.out::println);

       //Second-Highest Salary
      System.out.println("Second-Highest Salary");
      Optional<Employee> collect1 = e1.stream().skip(2).collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
      System.out.println(collect1);

      //Lowest-Salary of Employee
      System.out.println("Lowest-Salary of Employee");
      Optional<Employee> minSalary = e1.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
      System.out.println(minSalary.get().getEmpName());

      //Average of Employee Salary
      System.out.println("Average of Employee Salary by Age");
      Map<Integer, Double> collect = e1
              .stream()
              .collect(Collectors.groupingBy(Employee::getSalary,
                      Collectors.averagingInt(Employee::getAge)));
      System.out.println(collect);

      //Employee Who is joining After 2019
      System.out.println("Employee Who is joining After 2019");
        e1.stream()
                .filter((e) -> e.getDate_of_joining() > 2019)
                .map(Employee::getEmpName)
                .forEach(System.out::println);

      System.out.println("---------Employee Who Join 2014 to 2018--------------------------");
      Predicate <Employee> predicate1 = (x)->x.getDate_of_joining()>2014;
      Predicate<Employee> predicate2 = (x)->x.getDate_of_joining()<2018;
      e1
              .stream()
              .filter(predicate1.and(predicate2))
              .map(Employee::getEmpName)
              .forEach(System.out::println);

      System.out.println("Group Same Age of Employee");
      Map<Integer, List<Employee>> collect2 = e1
              .stream()
              .collect(Collectors
                      .groupingBy(age -> age.getAge()));

      System.out.println(collect2);

      System.out.println("Name of employee who has same age");
      Map<Integer, List<String>> integerListMap = e1
              .stream()
              .collect(Collectors.groupingBy(age -> age.getAge(),
                      Collectors.mapping(Employee::getEmpName,
                              Collectors.toList())));
      System.out.println(integerListMap);

      System.out.println("Employee has same age but order is maintain");

      TreeMap<Integer, List<String>> collect3 = e1
              .stream()
              .collect(Collectors.groupingBy(age -> age.getAge(),
              () -> new TreeMap<>(),
              Collectors.mapping(Employee::getEmpName, Collectors.toList())));
      System.out.println(collect3);

      System.out.println("............Employee Sorting..Comparable..........");
//      Collections.sort(e1);//Here we can not sort naturally because it has a list so use Comparator Sorting

      System.out.println("............Employee Manual Sorting..Comparator..........");
      //Using Lambda
      Collections
              .sort(e1,(o1, o2) -> o2.getEmpId() - o1.getEmpId());
      System.out.println(e1);
      //Using Stream
      e1.stream()
              .sorted((o1, o2) ->o2.getDate_of_joining() - o1.getDate_of_joining())
              .forEach(System.out::println);

      System.out.println("2 st Largest Salary of Employee");
      //first sort salary
      String secondHigestSalary = e1.stream()
              .sorted(((o1, o2) -> o2.getSalary() - o1.getSalary()))
              .skip(2)
              .findFirst()
              .map(Employee::getEmpName)
              .get();
      System.out.println(secondHigestSalary);

      System.out.println("3 st Largest Salary of Employee");
      String thirdLargestSalary = e1.stream()
              .sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
              .skip(3)
              .findFirst()
              .map(Employee::getEmpName)
              .get();
      System.out.println(thirdLargestSalary);

      System.out.println("Same Salary of Employees");
      Map<Employee, Long> map = e1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(map);
    }






}
