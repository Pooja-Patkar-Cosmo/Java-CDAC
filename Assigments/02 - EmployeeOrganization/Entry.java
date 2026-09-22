package org.pooja;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Entry {

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Employee[] arrEmployee = new Employee[50];
        int count = 0;
        int currentIndex = -1;

        int mainChoice = 0;

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = ConsoleInput.getInt();

            switch (mainChoice) {
                case 1:
                    count = handleAddMenu(arrEmployee, count);
                    if (count > 0 && currentIndex == -1) {
                        currentIndex = 0;
                    }
                    break;

                case 2:
                    currentIndex = handleDisplayMenu(arrEmployee, count, currentIndex);
                    break;

                case 3:
                    handleSortMenu(arrEmployee, count);
                    break;

                case 4:
                    saveToFile(arrEmployee, count);
                    break;

                case 5:
                    count = loadFromFile(arrEmployee);
                    if (count > 0) {
                        currentIndex = 0;
                    } else {
                        currentIndex = -1;
                    }
                    break;

                case 6:
                    System.out.println("Exiting Application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please enter a number between 1 and 6.");
            }

        } while (mainChoice != 6);
    }

    // ==================== SUB-MENU: ADD EMPLOYEE ====================
    private static int handleAddMenu(Employee[] arrEmployee, int count) {
        if (count >= arrEmployee.length) {
            System.out.println("Error: Organization capacity full!");
            return count;
        }

        int choice = 0;
        do {
            System.out.println("\n--- Add Employee Menu ---");
            System.out.println("1. Manager");
            System.out.println("2. Engineer");
            System.out.println("3. Sales Person");
            System.out.println("4. Exit to Main Menu");
            System.out.print("Enter choice: ");
            choice = ConsoleInput.getInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter name: ");
                String name = ConsoleInput.getString();
                System.out.print("Enter address: ");
                String address = ConsoleInput.getString();
                System.out.print("Enter age: ");
                int age = ConsoleInput.getInt();
                System.out.print("Enter gender (true for Male / false for Female): ");
                boolean gender = ConsoleInput.getBoolean();
                System.out.print("Enter basic salary: ");
                float basicSalary = ConsoleInput.getFloat();

                switch (choice) {
                    case 1:
                        System.out.print("Enter HRA: ");
                        float hra = ConsoleInput.getFloat();
                        arrEmployee[count++] = new Manager(name, address, age, gender, basicSalary, hra);
                        System.out.println("Manager added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Overtime: ");
                        float overtime = ConsoleInput.getFloat();
                        arrEmployee[count++] = new Engineer(name, address, age, gender, basicSalary, overtime);
                        System.out.println("Engineer added successfully!");
                        break;

                    case 3:
                        System.out.print("Enter Commission: ");
                        float commission = ConsoleInput.getFloat();
                        arrEmployee[count++] = new SalesPerson(name, address, age, gender, basicSalary, commission);
                        System.out.println("Sales Person added successfully!");
                        break;
                }
                return count;
            } else if (choice != 4) {
                System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 4);

        return count;
    }

    // ==================== SUB-MENU: DISPLAY ====================
    private static int handleDisplayMenu(Employee[] arrEmployee, int count, int currentIndex) {
        if (count == 0) {
            System.out.println("No employee records found.");
            return -1;
        }

        int choice = 0;
        do {
            System.out.println("\n--- Display Menu ---");
            System.out.println("1. All Employees");
            System.out.println("2. First Employee");
            System.out.println("3. Next Employee");
            System.out.println("4. Previous Employee");
            System.out.println("5. Last Employee");
            System.out.println("6. Exit to Main Menu");
            System.out.print("Enter choice: ");
            choice = ConsoleInput.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\n=== All Employees ===");
                    for (int i = 0; i < count; i++) {
                        System.out.println("------------------------------------");
                        arrEmployee[i].displayDetails();
                    }
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    currentIndex = 0;
                    System.out.println("\n=== First Employee ===");
                    arrEmployee[currentIndex].displayDetails();
                    break;

                case 3:
                    if (currentIndex < count - 1) {
                        currentIndex++;
                        System.out.println("\n=== Next Employee ===");
                        arrEmployee[currentIndex].displayDetails();
                    } else {
                        System.out.println("Already at the last employee record!");
                    }
                    break;

                case 4:
                    if (currentIndex > 0) {
                        currentIndex--;
                        System.out.println("\n=== Previous Employee ===");
                        arrEmployee[currentIndex].displayDetails();
                    } else {
                        System.out.println("Already at the first employee record!");
                    }
                    break;

                case 5:
                    currentIndex = count - 1;
                    System.out.println("\n=== Last Employee ===");
                    arrEmployee[currentIndex].displayDetails();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 6);

        return currentIndex;
    }

    // ==================== SUB-MENU: SORT ====================
    private static void handleSortMenu(Employee[] arrEmployee, int count) {
        if (count == 0) {
            System.out.println("No employee records to sort.");
            return;
        }

        int choice = 0;
        do {
            System.out.println("\n--- Sort Menu ---");
            System.out.println("1. All Managers");
            System.out.println("2. All Engineers");
            System.out.println("3. All Sales Persons");
            System.out.println("4. All Employees Alphabetic Order Ascending");
            System.out.println("5. All Employees Alphabetic Order Descending");
            System.out.println("6. Exit to Main Menu");
            System.out.print("Enter choice: ");
            choice = ConsoleInput.getInt();

            switch (choice) {
                case 1:
                    displayFilteredByType(arrEmployee, count, Manager.class);
                    break;

                case 2:
                    displayFilteredByType(arrEmployee, count, Engineer.class);
                    break;

                case 3:
                    displayFilteredByType(arrEmployee, count, SalesPerson.class);
                    break;

                case 4:
                    bubbleSortByName(arrEmployee, count, true);
                    System.out.println("Employees sorted in Ascending order by Name!");
                    break;

                case 5:
                    bubbleSortByName(arrEmployee, count, false);
                    System.out.println("Employees sorted in Descending order by Name!");
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 6);
    }

    private static void displayFilteredByType(Employee[] arrEmployee, int count, Class<?> targetClass) {
        System.out.println("\n=== Filtered View: " + targetClass.getSimpleName() + "s ===");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (targetClass.isInstance(arrEmployee[i])) {
                System.out.println("------------------------------------");
                arrEmployee[i].displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No records found for " + targetClass.getSimpleName() + ".");
        } else {
            System.out.println("------------------------------------");
        }
    }

    // ==================== MANUAL BUBBLE SORT ====================
    private static void bubbleSortByName(Employee[] arrEmployee, int count, boolean ascending) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                int comparison = arrEmployee[j].getName().compareToIgnoreCase(arrEmployee[j + 1].getName());
                boolean shouldSwap = ascending ? (comparison > 0) : (comparison < 0);

                if (shouldSwap) {
                    Employee temp = arrEmployee[j];
                    arrEmployee[j] = arrEmployee[j + 1];
                    arrEmployee[j + 1] = temp;
                }
            }
        }
    }

    // ==================== FILE I/O OPERATIONS ====================
    private static void saveToFile(Employee[] arrEmployee, int count) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeInt(count);
            for (int i = 0; i < count; i++) {
                oos.writeObject(arrEmployee[i]);
            }
            System.out.println("Successfully saved " + count + " employee record(s) to " + FILE_NAME);
        } catch (Exception e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    private static int loadFromFile(Employee[] arrEmployee) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            int loadedCount = ois.readInt();
            for (int i = 0; i < loadedCount; i++) {
                arrEmployee[i] = (Employee) ois.readObject();
            }
            System.out.println("Successfully loaded " + loadedCount + " employee record(s) from " + FILE_NAME);
            return loadedCount;
        } catch (Exception e) {
            System.out.println("Error loading from file: " + e.getMessage());
            return 0;
        }
    }
}




