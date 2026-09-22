package org.pooja;

public class Manager extends Employee {
    private static final long serialVersionUID = 1L;

    protected float hra;

    public Manager(String name, String address, int age, boolean gender, float basicSalary, float hra) {
        super(name, address, age, gender, basicSalary);
        this.hra = hra;
    }

    public float getHra() {
        return hra;
    }

    public void setHra(float hra) {
        this.hra = hra;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("HRA: " + hra);
        System.out.println("Designation: Manager");
    }
}