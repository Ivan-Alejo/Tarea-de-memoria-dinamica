import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class principal {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int datos=0;

        System.out.println("¿Cuantos alumnos quiere registrar?");
        datos = leer.nextInt();
        leer.nextLine();

        Alumno a[]= new Alumno[datos];
        String nombre="";
        int numcomtrol=0;
        String carrera="";
        String semestre="";
        for(int i=0;i<a.length; i++)
        {

            System.out.println("Introduzca su nombre");
            nombre=leer.nextLine();
            System.out.println("Introduzca su numero de control");
            numcomtrol=leer.nextInt();
            leer.nextLine();
            System.out.println("Introduzca su semestre");
            semestre =leer.nextLine();
            System.out.println("Introduzca su carrera");
            carrera=leer.nextLine();

            a[i] = new Alumno(nombre,numcomtrol,semestre,carrera);

        }
        for(int i=0;i<a.length; i++)
        {
            System.out.println("Nombre del estudiante: "+a[i].getNombre());
            System.out.println("Numero de control: "+a[i].getNumcomtrol());
            System.out.println("Semestre: "+a[i].getSemestre());
            System.out.println("Carrera: "+a[i].getCarrera());
        }
    }
}
