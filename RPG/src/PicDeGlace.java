/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class PicDeGlace extends Sort{

    public PicDeGlace() {
        setCout(5);
    }

    public void lancerSort(Personnage personnage){
        personnage.setPtsVie(personnage.getPtsVie()-(7-personnage.getPtsDef()));
    }
}
