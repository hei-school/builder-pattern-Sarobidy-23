import static org.junit.Assert.assertEquals;

import org.example.ConcreteCarBuilder;
import org.example.Director;
import org.example.ManualCarBuilder;
import org.junit.Test;

public class DirectorTest {
  @Test
  public void director() {
    ConcreteCarBuilder concreteCarBuilder = new ConcreteCarBuilder();
    Director director = new Director();
    director.constructSportConcreteCar(concreteCarBuilder);

    ManualCarBuilder manualCarBuilder = new ManualCarBuilder();
    director.contructBusManualCar(manualCarBuilder);
    assertEquals(TestUtils.getCar(), concreteCarBuilder.getResult());
    assertEquals(TestUtils.getManual(), manualCarBuilder.getResult());
  }
}
