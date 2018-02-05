/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class BouledeFeu extends Sort {
    public BouledeFeu() {
        setCout(5);
    }
    public void lancerSort(Personnage personnage){
        personnage.setPtsVie(personnage.getPtsVie()-5);
    }
}
