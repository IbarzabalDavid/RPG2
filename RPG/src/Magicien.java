/**
 * Created by ibada1731710 on 2018-02-05.
 */
public class Magicien extends Personnage {
    private int ptsMagie;
    private Sort[] tabSort=new Sort[2];
    int random;


    //getters
    public int getPtsMagie() { return ptsMagie; }
    public Sort[] getTabSort() {return tabSort;}

    //setters
    public void setPtsMagie(int ptsMagie) { this.ptsMagie = ptsMagie; }

    public void setTabSort(Sort[] tabSort) {this.tabSort = tabSort;}



    public void attaquer(Personnage personnage){
        random=(int)(Math.random()*2);
        if ( tabSort[random].getCout()<=ptsMagie){
            ptsMagie-=tabSort[random].getCout();
            tabSort[random].lancerSort(personnage);


        }
        else {
            System.out.println("Vous n'avez pas assez de points de Magie");
        }

    }

    public Magicien(){
        setPtsDef(1);
        setPtsVie(60);

    }



}
