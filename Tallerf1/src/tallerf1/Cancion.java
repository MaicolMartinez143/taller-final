/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerf1;



/**
 *
 * @author USUARIO
 */
public class Cancion {
    
    private String titulo;
    private String artista;
    private double duracion;
    int contadorReproducciones;
    private boolean dañado;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.contadorReproducciones = 0;
        this.dañado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void reproducir() {
        if (dañado) {
            System.out.println("El disco está dañado.");
        } else {
            contadorReproducciones++;
            System.out.println("Reproduciendo: " + titulo);
            if (contadorReproducciones > 100) {
                dañado = true;
                System.out.println("El disco ha sonado más de 100 veces y está dañado.");
                cambiarDisco();
            }
        }
    }

    public void cambiarDisco() {    
        this.dañado = false;
        this.contadorReproducciones = 0;
        System.out.println("El disco ha sido reemplazado.");
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracion + " min";
    }

}

