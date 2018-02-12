package personnage;

import arme.Tranchant;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class Paladin extends Guerrier {
    private Tranchant arme;
    public Paladin(Tranchant arme) {
        setPtsForce(5);
        setPtsDef(5);
        setPtsVie(80);
        setNom("Paladin");
        this.arme=arme;
    }
    public int getDegat(){
        return arme.trancher();
    }
}
