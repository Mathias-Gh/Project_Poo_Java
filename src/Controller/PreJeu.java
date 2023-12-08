package Controller;

import Model.Personnage.Joueur;
import Utils.ChargerJoueur;
import Utils.Console;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PreJeu {
    // Gestion du menu du pre-jeu à l'aide de la méthode start()
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int optionJeu;
        while (true) {
            Console.clear(); // Efface la console (le terminal)
            System.out.println("Menu du jeu:");
            System.out.println("1. Créer un personnage");
            System.out.println("2. Charger un personnage");
            System.out.println("3. Quitter");
            System.out.println("Choisissez une option (1-3):");
            try {
                // Vérifier si l'entrée est un nombre
                if (scanner.hasNextInt()) {
                    optionJeu = scanner.nextInt();
                } else {
                    System.out.println("Veuillez entrer un nombre.");
                    sleep(3000);
                    scanner.next(); // Consommer l'entrée invalide
                    continue;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace(); // Afficher les détails de l'exception pour le débogage
                continue;
            }

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
            else if (optionJeu == 2) {
                Console.clear(); // Efface la console (le terminal)
                Jeu.start(ChargerJoueur.start());
                break;
            }
            // Quitter le menu
            else if (optionJeu == 3) {
                break;
            }
            else {
                System.out.println("Cette option n'existe pas. Veuillez entrer une option valide");
                sleep(2000);
            }
        }
    }
    public static void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}