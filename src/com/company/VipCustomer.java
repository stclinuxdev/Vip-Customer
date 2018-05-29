package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 50000.0, emailAddress);
    }

    public VipCustomer() {
        this("Default Customer Name", 100.0, "Default Customer Email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
