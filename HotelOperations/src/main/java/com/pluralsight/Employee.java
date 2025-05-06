package com.pluralsight;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    // Private instance variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double clockedIn;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters for basic fields
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Derived getters

    // Get regular hours (up to 40)
    public double getRegularHours() {
        if (this.getHoursWorked() > 40) {
            return 40;
        } else {
            return this.getHoursWorked();
        }
    }

    // Get overtime hours (hours over 40)
    public double getOvertimeHours() {
        if (this.getHoursWorked() > 40) {
            return this.getHoursWorked() - 40;
        } else {
            return 0;
        }
    }

    // Calculate total pay including overtime
    public double getTotalPay() {
        double regularPay = this.getRegularHours() * this.getPayRate();
        double overtimePay = this.getOvertimeHours() * this.getPayRate() * 1.5;
        return regularPay + overtimePay;
    }

    public void punchIn() {
        this.clockedIn = time;
    }

    public void punchIn(double time) {
        LocalDateTime now = LocalDateTime.now();
        double hour = now.getHour();
        double minutes = now.getMinute();
        double seconds = now.getSecond();
        double convert =

    }

    public void punchOut() {
        double worked = time - clockedIn;
        this.hoursWorked += worked;
    }

    public void punchOut(double time) {

    }



}
