package Exercises2;

import Exercises2.Producto;

public class Main {
  public static void main(String[] args) {
    Producto prdt1 = new Producto(1,"Avena",2000,400);

    prdt1.vender(50);

    prdt1.reponer(4);

    System.out.println(prdt1);

  }
}
