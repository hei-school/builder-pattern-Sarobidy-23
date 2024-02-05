package org.example;

public interface CarBuilder {
  void reset();

  void setEngine(Engine engine);

  void setHasGPS(boolean hasGPS);

  void setNumSeats(int numSeats);

  void setTripComputer(String tripComputer);
}
