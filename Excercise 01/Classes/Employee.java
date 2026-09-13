class Employee {
    String name;
    int yearOfJoining;
    String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void display() {
        // Using String format for clean tabular alignment
        System.out.printf("%-10s %-18d %-20s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-18s %-20s\n", "Name", "Year of joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}