package com.gowri.tech.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class EmployeeImpl {
    private static final Logger log = LoggerFactory.getLogger(EmployeeImpl.class);
    private static final int YEAR_CUTOFF = 2015;

    public static void main(String[] args) {

        List<Employees> employeeList = new ArrayList<>();

        employeeList.add(new Employees("Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employees("Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employees("Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employees("Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employees("Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employees("Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employees("Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employees("Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employees("Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employees("Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employees("Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employees("Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employees("Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employees("Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employees("Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employees("Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employees("Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        log.info("EMPLOYEE MANAGEMENT SYSTEM");

        logEmployeeDetails(employeeList);

        System.out.println("\n##Query 3.1 : How many male and female employees are there in the organization?\n");
        Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employees::getEmpGender, Collectors.counting()));
        System.out.println(genderCount);

        System.out.println("\n##Query 3.2 : Print the name of all departments in the organization\n");
        employeeList.stream().map(Employees::getEmpDepartment).distinct().forEach(System.out::println);

        System.out.println("\n##Query 3.3 : What is the average age of male and female employees?\n");
        Map<String, Double> avgEmpSal = employeeList.stream().collect(Collectors.groupingBy(Employees::getEmpGender, Collectors.averagingDouble(Employees::getEmpSalary)));
        System.out.println(avgEmpSal);

        System.out.println("\n##Query 3.4 : Get the details of highest paid employee in the organization?\n");
        employeeList.stream().max(Comparator.comparing(Employees::getEmpSalary))
                .ifPresent(emp -> System.out.println(emp.getEmpAge() + "\n" + emp.getEmpSalary()));

        System.out.println("\n##Query 3.5 : Get the names of all employees who have joined after 2015?\n");
        List<String> salesAndMarketingTeam = employeeList.stream()
                .filter(e -> e.getEmpYearOfJoining() > YEAR_CUTOFF)
                .filter(e -> e.getEmpDepartment().equalsIgnoreCase("Sales And Marketing"))
                .map(Employees::getEmpName)
                .collect(Collectors.toList());
        System.out.println(salesAndMarketingTeam);

        System.out.println("\n##Query 3.7 : What is the average salary of each department?\n");
        Map<String, Double> deptAvgSal = employeeList.stream().collect(Collectors.groupingBy(Employees::getEmpDepartment, Collectors.averagingDouble(Employees::getEmpSalary)));
        System.out.println(deptAvgSal);

        System.out.println("\n##Query 3.8 : Get the details of youngest male employee in the product development department?\n");
        employeeList.stream()
                .filter(e -> e.getEmpDepartment().equalsIgnoreCase("Product Development"))
                .min(Comparator.comparing(Employees::getEmpAge))
                .ifPresent(System.out::println);

        System.out.println("\n##Query 3.9 : Who has the most working experience in the organization?\n");
        employeeList.stream().min(Comparator.comparing(Employees::getEmpYearOfJoining))
                .ifPresent(System.out::println);
    }

    private static void logEmployeeDetails(List<Employees> employeeList) {
        employeeList.forEach(emp -> log.info(emp.toString()));
    }
}
