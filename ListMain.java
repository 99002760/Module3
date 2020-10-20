package com.jo.training;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.jo.model.Employee;

public class ListMain {
           public static void main(String[] args) {
        	   List<Employee> employeeList=new ArrayList<>();
        	   Employee emp1=new Employee("Jo","Bnglr",40000.0);
        	   employeeList.add(emp1);
        	   employeeList.add(new Employee("Mini","Mysore",35000.0));
        	   employeeList.add(new Employee("Lak","Chennai",50000.0));
        	   employeeList.add(new Employee("Sree","Vellore",45000.0));
        	 //  System.out.println(employeeList);
        	   
        	   Iterator<Employee> it=employeeList.iterator();
        	   while(it.hasNext()) {
        		   Employee emp=it.next();
        		   System.out.println(emp);
        	   }
        	   for(Employee employ:employeeList)
        		   System.out.println(employ);
           }
}
