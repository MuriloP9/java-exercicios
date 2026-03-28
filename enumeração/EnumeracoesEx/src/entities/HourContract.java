package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    HourContract(){

    }
    public HourContract(LocalDate date, Integer hours, Double valuePerHour) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

}
