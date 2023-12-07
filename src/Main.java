import Model.Personnage.Joueur;
import Model.Ennemi.squelette;
import Utils.Console;
import Utils.TypeText;
import Controller.Jeu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Console.clear(); // Efface la console (le terminal)
            System.out.println("Menu principal:");
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");
            System.out.println("Choisissez une option:");
            int option = scanner.nextInt();

            if (option == 1) {
                Jeu.start();
                break;
            }
            else if (option == 2) {
                break;
            }
            else {
                System.out.println("Cette option n'existe pas. Veuillez entrer une option valide");
            }
        }
    }
}