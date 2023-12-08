package Controller;

import Model.Personnage.Joueur;
import Utils.ChargerJoueur;
import Utils.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class PreJeu {
    // Gestion du menu du pre-jeu à l'aide de la méthode start()
    public static void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Console.clear(); // Efface la console (le terminal)
            System.out.println("Menu du jeu:");
            System.out.println("1. Créer un personnage");
            System.out.println("2. Charger un personnage");
            System.out.println("3. Quitter");
            System.out.println("Choisissez une option:");
            int optionJeu = scanner.nextInt();

            // Création d'un personnage
            if (optionJeu == 1) {
                System.out.println("Quel est le nom de votre personnage ?");
                String nomPersonnage = scanner.next();
                ArrayList<String> inventaire = new ArrayList<>();
                inventaire.add("poisson");
                inventaire.add("epee_bois");
                Joueur Player = new Joueur(nomPersonnage, 10, 1, 0, 0, 0, inventaire);
                Console.clear(); // Efface la console (le terminal)
                Jeu.start(Player);
                break;
            }

            // Charger le personnage déjà existant
            if (optionJeu == 2) {
                Console.clear(); // Efface la console (le terminal)
                Jeu.start(ChargerJoueur.start());
                break;
            }

            // Quitter le menu
            if (optionJeu == 3) {
                break;
            }
        }
    }
}