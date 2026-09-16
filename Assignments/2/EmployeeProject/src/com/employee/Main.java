package com.employee;

import java.io.*;
import java.util.*;

public class Main {
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "employees.dat";
    private static int currentIndex = -1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = getIntInput();
            switch (choice) {
                case 1: addEmployeeMenu(); break;
                case 2: displayMenu(); break;
                case 3: sortMenu(); break;
                case 4: saveToFile(); break;
                case 5: loadFromFile(); break;
                case 6:
                    System.out.println("Exiting Application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose 1-6.");
            }
        }
    }

    private static void addEmployeeMenu() {
        while (true) {
            System.out.println("\n--- Add an Employee ---");
            System.out.println("a. Manager");
            System.out.println("b. Engineer");
            System.out.println("c. Sales Person");
            System.out.println("d. Exit to Main Menu");
            System.out.print("Select an option (a-d): ");

            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("d")) break;

            if (!choice.equals("a") && !choice.equals("b") && !choice.equals("c")) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee ID: ");
            int id = getIntInput();
            System.out.print("Enter Salary: ");
            double salary = getDoubleInput();

            switch (choice) {
                case "a": employeeList.add(new Manager(name, id, salary)); break;
                case "b": employeeList.add(new Engineer(name, id, salary)); break;
                case "c": employeeList.add(new SalesPerson(name, id, salary)); break;
            }
            System.out.println("Employee added successfully!");
        }
    }

    private static void displayMenu() {
        while (true) {
            System.out.println("\n--- Display Menu ---");
            System.out.println("a. All Employees");
            System.out.println("b. First Employee");
            System.out.println("c. Next Employee");
            System.out.println("d. Previous Employee");
            System.out.println("e. Last Employee");
            System.out.println("f. Exit to Main Menu");
            System.out.print("Select an option (a-f): ");

            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("f")) break;

            if (employeeList.isEmpty()) {
                System.out.println("No records found. Please add or load employees first.");
                continue;
            }

            switch (choice) {
                case "a":
                    System.out.println("\n--- All Employees ---");
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.println("[" + i + "] " + employeeList.get(i));
                    }
                    break;
                case "b":
                    currentIndex = 0;
                    System.out.println("First Record: " + employeeList.get(currentIndex));
                    break;
                case "c":
                    if (currentIndex < 0) currentIndex = 0;
                    if (currentIndex < employeeList.size() - 1) {
                        currentIndex++;
                        System.out.println("Next Record: " + employeeList.get(currentIndex));
                    } else {
                        System.out.println("You are already at the last record.");
                    }
                    break;
                case "d":
                    if (currentIndex > 0) {
                        currentIndex--;
                        System.out.println("Previous Record: " + employeeList.get(currentIndex));
                    } else if (currentIndex == 0) {
                        System.out.println("You are at the first record.");
                    } else {
                        System.out.println("No active navigation sequence. Showing starting record.");
                        currentIndex = 0;
                        System.out.println(employeeList.get(currentIndex));
                    }
                    break;
                case "e":
                    currentIndex = employeeList.size() - 1;
                    System.out.println("Last Record: " + employeeList.get(currentIndex));
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void sortMenu() {
        while (true) {
            System.out.println("\n--- Sort & Filter Menu ---");
            System.out.println("a. All Managers");
            System.out.println("b. All Engineers");
            System.out.println("c. All Sales Person");
            System.out.println("d. All Employees Alphabetic order ascending");
            System.out.println("e. All Employees Alphabetic order descending");
            System.out.println("f. Exit to Main Menu");
            System.out.print("Select an option (a-f): ");

            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("f")) break;

            if (employeeList.isEmpty()) {
                System.out.println("No records found.");
                continue;
            }

            switch (choice) {
                case "a": filterByRole("Manager"); break;
                case "b": filterByRole("Engineer"); break;
                case "c": filterByRole("Sales Person"); break;
                case "d":
                    employeeList.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER));
                    System.out.println("Employees sorted alphabetically (Ascending).");
                    displayAll();
                    break;
                case "e":
                    employeeList.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER).reversed());
                    System.out.println("Employees sorted alphabetically (Descending).");
                    displayAll();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employeeList);
            System.out.println("Data saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("File " + FILE_NAME + " does not exist.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employeeList.clear();
            employeeList.addAll((List<Employee>) ois.readObject());
            currentIndex = -1;
            System.out.println("Data loaded successfully from " + FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    private static void displayAll() {
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    private static void filterByRole(String role) {
        System.out.println("\n--- All " + role + "s ---");
        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.getDesignation().equalsIgnoreCase(role)) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) System.out.println("No " + role + "s found.");
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }
    }

    private static double getDoubleInput() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid decimal number: ");
            }
        }
    }
}