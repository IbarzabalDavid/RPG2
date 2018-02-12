package personnage;

import arme.Magique;
import sort.Empoisonnement;
import sort.MortSubite;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class MagicienRouge extends Magicien {
    private Magique arme;
    public MagicienRouge(Magique arme) {
        setPtsMagie(40);
        setNom("Magicien Rouge");
        getTabSort()[0]=new Empoisonnement();
        getTabSort()[1]=new MortSubite();
        this.arme=arme;
    }
    public int getDegat(){
        return arme.lancerSort();
    }
}
