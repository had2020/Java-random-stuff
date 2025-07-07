import java.util.Scanner;

class Account {
    int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }
}

public class atm {

    public static void main(String[] args) {
        String active_user = "";
        String active_pass = "";

        Account active_account = new Account();


        String[] usernames = {""};
        String[] passwords = {""};

        System.out.println("Please Login or Signup");
        System.out.println("Today's news: 'Rust is King!'");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Login(1) or Signup(2): ");
        int num_option = sc1.nextInt();

        if (num_option == 1) {
            // login
            while (true) {
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter Username ");
                String username = sc2.nextLine();

                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter Password: ");
                String password = sc3.nextLine();

                boolean valid_username = false;
                boolean vaild_password = false;

                for (String i : usernames) {
                    if (username == i) {
                        valid_username = true;
                    }
                }

                for (String i : passwords) {
                    if (password == i) {
                        valid_username = true;
                    }
                }

                if (vaild_password || vaild_password) {
                    System.out.println("Invaild User");
                } else {
                    active_user = username;
                    active_pass = password;
                }
            }

        } else {
            // signup
            while (true) {
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter Username ");
                String username = sc2.nextLine();

                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter Password: ");
                String password = sc3.nextLine();

                boolean signup_error = false;

                for (String i : usernames) {
                    if (username == i) {
                        signup_error = true;
                    }
                }

                for (String i : passwords) {
                    if (password == i) {
                        signup_error = true;
                    }
                }

                if (signup_error == false) {
                    active_user = username;
                    active_pass = password;
                    break;
                }
            }
        }
        
        while ( true) {
            System.out.print("Welcome ");
            System.out.println(active_user);

            // Menu
            System.out.println("What would you like to do?");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            Scanner sc4 = new Scanner(System.in);
            System.out.println("Option: ");
            int choice = sc4.nextInt();

            if (choice == 1) {
                System.out.print("Balance: ");
                System.out.println(active_account.balance);

            } else if (choice == 2) {
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Amount to deposit: ");
                int amount = sc5.nextInt();
                active_account.deposit(amount);

            } else if (choice == 3) {
                Scanner sc6 = new Scanner(System.in);
                System.out.println("Amount to withdraw: ");
                int amount = sc6.nextInt();
                active_account.withdraw(amount);

            } else if (choice == 4) {
                break;
            }
        }
    }
}
