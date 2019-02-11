package com.hundredwordsgof.builder;

/**
 * 
 * Director class, constructs an object using the Builder interface
 *
 */
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct2() {
    builder.createProduct().buildPart1("part1").buildPart2("part2");
  }

  public Product construct() {
    return builder.createProduct().getResult();
  }

}
