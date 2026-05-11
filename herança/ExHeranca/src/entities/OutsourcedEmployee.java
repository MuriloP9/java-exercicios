package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;


    public OutsourcedEmployee(Double additionalCharge) {
        super();
    }

    public OutsourcedEmployee(Double valuePerHour, Integer hours, String name, Double additionalCharge) {
        super(valuePerHour, hours, name);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
