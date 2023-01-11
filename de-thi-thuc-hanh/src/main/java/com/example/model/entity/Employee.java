package com.example.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String Name;
    @Column(name = "age")

    private int age;
    @Column(name = "salary")

    private double Salary;
    @Column(name = "branch")

    private String Branch;

    public Employee() {
    }

    public Employee(String name, int age, double salary, String branch) {
        Name = name;
        this.age = age;
        Salary = salary;
        Branch = branch;
    }

    public Employee(Long id, String name, int age, double salary, String branch) {
        this.id = id;
        Name = name;
        this.age = age;
        Salary = salary;
        Branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
}
