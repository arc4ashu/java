package ex.lambda.expression.model;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String fname;
    private String lname;
    private LocalDate dob;
    private String adress;
    private Double salary;

    public Employee() {

    }

    public Employee(String fname, String lname, LocalDate dob, String adress, Double salary) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.adress = adress;
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob=" + dob +
                ", adress='" + adress + '\'' +
                ", salary=" + salary +
                '}';
    }
}
