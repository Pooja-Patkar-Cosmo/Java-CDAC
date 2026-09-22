package org.pooja;

public class Engineer extends Employee {
    private static final long serialVersionUID = 1L;

    protected float overTime;

    public Engineer(String name, String address, int age, boolean gender, float basicSalary, float overTime) {
        super(name, address, age, gender, basicSalary);
        this.overTime = overTime;
    }

    public float getOverTime() {
        return overTime;
    }

    public void setOverTime(float overTime) {
        this.overTime = overTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("OverTime: " + overTime);
        System.out.println("Designation: Engineer");
    }
}