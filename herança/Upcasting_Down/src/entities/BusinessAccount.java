package entities;

public class BusinessAccount extends Account{ /* Acabei de declarar com 'extends' que essa classe herda as funcionalidades de Account*/

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, Double balance, String holder, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
