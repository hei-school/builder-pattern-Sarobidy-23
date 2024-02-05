package org.example;

public class Manual {
  Engine engine;
  boolean hasGPS;
  int numSeats;
  String tripComputer;

  public Manual() {}

  public Manual(Engine engine, boolean hasGPS, int numSeats, String tripComputer) {
    this.engine = engine;
    this.hasGPS = hasGPS;
    this.numSeats = numSeats;
    this.tripComputer = tripComputer;
  }

  public String toString() {
    return String.format(
        "MANUAl {engine: %s, hasGPS: %s, numSeats: %s, tripComputer: %s}",
        engine, hasGPS, numSeats, tripComputer);
  }

  @Override
  public boolean equals(Object obj) {
    return obj.toString().contains(this.toString());
  }
}
