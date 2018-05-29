package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer("Sergei", 1000000.0, "sergei@email.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmailAddress());
        System.out.println(customer1.getCreditLimit());

        System.out.println("************************************************");

        VipCustomer customer2 = new VipCustomer("Alex", "alex@email.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmailAddress());
        System.out.println(customer2.getCreditLimit());

        System.out.println("************************************************");

        VipCustomer customer3 = new VipCustomer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
        System.out.println(customer3.getCreditLimit());    }
}
