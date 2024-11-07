package Service;

import persona.Persona;
import persona.empleado.Administrativo;
import persona.empleado.Docente;
import persona.estudiante.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Docente> listaDocentes;
    private ArrayList<Administrativo> listaAdministrativos;
    Scanner sc;
    public PersonaService() {
        listaEstudiantes = new ArrayList<>();
        listaDocentes = new ArrayList<>();
        listaAdministrativos = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void menu (){
        char opcion;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1 para crear persona");
            System.out.println("2 para ver estudiantes");
            System.out.println("3 para ver docentes");
            System.out.println("4 para ver administrativos");
            System.out.println("s para salir");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case '1'-> crearPersona();
                case '2'->verEstudiantes();
                case '3'->verDocentes();
                case '4'->verAdministrativos();
                default -> {
                    System.out.println("hasta mañana");
                }
            }
        }while (opcion != 's');
    }

    private void verAdministrativos() {
        for (Administrativo administrativo : listaAdministrativos) {
            System.out.println(administrativo);
        }
    }

    private void verDocentes() {
        for (Docente docente : listaDocentes) {
            System.out.println(docente);
        }
    }
    private void verEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
    private void crearPersona() {
        sc.nextLine();
        System.out.println("vas a crear una persona");
        System.out.println("Ingrese un Nombre");
        String nombre = sc.nextLine();
        System.out.println("ingrese una direccion");
        String direccion = sc.nextLine();
        System.out.println("ingrese un telefono");
        String telefono = sc.nextLine();
        System.out.println("ingrese un email");
        String email = sc.nextLine();
        System.out.println("ingrese que tipo de persona es");
        System.out.println(" 1 = estudiante, 2= empleado");
        int tipo = sc.nextInt();
        if (tipo == 1) {
            sc.nextLine();
            System.out.println("ingrese un tipo de estudiante, estudiante, senior, junior");
            String tipoEstudiante = sc.nextLine();
            Estudiante estudiante = new Estudiante(nombre, direccion, telefono, email, tipoEstudiante);
            listaEstudiantes.add(estudiante);
        }
        if (tipo == 2) {
            sc.nextLine();
            System.out.println("ingrese cargo");
            String cargo = sc.nextLine();
            System.out.println("ingrese salario");
            double salario = sc.nextDouble();
            System.out.println("ingrese fecha contratacion");
            String fechaContratacion = sc.nextLine();
            System.out.println("1 si es docente, 2 si es administrativo");
            int opcion1 = sc.nextInt();
            if (opcion1 == 1){
                sc.nextLine();
                System.out.println("ingrese titulo");
                String titulo = sc.nextLine();
                Docente docente = new Docente(nombre,direccion,telefono,email,cargo,salario,fechaContratacion,titulo);
                listaDocentes.add(docente);
            }
            if (opcion1 == 2){
                sc.nextLine();
                System.out.println("ingrese horario");
                String horario = sc.nextLine();
                Administrativo administrativo = new Administrativo(nombre,direccion,telefono,email,cargo,salario,fechaContratacion,horario);
                listaAdministrativos.add(administrativo);
            }
        }
    }
}
