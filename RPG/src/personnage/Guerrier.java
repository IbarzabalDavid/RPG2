package personnage;

import personnage.Personnage;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
abstract public class Guerrier extends Personnage {

    private int ptsForce;
    int avant;
    int dommage;


    //getters
    public int getPtsForce() { return ptsForce; }

    //setters
    public void setPtsForce(int ptsForce) { this.ptsForce = ptsForce; }

    public void attaquer(Personnage personnage){
        System.out.println("Le "+getNom()+" attaque !");
        avant=personnage.getPtsVie();
        personnage.setPtsVie(personnage.getPtsVie()-(ptsForce*2- personnage.getPtsDef()+getDegat()));
        dommage=avant-personnage.getPtsVie();
        //Verif mort
        if (personnage.getPtsVie()<=0){
            personnage.setPtsVie(0);
        }
        System.out.println("Le "+personnage.getNom()+" perd " +(dommage)+" points de vie. Il lui en reste "+personnage.getPtsVie()+System.lineSeparator());
    }


}
