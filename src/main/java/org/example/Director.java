package org.example;

public class Director {
  public void constructSportConcreteCar(ConcreteCarBuilder builder) {
    builder.setNumSeats(2);
    builder.setEngine(new SportEngine());
    builder.setHasGPS(false);
    builder.setTripComputer("computer");
  }

  public void contructBusManualCar(ManualCarBuilder builder) {
    builder.setNumSeats(32);
    builder.setEngine(new BusEngine());
    builder.setHasGPS(true);
    builder.setTripComputer("computer");
  }
}
