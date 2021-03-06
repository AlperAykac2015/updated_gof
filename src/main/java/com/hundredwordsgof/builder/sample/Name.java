package com.hundredwordsgof.builder.sample;

public class Name implements Cloneable {

    private String name;

    private String surname;

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Name clone() throws CloneNotSupportedException {
       return (Name)super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Name{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
