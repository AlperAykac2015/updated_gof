package com.hundredwordsgof.builder.sample;

public class Account {

    private final String email;
    private final Name name;
    private Address address;
    private final int id;

    private Account(Builder builder) {
        this.address = builder.address;
        this.name = builder.name;
        this.email = builder.email;
        this.id = builder.id;
    }

    public static class Builder {

        private String email;
        private int id;
        private Name name;
        private Address address;

        public Builder setAddress(Address address) {
            //this.address = address;#
            this.address = new Address(address.getStreet(),address.getPostcode(),address.getHouse(),address.getHouseNo());
            return this;
        }

        public Builder setName(Name name) throws CloneNotSupportedException {
            //this.name = name;
            //this.name = new Name(name.getName(),name.getSurname());
            this.name = name.clone();
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Account createAccount(){
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("email='").append(email).append('\'');
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
