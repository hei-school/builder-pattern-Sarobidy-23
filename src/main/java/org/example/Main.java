package org.example;

public class Main {
  public static void main(String[] args) {
    ConcreteCarBuilder concreteCarBuilder = new ConcreteCarBuilder();
    Director director = new Director();
    director.constructSportConcreteCar(concreteCarBuilder);

    ManualCarBuilder manualCarBuilder = new ManualCarBuilder();
    director.contructBusManualCar(manualCarBuilder);
    System.out.println(concreteCarBuilder.getResult());
    System.out.println(manualCarBuilder.getResult());
  }
}
