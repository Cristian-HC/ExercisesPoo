package labOne2020;

import labOne2020.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
  final double MIN_NOTA = 1.0;
  final double MAX_NOTA = 7.0;
  private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

  // Constructor
  public Curso() {
  }

  // Metodos
  public void agregarAlumno(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el rut del alumno: ");
    String rut = sc.nextLine();
    System.out.print("Ingresa el nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Ingresa el primer apellido: ");
    String apellido1 = sc.nextLine();
    System.out.print("Ingresa el segundo apellido: ");
    String apellido2 = sc.nextLine();
    listaAlumnos.add(new Alumno(rut, nombre, apellido1, apellido2));
  }

  public void imprimirListaAlumnos(){
    System.out.println("\nLISTA DE ALUMNOS\n");
    for (int i = 0; i < listaAlumnos.size(); i++) {
      System.out.println((i+1)+") "+listaAlumnos.get(i).datosAlumno());
    }
    System.out.println("");
  }

  public void imprimirActaCurso() {
    System.out.println("");
    for (int i = 0; i < listaAlumnos.size(); i++) {
      System.out.println((i+1)+") "+listaAlumnos.get(i).actaAlumno());
    }
    System.out.println("");
  }

  public void modificarNotasAlumno(){
    int seleccion = alumnoValido() - 1;
    if(seleccion > -1){
      System.out.println("Ingrese las notas de "+listaAlumnos.get(seleccion).getAsignatura1());
      double [] notasA1 = ingresarNotasAsignatura(3);
      listaAlumnos.get(seleccion).setNotasA1(notasA1);
      System.out.println("Ingrese las notas de "+listaAlumnos.get(seleccion).getAsignatura2());
      double [] notasA2 = ingresarNotasAsignatura(3);
      listaAlumnos.get(seleccion).setNotasA2(notasA2);
    }else{
      System.out.println("No hay alumnos registrados aun.");
    }
  }

  public int alumnoValido(){
    Scanner sc = new Scanner(System.in);

    if(listaAlumnos.size() == 0) return 0;

    System.out.print("Seleccione el numero del alumno:");
    int numAlumno = sc.nextInt();

    while(numAlumno < 1 || numAlumno > listaAlumnos.size()){
      System.out.println("Error!!. Ingrese un numero de la lista valido");
      System.out.print("Seleccione el numero del alumno: ");
      numAlumno = sc.nextInt();
    }
    return numAlumno;
  }


  public double [] ingresarNotasAsignatura(int numNotas){
    double [] notas = new double[numNotas];
    for (int i = 0; i < numNotas; i++) {
      notas[i] = notaAsignatura(MIN_NOTA, MAX_NOTA);
    }
    return notas;
  }

  public double notaAsignatura(double minNota, double maxNota){
    Scanner sc = new Scanner (System.in);

    System.out.print("Ingrese una nota: ");
    double nota = sc.nextDouble();

    while (nota < minNota || nota > maxNota) {
      System.out.printf("Error!!. Ingrese una nota valida(%f a %f)",minNota,maxNota);
      System.out.print("Ingrese una nota: ");
      nota = sc.nextDouble();
    }
    return nota;
  }

   
}
