package com.hundredwordsgof.builder;

public class BuilderTest {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.buildPart1("BMW");
        carBuilder.buildPart2("M7");

        Director director = new Director(carBuilder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}
