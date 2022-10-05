/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JComboBox;

import JList.*;

/**
 *
 * @author usuario
 */
public class Alfombra {

    private String modelo;
    private String cor;
    private int alto;
    private int ancho;

    @Override
    public String toString() {
        return "MODELO " + modelo + " - COR " + cor;
    }

    public Alfombra(String modelo, String cor, int alto, int ancho) {
        this.modelo = modelo;
        this.cor = cor;
        this.alto = alto;
        this.ancho = ancho;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }
}
