package sort;

import personnage.Magicien;
import personnage.Personnage;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class Empoisonnement extends Sort {
    int dommage=1;
    int avant;
    public Empoisonnement() {
        setCout(2);
        setNom("Empoissonnement");
    }
    public void lancerSort(Personnage personnage, Magicien magicien){
        avant=personnage.getPtsVie();
        personnage.setPtsVie(personnage.getPtsVie()-(2*dommage)- magicien.getDegat());
        System.out.println("Le "+personnage.getNom()+" perd "+(avant-personnage.getPtsVie())+" points de vie. Il lui en reste "+personnage.getPtsVie()+"."+System.lineSeparator());
        dommage++;
    }
}
