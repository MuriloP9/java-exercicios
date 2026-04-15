package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, Double balance, String holder) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
