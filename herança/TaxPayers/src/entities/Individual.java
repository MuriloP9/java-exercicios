package entities;

public class Individual extends TaxPayer{

        private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax;
        tax = (getAnualIncome() < 20000.00) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        tax -= getHealthExpenditures() * 0.5;
        if (tax < 0.0){
            tax = 0.0;
        }
        return tax;
    }
}
