package Exercises5;

import java.lang.Math;

public class RegularPolygon {
  // Variables
  private int n = 3; // Numero de lado
  private double lado = 1;
  private double x = 0;
  private double y = 0;

  // Constructor
  public RegularPolygon() {
  }
  public RegularPolygon(int n, double lado) {
    this.n = n;
    this.lado = lado;
  }
  public RegularPolygon(int n, double lado, double x, double y) {
    this.n = n;
    this.lado = lado;
    this.x = x;
    this.y = y;
  }

  // Getter and Setter
  public void setN(int n){
    this.n = n;
  }
  public int getN(){
    return n;
  }

  public void setLado(double lado){
    this.lado = lado;
  }
  public double getLado(){
    return lado;
  }

  public void setX(double x){
    this.x = x;
  }
  public double getX(){
    return x;
  }

  public void setY(double y){
    this.y = y;
  }
  public double getY(){
    return y;
  }

  // Metodos
  public double getPerimeter(){
    return lado * n;
  }

  public double getArea(){
    return (n * Math.pow(lado,2)) / (4 * Math.tan(Math.PI / n));
  }

}
