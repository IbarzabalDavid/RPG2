/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class Guerrier extends Personnage {

    private int ptsForce;


    //getters
    public int getPtsForce() { return ptsForce; }

    //setters
    public void setPtsForce(int ptsForce) { this.ptsForce = ptsForce; }

    public void attaquer(Personnage personnage){
        personnage.setPtsVie(personnage.getPtsVie()-(ptsForce*2- personnage.getPtsDef()));
    }


}
