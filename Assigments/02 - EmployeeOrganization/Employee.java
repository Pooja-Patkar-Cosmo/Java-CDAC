package org.pooja;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String name;
    protected String address;
    protected int age;
    protected boolean gender;
    protected float basicSalary;

    public Employee(String name, String address, int age, boolean gender, float basicSalary) {
        super();
        this.name = name;
        this.address = address;
        setAge(age);
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65)
            this.age = 21;
        else
            this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Basic Salary: " + basicSalary);
    }
}