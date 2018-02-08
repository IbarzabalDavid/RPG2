/**
 * Created by ibada1731710 on 2018-02-05.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choix=0;
        boolean ok=false;
        int tour=0;
        int dommage=0;
        int avant=0;
        boolean gameOver=false;
        Personnage[] tabJoueur= new Personnage[2];
        Scanner sc =new Scanner(System.in);

        System.out.println("Bienvnue dans RPG Simulator!!!"+System.lineSeparator());
        for (int i=0;i<2;i++){
            while (!ok){
                System.out.println("Veuillez choisir le Personnage #"+(i+1));
                System.out.println("    1. Paladin");
                System.out.println("    2. Barbare");
                System.out.println("    3. Magicien Noir");
                System.out.println("    4. Magicien Rouge");
                System.out.println("Votre choix :");
                choix=sc.nextInt();
                ok=true;
                switch (choix){
                    case 1:
                        tabJoueur[i]=new Paladin();
                        break;
                    case 2:
                        tabJoueur[i]=new Barbare();
                        break;
                    case 3:
                        tabJoueur[i]=new MagicienNoir();
                        break;
                    case 4:
                        tabJoueur[i]=new MagicienRouge();
                        break;
                    default:
                        System.out.println("Veuillez entrez une réponse entre 1 et 4");
                        ok=false;
                }
            }
            ok=false;
        }
        while (!gameOver){
            tabJoueur[tour%2].attaquer(tabJoueur[(tour+1)%2]);
            //Verif mort
            if (tabJoueur[(tour+1)%2].getPtsVie()==0){
                gameOver=true;
            }

            if (gameOver){
                System.out.println("Le "+tabJoueur[(tour+1)%2].getNom()+" est mort. Le "+tabJoueur[tour%2].getNom()+" a gagné !");
            }
            if (tabJoueur[0] instanceof Magicien && tabJoueur[1] instanceof Magicien && ((Magicien)tabJoueur[0]).getPtsMagie()<2 && ((Magicien)tabJoueur[1]).getPtsMagie()<2 ){
                System.out.println("Les magiciens n'ont plus de points de magie, partie nulle !");
                gameOver=true;
            }
            tour++;
        }
    }
}
