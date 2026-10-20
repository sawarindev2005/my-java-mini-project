package chap4;

public class EmployeeInfo {
    private String id;
    private String name;
    private String surname;
    private int position;
    private double salary;
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
