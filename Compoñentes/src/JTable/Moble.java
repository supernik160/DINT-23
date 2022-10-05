/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JTable;

/**
 *
 * @author DAM 22-23
 */
public class Moble implements Comparable<Moble>{
    private String nome;
    private String cor;
    private String material;
    private int ancho;
    private int alto;
    private int fondo;    

    public Moble(String nome, String cor, String material, int ancho, int alto, int fondo) {
        this.nome = nome;
        this.cor = cor;
        this.material = material;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getMaterial() {
        return material;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getFondo() {
        return fondo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Moble t) {
       return this.nome.compareTo(t.getNome());
    }
    
}
