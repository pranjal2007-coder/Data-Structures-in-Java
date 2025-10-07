package com.Pranjal.Day51;

class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }


    public String toString() {
        return "Employee Details: Name: " + name + "ID: " + id + "Department: " + department;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee("Pranjal", 101, "Computer Science");
        System.out.println(emp);
    }
}




