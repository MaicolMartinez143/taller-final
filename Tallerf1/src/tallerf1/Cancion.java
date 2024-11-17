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
    private String msj; 

    public Cancion() {
    }

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.contadorReproducciones = 0;
        this.dañado = false;
        this.msj="";
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

    public String getMsj() {
        return msj;
    }
    
    public void reproducir() {
        if (dañado) {
            msj+="El disco está dañado\n";
        } else {
            contadorReproducciones++;
            msj="Reproduciendo: " + titulo+"\n";
            if (contadorReproducciones > 100) {
                dañado = true;
                msj+="El disco ha sonado más de 100 veces y está dañado\n";
                cambiarDisco();
            }
        }
    }

    public void cambiarDisco() {    
        this.dañado = false;
        this.contadorReproducciones = 0;
        msj+="El disco ha sido reemplazado\n";
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracion + " min";
    }

}

