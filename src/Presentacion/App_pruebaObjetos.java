package Presentacion;

import Entidades.Alumno;

public class App {
    public static void main(String[] args) {

       double[] notas = {3,4,5,6,7};

       Alumno alumno1 = new Alumno("Diego","Mendez","Avda pr ahi 123",13,notas,"5to Basico");

       System.out.println("La peor nota de "+ alumno1.getNombre() + " " + alumno1.getApellido() + " es: "+ alumno1.notaMenor());

       System.out.println("La mejor nota de "+ alumno1.getNombre() + " " + alumno1.getApellido() + " es: "+ alumno1.notaMayor());

       System.out.println("El promedio de notas de "+ alumno1.getNombre() + " " + alumno1.getApellido() + " es: "+ alumno1.promedioNotas());

       alumno1.evaluarSituacionAcademica();


    }
}
