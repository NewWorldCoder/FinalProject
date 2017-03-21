package com.gc.controller;

/**
 * Created by Victoria Owen on 3/16/2017.
 */
public class Staff extends Person {

    private String school;
    private double pay;

    //build constructor

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    //getters and setters are next


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {

        return super.toString() + " " + school + " " + pay;
    }
}
