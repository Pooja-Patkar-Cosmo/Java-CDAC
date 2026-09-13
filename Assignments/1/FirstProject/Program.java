

public class Program {

    public static void main(String[] args) {
        Date objDate = new Date();
        int choice = 0;

        // do-while loop ensures the menu is shown at least once and continues until user chooses option 7
        do {
            System.out.println("\n=================================");
            System.out.println("Date Menu");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates (not implement)");
            System.out.println("7. Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice: ");

            choice = ConsoleInput.getInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the day: ");
                    int day = ConsoleInput.getInt();
                    System.out.print("Enter the month: ");
                    int month = ConsoleInput.getInt();
                    System.out.print("Enter the year: ");
                    int year = ConsoleInput.getInt();

                    objDate.setDate(day, month, year);
                    System.out.println("Date updated successfully!");
                    break;

                case 2:
                    System.out.print("Enter days to add: ");
                    int daysToAdd = ConsoleInput.getInt();
                    objDate.addDays(daysToAdd);
                    System.out.println("Days added successfully!");
                    break;

                case 3:
                    System.out.print("Enter months to add: ");
                    int monthsToAdd = ConsoleInput.getInt();
                    objDate.addMonths(monthsToAdd);
                    System.out.println("Months added successfully!");
                    break;

                case 4:
                    System.out.print("Enter years to add: ");
                    int yearsToAdd = ConsoleInput.getInt();
                    objDate.addYears(yearsToAdd);
                    System.out.println("Years added successfully!");
                    break;

                case 5:
                    objDate.display();
                    break;

                case 6:
                    System.out.println("Compare Dates option is currently not implemented.");
                    break;

                case 7:
                    System.out.println("Exiting Program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 7.");
            }

        } while (choice != 7);
    }
}
