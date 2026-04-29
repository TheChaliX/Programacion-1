package org.example.clases;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAlumnos {
    public static void main(String[] args) {

        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Ana Garcia");
        alumnos.add("Luis Perez");
        alumnos.add("Maria Lopez");

        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        System.out.println(alumnos.size());

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Ana Garcia", 8.5);
        notas.put("Luis Perez", 7.0);
        notas.put("Maria Lopez", 9.0);

        double n = notas.get("Ana Garcia");
        System.out.println(n);

        System.out.println(notas.size());
    }
}

