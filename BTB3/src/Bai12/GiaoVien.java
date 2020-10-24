package Bai12;

import java.time.Year;

//Nguyễn Khắc Tài - CT030147

public class GiaoVien extends Nguoi {
    private String id;
    private double salary;
    private double bonus;
    private double penalty;
    private double realSalary;

    public GiaoVien(String name, Year yob, String hometown, String id, double salary, double bonus, double penalty) {
        super(name, yob, hometown);
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.realSalary = this.salary + this.bonus - this.penalty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yob='" + yob + '\'' +
                ", hometown=" + hometown +
                '}';
    }
}
