package com.gc.models;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Victoria Owen on 3/20/2017.
 */
@Entity
@Table(name = "student", schema = "pss", catalog = "")
public class StudentEntity {
    private int studentId;
    private String name;
    private String address;
    private String program;
    private String year;
    private BigDecimal fee;

    @Id
    @Column(name = "StudentID", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
    @Column(name = "Program", nullable = false, length = 50)
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Basic
    @Column(name = "Year", nullable = false, length = 4)
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "Fee", nullable = false, precision = 2)
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (studentId != that.studentId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (program != null ? !program.equals(that.program) : that.program != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (program != null ? program.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        return result;
    }
}
