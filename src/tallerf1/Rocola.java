/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerf1;

/**
 *
 * @author USUARIO
 */

import java.util.ArrayList;


public class Rocola {
    private ArrayList<Cancion> canciones;

    public Rocola() {
        canciones = new ArrayList<>();
    }

    public String agregarCancion(String titulo, String artista, double duracion) {
        for (Cancion cancion : canciones) {
            if (cancion.getTitulo().equalsIgnoreCase(titulo)) {
                return "La canción ya existe en la rocola.";
                
            }
        }
        Cancion nuevaCancion = new Cancion(titulo, artista, duracion);
        canciones.add(nuevaCancion);
        return "Canción agregada: " + nuevaCancion;
    }

    
    public ArrayList<Cancion> listarCanciones() {
        return canciones;
    }

    
    public boolean reproducirCancion(String titulo) {
        for (Cancion cancion : canciones) {
            if (cancion.getTitulo().equalsIgnoreCase(titulo)) {
                cancion.reproducir();
                return true;
            }
        }
        return false;
    }

    
    public Cancion buscarCancion(String titulo) {
        for (Cancion cancion : canciones) {
            if (cancion.getTitulo().equalsIgnoreCase(titulo)) {
                return cancion;
            }
        }
        return null; 
    }
}
