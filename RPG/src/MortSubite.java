/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class MortSubite extends Sort {
    public MortSubite() {
        setCout(10);
    }
    public void lancerSort(Personnage personnage){
        if ((int)((Math.random()*10)+1)==1){
            personnage.setPtsVie(0);
        }
        else {
            System.out.println("Aucun dommage");
        }
    }
}
