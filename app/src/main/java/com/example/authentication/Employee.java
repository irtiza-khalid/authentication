package com.example.authentication;
public class Employee {
    // string variable for
    // storing employee name.
    private String name;
    // string variable for storing
    // employee contact number
    private String city;
    // string variable for storing
    // employee address.
    private String contact;
    // an empty constructor is
    // required when using
    // Firebase Realtime Database.
    public Employee() {

    }
    // created getter and setter methods
    // for all our variables.
    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public String getEmployeeCity() {
        return city;
    }

    public void setEmployeeCity(String city) {
        this.city = city;
    }

    public String getEmployeecontact() {
        return contact;
    }

    public void setEmployeeAddress(String contact) {
        this.contact = contact;
    }
}

