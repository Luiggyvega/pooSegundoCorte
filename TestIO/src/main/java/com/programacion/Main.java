package com.programacion;

import com.programacion.servicios.EmpleadoServicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmpleadoServicio empleadoServicio = new EmpleadoServicio();
        empleadoServicio.menu();

//        File file = new File("src/main/resources/datos/empleado.json");
//        System.out.printf("Does it exist? " +file.exists() + "\n");
//        System.out.println("the file has " + file.length() + " bytes" );
//        System.out.println("cant file read? " + file.canRead());
//        System.out.println("cant file written? "+ file.canWrite());
//        System.out.println("it si a directory " + file.isDirectory());
//        System.out.println("it is a file " + file.isFile());
//        System.out.println("it is absolute " + file.isAbsolute());
//        System.out.println("it is hidden" + file.isHidden());
//        System.out.println("absolute path " + file.getAbsolutePath());
//        System.out.println("last modified on" + new Date(file.lastModified()));
//        try{
//            Scanner sc = new Scanner(file);
//            while (sc.hasNext()){
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}}
