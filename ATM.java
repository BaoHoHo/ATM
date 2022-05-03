/*
 * Functions for ATM
 */
package ATM;

public class ATM {
    // Declaring instance variables
    private String name;
    private String pin;
    private double balance;

    // Parameterized constructor
    public ATM(String name, String pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }


    // getters and setters
    public String getName() {
        return this.name;
    }


    public String getPin() {
        return this.pin;
    }


    public double getBalance() {
        return this.balance;
    }


    // This method will perform the deposit operation
    public void deposit(double amt) {
        this.balance = this.balance + amt;
    }


    // This method will perform the withdraw operation
    public void withdraw(double amt) {
        if (amt <= this.balance) {
            this.balance -= amt;
        }
        else {
            System.out.println(" the balance is getting low ");
        }
    }// end of withdraw
} // end of ATM class
