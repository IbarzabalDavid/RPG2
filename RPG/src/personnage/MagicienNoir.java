package personnage;

import sort.BouledeFeu;
import sort.PicDeGlace;

/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class MagicienNoir extends Magicien {
    public MagicienNoir() {
        setPtsMagie(50);
        setNom("Magicien Noir");
        getTabSort()[0]=new BouledeFeu();
        getTabSort()[1]=new PicDeGlace();
    }
}
