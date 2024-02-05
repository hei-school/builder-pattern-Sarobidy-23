import org.example.BusEngine;
import org.example.Car;
import org.example.Manual;
import org.example.SportEngine;

public class TestUtils {
  public static Car getCar() {
    return new Car(new SportEngine(), false, 2, "computer");
  }

  public static Manual getManual() {
    return new Manual(new BusEngine(), true, 32, "computer");
  }
}
