class Employee2 {
    double salary;
    int hoursPerDay;

    // 1 - getInfo() takes salary and hours of work per day as parameters
    public void getInfo(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    // 2 - addSal() adds $10 to salary if it is less than $500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // 3 - addWork() adds $5 to salary if work hours > 6
    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }

    public double getFinalSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee2 emp = new Employee2();

        // Example: Initial salary $450, working 8 hours/day
        emp.getInfo(450, 8);

        // Apply rules
        emp.addSal();
        emp.addWork();

        System.out.println("Final Salary: $" + emp.getFinalSalary());
    }
}