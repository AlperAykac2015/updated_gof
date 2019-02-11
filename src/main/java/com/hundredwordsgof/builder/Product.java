package com.hundredwordsgof.builder;

/**
 * Product class, represents complex object
 */
public class Product {

  private String part1;

  private String part2;

  public void setPart1(String part1) {
    this.part1 = part1;
  }

  public void setPart2(String part2) {
    this.part2 = part2;
  }

  public String getPart1() {
    return part1;
  }

  public String getPart2() {
    return part2;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Product{");
    sb.append("part1='").append(part1).append('\'');
    sb.append(", part2='").append(part2).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
