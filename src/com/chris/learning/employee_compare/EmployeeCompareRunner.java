package com.chris.learning.employee_compare;

import com.chris.learning.compare.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCompareRunner {


    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Christine", 40000, 00001, 3);
        Employee firstEmployee1 = new Employee("Christine", 40000, 00001, 3);
        Employee secondEmployee = new Employee("Anil", 150000, 00002, 2);
        Employee thirdEmployee = new Employee("Nitin", 80000, 00003, 1);
        Employee forthEmployee = new Employee("Munish", 200000, 00004, 3);
        Employee fifthEmployee = new Employee("Clement", 40000, 00005, 4);
        System.out.println(firstEmployee.hashCode());
        System.out.println(firstEmployee1.hashCode());
        System.out.println(thirdEmployee.hashCode());
        System.out.println(forthEmployee.hashCode());
        System.out.println(new Employee().hashCode());
        System.out.println(firstEmployee);
        List <Employee> listEmployee = new ArrayList<>();
        listEmployee.add(firstEmployee);
        listEmployee.add(firstEmployee1);
        listEmployee.add(thirdEmployee);
        listEmployee.add(forthEmployee);
        listEmployee.add(fifthEmployee);
        /*using Comparable*/
        Collections.sort(listEmployee);
        System.out.println("print using Comparable based on Rating from 1-5");
        System.out.println(listEmployee);
        Collections.sort(listEmployee,Collections.reverseOrder());
        System.out.println("reverse printing using Comparable based on Rating from 5-1");
        System.out.println(listEmployee);

        /*using Comparator for below*/
        Collections.sort(listEmployee,new EmployeeSalaryComparator());
        System.out.println("print using Comparator based on Salary from lowest to highest");
        System.out.println(listEmployee);
        System.out.println("reverse printing using Comparator based on Salary from highest to lowest");
       // Collections.sort(listEmployee,Collections.reverseOrder());
        Collections.reverse(listEmployee);
        System.out.println(listEmployee);
        int hash = listEmployee.hashCode();
        System.out.println(hash);

        //listEmployee.add(new Employee());
        int hash1 = new Employee().hashCode();
        System.out.println(hash1);
        listEmployee.sort(new EmployeeSalaryComparator());
    }
}


