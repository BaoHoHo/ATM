/*
 * Format and test the ATM
 */
package ATM;

import java.util.ArrayList;
import java.util.Scanner; // importing scanner class to create input

public class ATMTest {

    /**
     * The Main method that will run the test ATM in the console
     * @param args
     */
    public static void main(String[] args) {
        // write program here
        // declare variables
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String name, pin = "dumb";
        // declare balance here
        double balance = 100;

        ArrayList<ATM> data = new ArrayList<ATM>();
        int customer = 2;

        // start infinite loop
        // welcome customer
        // prompt for pin
        // find a match
        // if match is found then display menu, and options to withdraw,
        // deposit,
        // view balance?
        // if no match for pin, say so and go to top of loop
        // create an instance of ATM
        // create an instance of ATM
        for (int i = 1; i <= customer; i++) {
            // prompt and read customer information
            System.out.print("Enter customer " + i + " name: ");
            name = input.nextLine();
            System.out.println("You entered " + name);
            // same for pin and balance
            System.out.print("Enter customer " + i + " pin: ");
            pin = input.nextLine();
            System.out.println("You entered " + pin);
            System.out.print("Enter customer " + i + " balance: ");
            balance = input.nextDouble();
            System.out.println("You entered " + balance);

            ATM customerInfo = new ATM(name, pin, balance);
            data.add(customerInfo);
            input.nextLine();
        }

        while (true) {
            System.out.println("=====================");
            System.out.println("Welcome to Bao Bank");
            System.out.print("Enter pin: ");
            String currentPin = input.nextLine();
            boolean test = false;
            int index = 0;
            for (ATM each : data) {
                if (each.getPin().equals(currentPin)) {
                    test = true;
                    // user = each;
                    index = data.indexOf(each);
                    break;
                }
            }

            if (!test) {
                System.out.println("Wrong pin!");
            }
            else {
                System.out.println("Your balance is: " + data.get(index)
                    .getBalance());
                System.out.printf("%-15s%5s%10s%n", "Deposit", "Withdraw",
                    "Exit");
                System.out.print("Enter your option: ");
                String option = input.nextLine();
                System.out.println("You entered " + option);
                if (option.equals("deposit")) {
                    System.out.print("Enter your deposit amount: ");
                    double deposit = input.nextDouble();
                    System.out.println("You entered " + deposit);
                    data.get(index).deposit(deposit);
                    System.out.println("Your balance is: " + data.get(index)
                        .getBalance());
                }
                else if (option.equals("withdraw"))// withdraw)
                {
                    System.out.print("Enter your withdraw amount: ");
                    double withdraw = input.nextDouble();
                    data.get(index).withdraw(withdraw);
                    System.out.println("You entered " + withdraw);
                    System.out.println("Your balance is: " + data.get(index)
                        .getBalance());
                }
            }
            input.nextLine();
            // }
        } // end infinite loop
    }// end of main
}// end of class
