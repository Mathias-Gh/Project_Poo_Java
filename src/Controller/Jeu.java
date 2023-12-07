package Controller;

import Model.Personnage.Joueur;
import Utils.Console;
import Utils.TypeText;
import Controller.Combat;

import java.util.Scanner;

public class Jeu {
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

            if (optionJeu == 1) {
                System.out.println("Quel est le nom de votre personnage ?");
                String nomPersonnage = scanner.next();
                Joueur Player = new Joueur(nomPersonnage);
                Console.clear(); // Efface la console (le terminal)
                TypeText.write("Bonjour " + Player.nom + ", quel action souhaites-tu faire ?");
                System.out.println("\n");
                System.out.println("1. Combattre");
                System.out.println("2. Miner");
                System.out.println("3. Boutique");
                System.out.println("4. Quitter le jeu");
                System.out.println("Choisissez une option:");
                int optionJoueur = scanner.nextInt();
                if (optionJoueur == 1) {
                    Combat.start();
                    break;
                }
                else if (optionJoueur == 2) {
                    // Miner
                }
                else if (optionJoueur == 3) {
                    // Boutique
                }
                else if (optionJoueur == 4) {
                    break;
                }
            }
            if (optionJeu == 2) {
                Console.clear(); // Efface la console (le terminal)
                System.out.println("Charger personnage");
                break;
            }
            if (optionJeu == 3) {
                break;
            }
        }
    }
}