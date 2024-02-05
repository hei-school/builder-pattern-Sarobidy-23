package org.example;

public class ManualCarBuilder implements CarBuilder {
  private Manual manual = new Manual();

  @Override
  public void reset() {
    manual = new Manual();
  }

  @Override
  public void setEngine(Engine engine) {
    manual.engine = engine;
  }

  @Override
  public void setHasGPS(boolean hasGPS) {
    manual.hasGPS = hasGPS;
  }

  @Override
  public void setNumSeats(int numSeats) {
    manual.numSeats = numSeats;
  }

  @Override
  public void setTripComputer(String tripComputer) {
    manual.tripComputer = tripComputer;
  }

  public Manual getResult() {
    return manual;
  }
}
