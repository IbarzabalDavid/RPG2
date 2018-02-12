package personnage;

import arme.Contondant;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class Barbare extends Guerrier {
    private Contondant arme;

    public Barbare(Contondant arme) {
        setPtsForce(10);
        setPtsDef(3);
        setPtsVie(100);
        setNom("Barabre");
        this.arme=arme;
    }
    public int getDegat(){
        return arme.frapper();
    }
}
