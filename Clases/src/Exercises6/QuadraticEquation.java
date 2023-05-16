package Exercises6;

import java.lang.Math;

public class QuadraticEquation {
  // Variables
  private double a; 
  private double b;
  private double c;

  // Constructor
  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  // Getters
  public double getA(){
    return a;
  }
  public double getB(){
    return b;
  }
  public double getC(){
    return c;
  }

  // Metodos
  public double getDiscriminante(){
    return Math.pow(b,2) - (4*a*c);
  }
  public double getRoot1(){
    return (getDiscriminante() >= 0) ? ((-b + this.getDiscriminante()) / (2*a)) : 0;
  }
  public double getRoot2(){
    return (getDiscriminante() >= 0) ? ((-b - this.getDiscriminante()) / (2*a)) : 0;
  }

}
