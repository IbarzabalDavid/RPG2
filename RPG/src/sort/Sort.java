package sort;

import personnage.Personnage;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public abstract class Sort {
    private int cout;
    private String nom;

    //getter
    public int getCout() {return cout;}

    public String getNom() {
        return nom;
    }

    //setter
    public void setCout(int cout) {this.cout = cout;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void lancerSort(Personnage personnage);
}
