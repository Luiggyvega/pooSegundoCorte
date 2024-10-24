package com.programacion.servicios;

import com.programacion.modelos.Empleado;

import java.util.Scanner;

public class EmpleadoServicio {
    private Empleado empleado;
    private Scanner scanner;
    private EmpleadoIOServicio empleadoIOServicio;

    public EmpleadoServicio(){
        scanner = new Scanner(System.in);
        empleadoIOServicio = new EmpleadoIOServicio();
    }
    public void menu(){
        int opcion = 0;
        do {
            System.out.println("MENU DE OPCCIONES");
            System.out.println("1. crear empleado");
            System.out.println("2. visualizar empleado");
            System.out.println("ingrese una opcion");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1-> crearEmpleado();
                case 2-> visualizarEmpleado();
                default -> opcion = 0;
            }

        }while (opcion !=0 );
    }

    private void visualizarEmpleado() {
        System.out.println("VISUALIZAR EMPLEADO");
        empleado = empleadoIOServicio.leerJsonAEmpleado();
        System.out.println("empleado ledio desde un archivo json");
        System.out.println(empleado);

    }

    private void crearEmpleado() {
        System.out.println("CREAR EMPLEADO");
        System.out.println("ingrese el nombre del empleado");
        String nombre = scanner.next();
        System.out.println("ingrese la edad del empleado");
        int edad = scanner.nextInt();
        empleado = new Empleado(nombre,edad);
        empleadoIOServicio.escribirEmpleadoAJson(empleado);
        System.out.println("se escribio el empleado");
    }

}
