package Exercises3;

import Exercises3.Cuenta;

public class Main {
  public static void main(String[] args) {
    Cuenta cnt = new Cuenta(1,20000);
    System.out.println(cnt.getFechaDeCreacion());

    cnt.setTasaInteresAnual(4.5);

    System.out.println(cnt.getTasaInteresMensual());

    System.out.println(cnt.getInteresMensual());
  }
}
