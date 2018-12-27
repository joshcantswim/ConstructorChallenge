package com.Josh;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account();
        bobsAccount.setCustomerPhone("513");
        bobsAccount.setBalance(400);
        bobsAccount.setCustomerName("Bob");
        bobsAccount.setCustomerEmail("bob@gmail.com");
        bobsAccount.setNumber("12345");
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(55.0);
        bobsAccount.withdrawal(100.0);

    }
}
