package entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee(){

    }

    public Employee(Double valuePerHour, Integer hours, String name) {
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double payment(){
        return hours * valuePerHour;
    }
}
