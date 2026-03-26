import java.util.*;

class User {
    String name;
    double balance;

    User(String name) {
        this.name = name;
        this.balance = 0;
    }
}

class ExpenseSplitter {

    static void minimizeTransactions(List<User> users) {
        while (true) {
            User maxCreditor = null;
            User maxDebtor = null;

            for (User u : users) {
                if (maxCreditor == null || u.balance > maxCreditor.balance)
                    maxCreditor = u;
                if (maxDebtor == null || u.balance < maxDebtor.balance)
                    maxDebtor = u;
            }

            if (maxCreditor.balance == 0 && maxDebtor.balance == 0)
                break;

            double amount = Math.min(maxCreditor.balance, -maxDebtor.balance);

            maxCreditor.balance -= amount;
            maxDebtor.balance += amount;

            System.out.println(maxDebtor.name + " pays " + amount + " to " + maxCreditor.name);
        }
    }

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

        double split = total / n;

        System.out.println("\nEach person should pay: " + split);

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