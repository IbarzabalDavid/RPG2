/**
 * Created by ibada1731710 on 2018-02-05.
 */
import arme.*;
import personnage.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choix=0;
        boolean ok=false;
        boolean ok2=false;
        int tour=0;
        int choix2;
        boolean gameOver=false;
        Personnage[] tabJoueur= new Personnage[2];
        Scanner sc =new Scanner(System.in);

        System.out.println("Bienvnue dans RPG Simulator!!!"+System.lineSeparator());
        for (int i=0;i<2;i++){
            while (!ok){
                System.out.println("Veuillez choisir le personnage.Personnage #"+(i+1));
                System.out.println("    1. Paladin");
                System.out.println("    2. Barbare");
                System.out.println("    3. Magicien Noir");
                System.out.println("    4. Magicien Rouge");
                System.out.println("Votre choix :");
                choix=sc.nextInt();
                ok=true;
                switch (choix){
                    case 1:
                        while (!ok2){
                            System.out.println("Quelle arme voulez-vous lui assigner");
                            System.out.println("    1. Épée ");
                            System.out.println("    2. Épée Magique");
                            System.out.println("    3. Épée Lourde");
                            System.out.println("    4. Masamune");
                            System.out.println("Votre choix :");
                            choix2=sc.nextInt();
                            ok2=true;
                            switch (choix2){
                                case 1:
                                    tabJoueur[i]=new Paladin(new Epee());
                                    break;
                                case 2:
                                    tabJoueur[i]=new Paladin(new EpeeMagique());
                                    break;
                                case 3:
                                    tabJoueur[i]=new Paladin(new EpeeLourde());
                                    break;
                                case 4:
                                    tabJoueur[i]=new Paladin(new Masamune());
                                    break;
                                default:
                                    System.out.println("Veuillez entrez une réponse entre 1 et 4");
                                    ok2=false;
                            }
                        }
                        ok2=false;

                        break;
                    case 2:
                        while (!ok2){
                            System.out.println("Quelle arme voulez-vous lui assigner");
                            System.out.println("    1. Masse ");
                            System.out.println("    2. Épée Lourde");
                            System.out.println("    3. Sceptre");
                            System.out.println("    4. Masamune");
                            System.out.println("Votre choix :");
                            choix2=sc.nextInt();
                            ok2=true;
                            switch (choix2){
                                case 1:
                                    tabJoueur[i]=new Barbare(new Masse());
                                    break;
                                case 2:
                                    tabJoueur[i]=new Barbare(new EpeeLourde());
                                    break;
                                case 3:
                                    tabJoueur[i]=new Barbare(new Sceptre());
                                    break;
                                case 4:
                                    tabJoueur[i]=new Barbare(new Masamune());
                                    break;
                                default:
                                    System.out.println("Veuillez entrez une réponse entre 1 et 4");
                                    ok2=false;
                            }
                        }
                        ok2=false;

                        break;
                    case 3:
                        while (!ok2){
                            System.out.println("Quelle arme voulez-vous lui assigner");
                            System.out.println("    1. Baguette ");
                            System.out.println("    2. Épée Magique");
                            System.out.println("    3. Sceptre");
                            System.out.println("    4. Masamune");
                            System.out.println("Votre choix :");
                            choix2=sc.nextInt();
                            ok2=true;
                            switch (choix2){
                                case 1:
                                    tabJoueur[i]=new MagicienNoir(new Baguette());
                                    break;
                                case 2:
                                    tabJoueur[i]=new MagicienNoir(new EpeeMagique());
                                    break;
                                case 3:
                                    tabJoueur[i]=new MagicienNoir(new Sceptre());
                                    break;
                                case 4:
                                    tabJoueur[i]=new MagicienNoir(new Masamune());
                                    break;
                                default:
                                    System.out.println("Veuillez entrez une réponse entre 1 et 4");
                                    ok2=false;
                            }
                        }
                        ok2=false;

                        break;
                    case 4:
                        while (!ok2){
                            System.out.println("Quelle arme voulez-vous lui assigner");
                            System.out.println("    1. Baguette ");
                            System.out.println("    2. Épée Magique");
                            System.out.println("    3. Sceptre");
                            System.out.println("    4. Masamune");
                            System.out.println("Votre choix :");
                            choix2=sc.nextInt();
                            ok2=true;
                            switch (choix2){
                                case 1:
                                    tabJoueur[i]=new MagicienRouge(new Baguette());
                                    break;
                                case 2:
                                    tabJoueur[i]=new MagicienRouge(new EpeeMagique());
                                    break;
                                case 3:
                                    tabJoueur[i]=new MagicienRouge(new Sceptre());
                                    break;
                                case 4:
                                    tabJoueur[i]=new MagicienRouge(new Masamune());
                                    break;
                                default:
                                    System.out.println("Veuillez entrez une réponse entre 1 et 4");
                                    ok2=false;
                            }
                        }
                        ok2=false;

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
