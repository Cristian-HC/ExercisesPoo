package labOne2020;

import labOne2020.Curso;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Constantes
    final int LMT1 = 1;
    final int SALIR = 4;

    // Variables
    Curso curso = new Curso();


    Menu();

    int opc = opcion(LMT1, SALIR);

    while (opc != SALIR) {
      if (opc == 1) {
        curso.imprimirListaAlumnos();
        curso.modificarNotasAlumno();
      }
      else if(opc == 2){
        curso.agregarAlumno();
      }
      else{
        curso.imprimirActaCurso();
      }

      Menu();
      opc = opcion(LMT1, SALIR);
    }

  }

  // Metodos
  public static void Menu(){
    System.out.println(" ----- MENU -----");
    System.out.println("1) Modificar notas de un alumno.");
    System.out.println("2) Agregar alumno.");
    System.out.println("3) Generar un acta del curso.");
    System.out.println("4) Salir");
  }


  public static int opcion(int lmt1, int lmt2){
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese una opcion: ");
    int opc = sc.nextInt();
    
    while (opc < lmt1 || opc > lmt2) {
      System.out.println("Error!! Ingrese una opcion valida.");
      System.out.print("Ingrese una opcion: ");
      opc = sc.nextInt();
    }

    return opc;
  }

}
