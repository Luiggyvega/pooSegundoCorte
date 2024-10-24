package com.programacion.servicios;

import com.google.gson.Gson;
import com.programacion.modelos.Empleado;

import java.io.*;

public class EmpleadoIOServicio {
    private final static String RUTA = "src/main/resources/datos/empleado.json";
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private Empleado empleado;
    private Gson gson;

    public EmpleadoIOServicio (){
        gson = new Gson();
    }

    public void escribirEmpleadoAJson(Empleado empleado){
        try {
            fileWriter =new FileWriter(RUTA);
            bufferedWriter = new BufferedWriter(fileWriter);
            String empleadoJson = gson.toJson(empleado);
            bufferedWriter.write(empleadoJson);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.printf("Error al escribir el archivo: " + e.getMessage());
        }
    }
    public Empleado leerJsonAEmpleado(){
        try {
            fileReader = new FileReader(RUTA);
            bufferedReader = new BufferedReader(fileReader);
            String linea, archivo= "";
            while ((linea= bufferedReader.readLine())!= null){
                archivo += linea;
            }
            empleado = gson.fromJson(archivo, Empleado.class);

        } catch (FileNotFoundException e) {
            System.out.printf("archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("error al leer el archivo: " + e.getMessage());;
        }
        return empleado;
    }

}
