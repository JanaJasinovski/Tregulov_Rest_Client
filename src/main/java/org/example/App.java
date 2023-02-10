package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = applicationContext.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee employeeById = communication.getEmployee(3);
        System.out.println(employeeById);

//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 500);
//
//        employee.setId(11);
//        employee.setSalary(1200);
//        employee.setDepartment("IT");
//
//        communication.saveEmployee(employee);

        communication.deleteEmployee(11);
    }
}
