package com.hdfc.employee.entity;

//import com.hdfc.employee.config.AttributeConverter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "EmployeeID")
    private int employeeId;

    @Column(name = "EmployeeName")
    @NotNull
    private String employeeName;
    @Column(name = "DateOfBirth")
    @NotNull
    //@Convert(converter = AttributeConverter.class)
    private LocalDate dateOfBirth;

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
