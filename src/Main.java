import Utils.Console;
import Controller.PreJeu;
import Controller.Combat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
            Console.clear(); // Efface la console (le terminal)
            System.out.println("Menu principal:");
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");
            System.out.println("Choisissez une option (1-2):");
            try {
                // Vérifier si l'entrée est un nombre
                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
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

            if (option == 1) {
                PreJeu.start();
                break;
            }
            else if (option == 2) {
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