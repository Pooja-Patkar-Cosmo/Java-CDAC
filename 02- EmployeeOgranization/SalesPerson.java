package org.pooja;

public class SalesPerson extends Employee {
    private static final long serialVersionUID = 1L;

    protected float commission;

    public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float commission) {
        super(name, address, age, gender, basicSalary);
        this.commission = commission;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Commission: " + commission);
        System.out.println("Designation: Sales Person");
    }
}