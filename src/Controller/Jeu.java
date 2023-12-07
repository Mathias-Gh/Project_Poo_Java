package Controller;

import Model.Personnage.Joueur;
import Utils.Console;
import Utils.TypeText;

import java.util.Scanner;

public class Jeu {
    public static void start(Joueur Player) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Console.clear();
            TypeText.write("Bonjour " + Player.nom + ", quel action souhaites-tu faire ?");
            System.out.println("\n");
            System.out.println("1. Combattre");
            System.out.println("2. Miner");
            System.out.println("3. Boutique");
            System.out.println("4. Quitter le jeu");
            System.out.println("Choisissez une option:");
            int optionJoueur = scanner.nextInt();
            if (optionJoueur == 1) {
                Combat.start(Player);
                continue;
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
    }
}
