package org.example;

public class BusEngine extends Engine {
  public BusEngine() {
    super("MITSUBISHI FUSO ROSA BUS");
  }

  public String toString() {
    return String.format("BusEngine {name: %s}", this.name);
  }

  @Override
  public boolean equals(Object obj) {
    return obj.toString().contains(this.toString());
  }
}
