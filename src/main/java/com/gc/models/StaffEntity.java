package com.gc.models;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Victoria Owen on 3/20/2017.
 */
@Entity
@Table(name = "staff", schema = "pss", catalog = "")
public class StaffEntity {
    private int staffId;
    private String name;
    private String address;
    private String school;
    private BigDecimal monthlySalary;

    @Id
    @Column(name = "StaffID", nullable = false)
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Address", nullable = false, length = 70)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "School", nullable = false, length = 70)
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "MonthlySalary", nullable = false, precision = 2)
    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(BigDecimal monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffEntity that = (StaffEntity) o;

        if (staffId != that.staffId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (monthlySalary != null ? !monthlySalary.equals(that.monthlySalary) : that.monthlySalary != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = staffId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (monthlySalary != null ? monthlySalary.hashCode() : 0);
        return result;
    }
}
