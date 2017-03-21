package com.gc.controller;

/**
 * Created by Victoria Owen on 3/16/2017.
 */
public class Student extends Person {
    private String program; //instance varibles above
    private int year;
    private double fee;


    public Student(String name, String address, String program, int year, double fee) {   //next lines are constructor
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString(){
        return super.toString() + " " + program;

    }
}


