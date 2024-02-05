package org.example;

public class Car {
  Engine engine;
  boolean hasGPS;
  int numSeats;
  String tripComputer;

  public Car() {}

  public Car(Engine engine, boolean hasGPS, int numSeats, String tripComputer) {
    this.engine = engine;
    this.hasGPS = hasGPS;
    this.numSeats = numSeats;
    this.tripComputer = tripComputer;
  }

  public String toString() {
    return String.format(
        "CAR {engine: %s, hasGPS: %s, numSeats: %s, tripComputer: %s}",
        engine, hasGPS, numSeats, tripComputer);
  }

  @Override
  public boolean equals(Object obj) {
    return obj.toString().contains(this.toString());
  }
}
