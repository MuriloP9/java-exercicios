package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;


    public Employee() {
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void IncreaseSalary(double percentage){
        salary += salary * percentage / 100;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", getSalary());
    }
}



