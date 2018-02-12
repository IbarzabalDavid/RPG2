package sort;

import personnage.Magicien;
import personnage.Personnage;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class BouledeFeu extends Sort {
    int avant;
    public BouledeFeu() {
        setCout(5);
        setNom("Boule de Feu");
    }
    public void lancerSort(Personnage personnage, Magicien magicien){
        avant=personnage.getPtsVie();
        personnage.setPtsVie(personnage.getPtsVie()-5-magicien.getDegat());
        System.out.println("Le "+personnage.getNom()+" perd "+(avant-personnage.getPtsVie())+" points de vie. Il lui en reste "+personnage.getPtsVie()+"."+System.lineSeparator());
    }
}
