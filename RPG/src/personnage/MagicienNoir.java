package personnage;

import arme.Magique;
import sort.BouledeFeu;
import sort.PicDeGlace;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class MagicienNoir extends Magicien {
    private Magique arme;
    public MagicienNoir(Magique arme) {
        setPtsMagie(50);
        setNom("Magicien Noir");
        getTabSort()[0]=new BouledeFeu();
        getTabSort()[1]=new PicDeGlace();
        this.arme=arme;
    }
    public int getDegat(){
        return arme.lancerSort();
    }
}
