package com.hundredwordsgof.builder.sample;

public class Address {

    private String street;
    private String postcode;
    private String house;
    private int houseNo;

    public Address(String street, String postcode, String house, int houseNo) {
        this.street = street;
        this.postcode = postcode;
        this.house = house;
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getHouse() {
        return house;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("street='").append(street).append('\'');
        sb.append(", postcode='").append(postcode).append('\'');
        sb.append(", house='").append(house).append('\'');
        sb.append(", houseNo=").append(houseNo);
        sb.append('}');
        return sb.toString();
    }
}
