import java.util.Scanner;

class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    // Accessors (Getters) and Mutators (Setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class PrimeMembers extends Member {
    private int joiningYear;
    private double joiningFees;
    private boolean isActive;

    // Accessors and Mutators
    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public double getJoiningFees() {
        return joiningFees;
    }

    public void setJoiningFees(double joiningFees) {
        this.joiningFees = joiningFees;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void display() {
        System.out.println("\n--- Prime Member Details ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        printSalary();
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Is Active: " + isActive);
    }
}

public class MemberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Standard Member Input and Display
        System.out.println("Enter details for standard Member:");
        Member member = new Member();

        System.out.print("Enter Name: ");
        member.setName(scanner.nextLine());

        System.out.print("Enter Age: ");
        member.setAge(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Phone Number: ");
        member.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Address: ");
        member.setAddress(scanner.nextLine());

        System.out.print("Enter Salary: ");
        member.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume newline

        System.out.println("\n--- Standard Member Details ---");
        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Phone Number: " + member.getPhoneNumber());
        System.out.println("Address: " + member.getAddress());
        member.printSalary();

        // Prime Member Input and Display
        System.out.println("\nEnter details for Prime Member:");
        PrimeMembers primeMember = new PrimeMembers();

        System.out.print("Enter Name: ");
        primeMember.setName(scanner.nextLine());

        System.out.print("Enter Age: ");
        primeMember.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        primeMember.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Address: ");
        primeMember.setAddress(scanner.nextLine());

        System.out.print("Enter Salary: ");
        primeMember.setSalary(scanner.nextDouble());

        System.out.print("Enter Joining Year: ");
        primeMember.setJoiningYear(scanner.nextInt());

        System.out.print("Enter Joining Fees: ");
        primeMember.setJoiningFees(scanner.nextDouble());

        System.out.print("Is Active (true/false): ");
        primeMember.setIsActive(scanner.nextBoolean());

        primeMember.display();

        scanner.close();
    }
}