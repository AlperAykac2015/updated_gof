package com.hundredwordsgof.builder;

/**
 * ConcreteBuilder class, constructs and assembles parts of the Product by
 * implementing the Builder interface
 */
public class CarBuilder extends Builder {

  private Product product;

  private String part1;

  private String part2;

  public Builder createProduct() {
    this.product = new Product();
    this.product.setPart1(part1);
    this.product.setPart2(part2);
    return this;
  }

  @Override
  public Builder buildPart1(String part) {
   this.part1 = part;
    return this;
  }

  public Builder buildPart2(String part) {
    this.part2 = part;
    return this;
  }

  public Product getResult() {
    return product;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CarBuilder{");
    sb.append("product=").append(product);
    sb.append('}');
    return sb.toString();
  }
}
