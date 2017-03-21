package com.gc.controller;

/**
 * Created by Victoria Owen on 3/16/2017.
 */

//declare variables for class
public class Person {
    private String name;
    private String address;

    //build contructor
    public Person(String name, String address) {  //this a constructor that helps to build objects
        this.name = name;
        this.address = address;
    }

    //getters and setters are next
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //Returns a string representation of the object. In general, the toString
    // method returns a string that "textually represents" this object.
    @Override
    public String toString(){

        return name + " " + address;

    }
}
