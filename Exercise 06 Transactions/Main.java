import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Transaction> transactions = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("--- Enter Details for 5 Transactions ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nTransaction #" + i + ":");
            System.out.print("Enter Tx ID (int): ");
            int id = scanner.nextInt();

            System.out.print("Enter Tx Date (yyyy-MM-dd): ");
            String dateStr = scanner.next();
            LocalDate date = LocalDate.parse(dateStr, formatter);

            System.out.print("Enter Tx Amount (float): ");
            float amount = scanner.nextFloat();

            System.out.print("Enter Tx Status (true/false): ");
            boolean status = scanner.nextBoolean();

            System.out.print("Enter Tx Arrears (true/false): ");
            boolean arrears = scanner.nextBoolean();

            transactions.add(new Transaction(id, date, amount, status, arrears));
        }

        System.out.println("\n==================================================");

        // 1. Lambda Expression: Filter transactions where txAmount > 5000
        List<Transaction> highValueTxs = transactions.stream()
                .filter(tx -> tx.getTxAmount() > 5000)
                .collect(Collectors.toList());

        System.out.println("\n1. Transactions with Amount > 5000:");
        highValueTxs.forEach(System.out::println);

        // 2. Lambda Expression: Filter transactions where txStatus is false
        List<Transaction> failedTxs = transactions.stream()
                .filter(tx -> !tx.isTxStatus())
                .collect(Collectors.toList());

        System.out.println("\n2. Transactions with txStatus = false:");
        failedTxs.forEach(System.out::println);

        // 3. Lambda Expression: Calculate Amount Due
        Function<Transaction, Float> calculateAmountDue = tx -> {
            if (tx.isTxArrears()) {
                return tx.getTxAmount() + 500f + (0.18f * tx.getTxAmount());
            } else {
                return tx.getTxAmount();
            }
        };

        System.out.println("\n3. Generated Amount Due for all Transactions:");
        for (Transaction tx : transactions) {
            float amountDue = calculateAmountDue.apply(tx);
            System.out.println("Tx ID: " + tx.getTxId() + " | Arrears: " + tx.isTxArrears() +
                    " | Original: Rs. " + tx.getTxAmount() + " | Amount Due: Rs. " + amountDue);
        }

        scanner.close();
    }
}