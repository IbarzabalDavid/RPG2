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
        System.out.println("Le "+getNom()+" attaque !");
        System.out.println("Le "+getNom()+" utilise le sort "+tabSort[random].getNom()+", ce qui lui coute "+tabSort[random].getCout()+" points de magie.");


        if ( tabSort[random].getCout()<=ptsMagie){
            ptsMagie-=tabSort[random].getCout();
            System.out.println("Il lui reste "+(getPtsMagie()+" points de magie."));
            tabSort[random].lancerSort(personnage);
        }
        else {
            System.out.println("Le personnage n'a pas assez de points de Magie"+System.lineSeparator());
        }

    }

    public Magicien(){
        setPtsDef(1);
        setPtsVie(60);

    }



}
