/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class PicDeGlace extends Sort{
    int avant;

    public PicDeGlace() {
        setCout(5);
        setNom("Pic de Glace");
    }

    public void lancerSort(Personnage personnage){
        avant=personnage.getPtsVie();
        personnage.setPtsVie(personnage.getPtsVie()-(7-personnage.getPtsDef()));
        System.out.println("Le "+personnage.getNom()+" perd "+(avant-personnage.getPtsVie())+" points de vie. Il lui en reste "+personnage.getPtsVie()+"."+System.lineSeparator());
    }
}
