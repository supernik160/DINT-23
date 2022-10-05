/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JRadioButton;

/**
 *
 * @author usuario
 */
class Camiseta {
  
    String logotipo;
    boolean mangaLonga;
    int material,cor;

    public Camiseta(String logotipo, boolean mangaLonga) {
        this.logotipo = logotipo;
        this.mangaLonga = mangaLonga;
    }

    public void setLogotipo(String logotipo) {
        this.logotipo = logotipo;
    }

    public void setMangaLonga(boolean mangaLonga) {
        this.mangaLonga = mangaLonga;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    
    
}
