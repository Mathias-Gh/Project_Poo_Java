package Controller;

import Model.Personnage.Joueur;
import Utils.Console;
import Utils.TypeText;
import Model.Ennemi.zombie;
import Model.Objet.epee_bois;

import java.util.Scanner;

public class Combat {
    public static void start(Joueur joueur) {
        Scanner scanner = new Scanner(System.in);
        if (Joueur.getNiveau() < 2) {
            Console.clear();
            zombie zombie = new zombie("zombie", 10);
            TypeText.write("Vous combattez un zombie.\n");
            while (zombie.getPointsDeVie() > 0) {
                System.out.println("C'est votre tour:");
                System.out.println("1. Attaquer");
                System.out.println("2. Défendre");
                System.out.println("3. Ne rien faire");
                System.out.println("Choisissez une option:");
                int option = scanner.nextInt();
                if (option == 1) {
                    epee_bois epeeBois = new epee_bois("epeeBois");
                    epeeBois.interagir(zombie);
                }
                else if (option == 2) {

                }
                else if (option == 3) {
                }

            }
            joueur.exp += 2;
            System.out.println("Vous avez gagné le combat.");
            System.out.println("Vous avez gagné 2 EXP.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
