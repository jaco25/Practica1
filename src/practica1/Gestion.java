/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.math.BigInteger;
import java.util.Scanner;

public class Gestion {

    
    private Scanner teclado;
    
    private String Nombre,Rama;
    private int Fecha,Documento,Libre=0,Mariposa=0,Pecho=0,Espalda=0;

    public int getLibre() {
        return Libre;
    }

    public void setLibre(int Libre) {
        this.Libre = Libre;
    }

    public int getMariposa() {
        return Mariposa;
    }

    public void setMariposa(int Mariposa) {
        this.Mariposa = Mariposa;
    }

    public int getPecho() {
        return Pecho;
    }

    public void setPecho(int Pecho) {
        this.Pecho = Pecho;
    }

    public int getEspalda() {
        return Espalda;
    }

    public void setEspalda(int Espalda) {
        this.Espalda = Espalda;
    }
    private char categoria;

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public String getRama() {
        return Rama;
    }

    public void setRama(String Rama) {
        this.Rama = Rama;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }
    
}
