package Exercises4;

import Exercises4.Ventilador;

public class Main {
  public static void main(String[] args) {
    Ventilador v1 = new Ventilador();
    Ventilador v2 = new Ventilador();

    v1.setRadio(8);
    v2.setColor("Verde");
    v2.setSpeed(3);
    v2.setOn();

    System.out.println(v1);
    System.out.println(v2);
  }
}
