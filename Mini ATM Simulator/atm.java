import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        System.out.println("Please Login or Signup");
        System.out.println("Today's news: 'Rust is King!'");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Login(1) or Signup(2): ");
        int num_option = sc1.nextInt();

        if (num_option == 1) {
            // login
            Scanner sc2= new Scanner(System.in);
            System.out.print("Enter Username ");
            String username = sc2.nextLine();

            Scanner sc3= new Scanner(System.in);
            System.out.println("Enter Password: ");
            String password = sc3.nextLine();


        } else {
            // signup
            Scanner sc2= new Scanner(System.in);
            System.out.print("Enter Username ");
            String username = sc2.nextLine();

            Scanner sc3= new Scanner(System.in);
            System.out.println("Enter Password: ");
            String password = sc3.nextLine();
        }
        
    }
}
