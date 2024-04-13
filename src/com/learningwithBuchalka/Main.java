package com.learningwithBuchalka;


public class   Main {
    public static void main(String[] args) {
       Car porsche = new Car();
       Car holden = new Car();
       porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Account samAccount = new Account();
        samAccount.setNumber("00678765");
        samAccount.setBalance(0.00);
        samAccount.setCustomerName("Akinrinade Samson");
        samAccount.setCustomerEmailAddress("harkinsam@gmail.com");
        samAccount.setCustomerPhoneNumber("080-6886-4996");

//        samAccount.withdraw(100.0);

        samAccount.deposit(45);
//        samAccount.withdraw(100.0);
//
//        samAccount.deposit(51.0);
//        samAccount.withdraw(100.0);

    }

}
