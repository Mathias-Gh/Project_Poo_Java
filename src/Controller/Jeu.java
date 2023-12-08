package Controller;

import Model.Objet.poulet;
import Model.Objet.steak;
import Model.Personnage.Joueur;
import Utils.Console;
import Utils.Save;
import Utils.TypeText;
import Model.Objet.poisson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeu {
    // Initialisation du lancement du jeu avec la méthode start
    public static void start(Joueur Player) {
        //
        while (true) { // on voyage à travers le menu et on parcours tout les chemins
            // possibles entre les différents éléments du jeu
            Scanner scanner = new Scanner(System.in);
            Console.clear();
            TypeText.write("Bonjour " + Player.nom + ", quel action souhaites-tu faire ?");
            System.out.println("\n");
            System.out.println("1. Combattre");
            System.out.println("2. Miner");
            System.out.println("3. Manger");
            System.out.println("4. Boutique");
            System.out.println("5. Infos");
            System.out.println("6. Sauvegarder et quitter le jeu");
            System.out.println("Choisissez une option:");
            int optionJoueur = scanner.nextInt();

            if (optionJoueur == 1) {
                Combat.start(Player);
            }
            else if (optionJoueur == 2) {
                Console.clear();
                System.out.println("Minage en cours...");
                Mine.start(Player);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (optionJoueur == 3) { // vérification de la nourriture dans l'inventaire
                String[] nourriture = {"poisson", "poulet", "steak"}; // tableau listant les types de nourritures
                // disponibles
                boolean nourritureExist = false;
                for (String n : nourriture) {
                    if (Player.inventaire.contains(n)) {
                        nourritureExist = true;
                        break; // Sortir de la boucle dès qu'un aliment est trouvé dans l'inventaire
                    }
                }

                if (nourritureExist) {
                    Console.clear();
                    System.out.println("Voici votre inventaire:");
                    System.out.println(Player.inventaire);
                    System.out.println("Que souhaitez-vous manger ?");
                    String manger = scanner.next();
                    // Switch sur le type de nourriture choisie
                    if (Player.inventaire.contains(manger)) {
                        switch (manger) {
                            case "poisson" -> {
                                poisson poisson = new poisson("poisson");
                                poisson.interagir(Player);
                                Player.inventaire.remove("poisson");
                                System.out.println("Vous savourez votre poisson..");
                            }
                            case "poulet" -> {
                                poulet poulet = new poulet("poulet");
                                poulet.interagir(Player);
                                Player.inventaire.remove("poulet");
                                System.out.println("Vous savourez votre poulet..");
                            }
                            case "steak" -> {
                                steak steak = new steak("steak");
                                steak.interagir(Player);
                                Player.inventaire.remove("steak");
                                System.out.println("Vous savourez votre steak..");
                            }
                        }
                    }
                    else {
                        System.out.println("Cette nourriture ne se trouve pas dans votre inventaire.");
                    }
                    sleep(2000);
                }
                else {
                    System.out.println("Vous n'avez pas de nourriture dans votre inventaire.");
                    sleep(2000);
                }
            }
            else if (optionJoueur == 4) { // Ouverture de la boutique
                Boutique.open(Player);
                sleep(2000);
            }
            else if (optionJoueur == 5) { // Affiche le profil du joueur
                Player.profil();
            }
            else if (optionJoueur == 6) { // Sauvegarde et quitte le jeu
                Save.game(Player);
                break;
            }
        }
    }


    public static void sleep(int milliseconds) { // Fonction permettant de mettre en pause le programme pendant un certain
        // temps
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
