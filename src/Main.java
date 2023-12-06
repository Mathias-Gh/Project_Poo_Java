import Model.Personnage.Joueur;
import Utils.Console;
import Utils.TypeText;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Console.clear(); // Efface la console (le terminal)
            System.out.println("Menu principal:");
            System.out.println("1. Jouer");
            System.out.println("2. Boutique");
            System.out.println("3. Quitter");
            System.out.println("Choisissez une option:");
            int option = scanner.nextInt();

            if (option == 1) {
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
                    Joueur newPlayer = new Joueur(nomPersonnage);
                    Console.clear(); // Efface la console (le terminal)
                    TypeText.write("Bonjour " + nomPersonnage + ", ton aventure commence ici.");
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
            else if (option == 2) {
                System.out.println("Boutique");
                break;
            }
            else if (option == 3) {
                break;
            }
            else {
                System.out.println("Cette option n'existe pas. Veuillez entrer une option valide");
            }
        }
    }
}