/*
1.  Add
2.  Display
3.  Delete
4.  Sort
5.  Save
6.  Lo]7.  Exit

1. Add
    1. Manager
    2. Engineer
    3. Sales Person
    4. exit

4. Sort
    a. By Name Ascending
    b. By Name descending
    c. By Designation (not to be implemented)
    d. Exit
*/



/*


Create a menu based console application for holding the data of the Employees in an Organisation.
The details of the Employee entered by the user from the console will be stored in array of obj which can be
then traversed by the user by choosing the appropriate menu selection.
Each sub menu of the section will loop until the Exit to Main Menu option is not selected.

1. Add an Employee
	a. Manager
	b. Engineer
	c. Sales Person
	d. Exit to Main Menu
2. Display
	a. All Employees
	b. First Employee
	c. Next Employee
	d. Previous Employee
	e. Last Employee
	f. Exit to Main Menu
3. Sort
	a. All Managers
	b. All Engineers
	c. All Sales Person
	d. All Employees Alphabetic order ascending
	e. All Employees Alphabetic order descending
	f. Exit to Main Menu
4. Save to File
5. Load from File
6. Exit


****************************************************************************

Base Class: Employee
    a) Name[cite: 1]
    b) Address[cite: 1]
    c) Age[cite: 1]
    d) Gender[cite: 1]
    e) Basic Salary[cite: 1]

Derived Class 1: Manager (extends Employee)
    Inherits fields a to e
    f) HRA (House Rent Allowance)[cite: 1]

Derived Class 2: Engineer (extends Employee)
    Inherits fields a to e
    f) Overtime[cite: 1]

 Derived Class 3: SalesPerson (extends Employee)
    Inherits fields a to e
    f) Commission[cite: 1]


 */