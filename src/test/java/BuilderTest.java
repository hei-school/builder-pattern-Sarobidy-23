import static org.junit.Assert.assertEquals;

import org.example.BusEngine;
import org.example.ConcreteCarBuilder;
import org.example.ManualCarBuilder;
import org.example.SportEngine;
import org.junit.Test;

public class BuilderTest {
  @Test
  public void carCreationBuilder() {
    ConcreteCarBuilder carBuilder = new ConcreteCarBuilder();
    carBuilder.setEngine(new SportEngine());
    carBuilder.setHasGPS(false);
    carBuilder.setNumSeats(2);
    carBuilder.setTripComputer("computer");
    assertEquals(TestUtils.getCar(), carBuilder.getResult());
  }

  @Test
  public void manualCreationBuilder() {
    ManualCarBuilder manualBuilder = new ManualCarBuilder();
    manualBuilder.setEngine(new BusEngine());
    manualBuilder.setHasGPS(true);
    manualBuilder.setNumSeats(32);
    manualBuilder.setTripComputer("computer");
    assertEquals(TestUtils.getManual(), manualBuilder.getResult());
  }
}
