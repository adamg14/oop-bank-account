import java.util.ArrayList;
abstract class BankAccount{
    // constructor, deposit, withdraw, check balance, calculate interest (savings), transfer funds, close account, loan request, change password , view transaction history, 
    private String accountHolderName;
    private double accountBalance;
    private int accountNumber; 
    private int pin;
    private ArrayList<String> transactions = new ArrayList<String>();

    // constructor function
    public BankAccount(String _accountHolderName, int _accountNumber, int _pin){
        this.accountHolderName = _accountHolderName;
        this.accountNumber = _accountNumber;
        this.pin = _pin;
    }

    public void deposit(double amount){
        this.accountBalance += amount;
    }

    public void withdraw(double amount){
        if (this.accountBalance < amount){
            System.out.println("Rejected");
        }else{
            this.accountBalance -= amount;
        }
    }

    public void transferFunds(int accountNumber, double amount){

    };

    // function that validates the user's pin
    public 
    // getter function
    public Int getAccountNumber(){
        return this.accountNumber;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void getAccountInformation(){
        // print out account information here
    }
}