package org.example;

public class ConcreteCarBuilder implements CarBuilder {
  private Car car = new Car();

  @Override
  public void reset() {
    car = new Car();
  }

  @Override
  public void setEngine(Engine engine) {
    car.engine = engine;
  }

  @Override
  public void setHasGPS(boolean hasGPS) {
    car.hasGPS = hasGPS;
  }

  @Override
  public void setNumSeats(int numSeats) {
    car.numSeats = numSeats;
  }

  @Override
  public void setTripComputer(String tripComputer) {
    car.tripComputer = tripComputer;
  }

  public Car getResult() {
    return car;
  }
}
