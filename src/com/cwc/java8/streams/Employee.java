package com.cwc.java8.streams;


public class Employee {

    private int empId;
    private String empName;
    private String depName;
    private int salary;
    private int date_of_joining;
    private String gender;
    private int age;

    public Employee() {
    }

    public Employee(int empId, String empName, String depName, int salary, int date_of_joining, String gender,int age) {
        this.empId = empId;
        this.empName = empName;
        this.depName = depName;
        this.salary = salary;
        this.date_of_joining = date_of_joining;
        this.gender = gender;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(int date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", depName='" + depName + '\'' +
                ", salary=" + salary +
                ", date_of_joining=" + date_of_joining +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
