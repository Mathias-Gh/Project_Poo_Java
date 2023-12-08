package Controller;

import Model.Personnage.Joueur;
import Utils.Console;

import java.util.Scanner;

public class Boutique {
    public static void open(Joueur player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Console.clear();
            System.out.println("Boutique:");
            System.out.println("1. Épée en fer - 2 fer");
            System.out.println("2. Poisson - 1 fer");
            System.out.println("3. Épée en or - 2 or");
            System.out.println("4. Poulet - 1 or");
            System.out.println("5. Épée en diamant - 2 diamant");
            System.out.println("6. Steak - 1 diamant");
            System.out.println("7. Quitter la boutique");
            System.out.println("Veuillez choisir une option (1-7):");
            int option = scanner.nextInt();
            if (option == 1) {
                if (player.fer >= 2) {
                    player.fer -= 2;
                    player.inventaire.add("epee_fer");
                    System.out.println("Vous avez acheté une épée en fer.");
                    sleep(3000);
                }
                else {
                    System.out.println("Vous n'avez pas assez de fer");
                    sleep(3000);
                }
            }
            if (option == 2) {
                if (player.fer >= 1) {
                    player.fer -= 1;
                    player.inventaire.add("poisson");
                    System.out.println("Vous avez acheté du poisson.");
                    sleep(3000);
                }
                else {
                    System.out.println("Vous n'avez pas assez de fer");
                    sleep(3000);
                }
            }
            if (option == 3) {
                if (player.or >= 2) {
                    player.or -= 2;
                    player.inventaire.add("epee_or");
                    System.out.println("Vous avez acheté une épée en or.");
                    sleep(3000);
                }
                else {
                    System.out.println("Vous n'avez pas assez d'or");
                    sleep(3000);
                }
            }
            if (option == 4) {
                if (player.or >= 1) {
                    player.or -= 1;
                    player.inventaire.add("poulet");
                    System.out.println("Vous avez acheté du poulet.");
                    sleep(3000);
                }
                else {
                    System.out.println("Vous n'avez pas assez d'or");
                    sleep(3000);
                }
            }
            if (option == 5) {
                if (player.diamant >= 2) {
                    player.diamant -= 2;
                    player.inventaire.add("epee_diamant");
                    System.out.println("Vous avez acheté une épée en diamant.");
                    sleep(3000);
                }
                else {
                    System.out.println("Vous n'avez pas assez de diamant");
                    sleep(3000);
                }
            }
            if (option == 6) {
                if (player.diamant >= 1) {
                    player.diamant -= 1;
                    player.inventaire.add("steak");
                    System.out.println("Vous avez acheté du steak.");
                    sleep(3000);
                }
                else {
                    System.out.println("Vous n'avez pas assez de diamant");
                    sleep(3000);
                }
            }
            if (option == 7) {
                break;
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
