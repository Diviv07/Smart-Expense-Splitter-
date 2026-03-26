// Smart Expense Splitter Project
// This program calculates fair expense distribution among users
// and minimizes the number of transactions.
import java.util.*;
// This class stores user details
class User {
    String name;
    double balance;
// Constructor to initialize user with name and zero balance
    User(String name) {
        this.name = name;
        this.balance = 0;
    }
}
// Main class that handles expense splitting and transaction minimization
class ExpenseSplitter {
// This method minimizes the number of transactions required to settle debts
// It uses a greedy approach by matching the maximum creditor with the maximum debtor
    static void minimizeTransactions(List<User> users) {
        while (true) {
            User maxCreditor = null;
            User maxDebtor = null;
// Identify the user with maximum credit and maximum debt
            for (User u : users) {
                if (maxCreditor == null || u.balance > maxCreditor.balance)
                    maxCreditor = u;
                if (maxDebtor == null || u.balance < maxDebtor.balance)
                    maxDebtor = u;
            }
// If all balances are settled, exit loop
            if (maxCreditor.balance == 0 && maxDebtor.balance == 0)
                break;
// Determine minimum amount to be transferred between debtor and creditor
            double amount = Math.min(maxCreditor.balance, -maxDebtor.balance);

            maxCreditor.balance -= amount;
            maxDebtor.balance += amount;
// Display the transaction details
            System.out.println(maxDebtor.name + " pays " + amount + " to " + maxCreditor.name);
        }
    }
// Main method: entry point of the program
// Handles user input and performs expense calculations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<User> users = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            users.add(new User(name));
        }

        System.out.print("Enter total expense: ");
        double total = sc.nextDouble();
// Calculate equal share of each user
        double split = total / n;

        System.out.println("\nEach person should pay: " + split);
// Update balance: positive means user should receive money, negative means user owes money
        for (User u : users) {
            System.out.print("Enter amount paid by " + u.name + ": ");
            double paid = sc.nextDouble();
            u.balance = paid - split;
        }

        System.out.println("\n--- Transactions ---");
        minimizeTransactions(users);

        sc.close();
    }
}
