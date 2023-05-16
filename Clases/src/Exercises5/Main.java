package Exercises5;

import Exercises5.RegularPolygon;

public class Main {
  public static void main(String[] args) {
    RegularPolygon foo = new RegularPolygon();
    RegularPolygon foo2 = new RegularPolygon(6,4);
    RegularPolygon foo3 = new RegularPolygon(10,4,5.6,7.8);

    System.out.printf("Foo  {Perimetro = %.2f, Area = %.2f}%n",foo.getPerimeter(), foo.getArea());
    System.out.printf("Foo2 {Perimetro = %.2f, Area = %.2f}%n",foo2.getPerimeter(), foo2.getArea());
    System.out.printf("Foo3 {Perimetro = %.2f, Area = %.2f}%n",foo3.getPerimeter(), foo3.getArea());
  }
}

