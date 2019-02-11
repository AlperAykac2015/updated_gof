package com.hundredwordsgof.builder.sample;

public class AccountTester {


    public static void main(String[] args) {
        Address address = new Address("AA Street", "tw25dd", "lipton", 12);
        Name name = new Name("alper", "aykaq");
        Account.Builder builder = new Account.Builder();
        Account account = null;
        try {
            account = builder.setAddress(address)
                    .setName(name)
                    .setEmail("a@b.com")
                    .setId(1)
                    .createAccount();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(account.toString());

        name.setName("ayca");
        name.setSurname("aykaq");

        address.setHouse("likon");
        address.setHouseNo(2);
        address.setPostcode("tw1 6dd");
        address.setStreet("bayers street");

        System.out.println(account.toString());


    }
}
