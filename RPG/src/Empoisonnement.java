/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class Empoisonnement extends Sort{
    int dommage=1;
    public Empoisonnement() {
        setCout(2);
    }
    public void lancerSort(Personnage personnage){
        personnage.setPtsVie(personnage.getPtsVie()-(2*dommage));
        dommage++;
    }
}
