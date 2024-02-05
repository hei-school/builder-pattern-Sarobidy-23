package org.example;

public class SportEngine extends Engine {
  public SportEngine() {
    super("Toyota Supra 2JZ-GTE");
  }

  public String toString() {
    return String.format("SportEngine {name: %s}", this.name);
  }
}
