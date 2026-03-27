package entities;

public class Account {
    private int accountNumber;
    private String holder;
    private double balance;

    public Account(){

    }

    public Account (int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holder = holder;
        depositValue(initialDeposit);// Encapsulando regra de negócios, evita futuro debug
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public void depositValue(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount +  5.00 ;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getDeposit() {
        return balance;
    }


    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getHolder(){
        return holder;
    }

    public String toString(){
        return "Account " + accountNumber + ", " + "Holder: " + holder + "," + " Balance: $ "  + String.format("%.2f", getDeposit());
    }


}
