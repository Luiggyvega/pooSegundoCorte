import Service.PersonaService;
import persona.empleado.Administrativo;
import persona.empleado.Docente;
import persona.estudiante.Estudiante;

public class Main {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        personaService.menu();
//        Estudiante estudiante = new Estudiante();
//        estudiante.printEstudiante();
//        System.out.println("--------------");
//        Administrativo administrativo = new Administrativo();
//        administrativo.printAdministrativo();
//        System.out.println("---------------");
//        Docente docente = new Docente();
//        docente.printDocente();
    }
}