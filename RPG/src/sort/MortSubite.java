package sort;

import personnage.Personnage;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class MortSubite extends Sort {
    int avant;
    public MortSubite() {
        setCout(10);
        setNom("Mort Subite");
    }
    public void lancerSort(Personnage personnage){
        if ((int)((Math.random()*10)+1)==1){
            avant=personnage.getPtsVie();
            personnage.setPtsVie(0);
            System.out.println("Le "+personnage.getNom()+" perd "+(avant-personnage.getPtsVie())+" points de vie. Il lui en reste "+personnage.getPtsVie()+"."+System.lineSeparator());
        }
        else {
            System.out.println("Aucun dommage"+System.lineSeparator());
        }
    }
}
