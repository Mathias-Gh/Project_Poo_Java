package Controller;

// Tout les imports des autres pages
import Model.Ennemi.Ennemi;
import Model.Objet.epee_diamant;
import Model.Objet.epee_fer;
import Model.Objet.epee_or;
import Model.Personnage.Joueur;
import Utils.Console;
import Utils.TypeText;
import Model.Ennemi.zombie;
import Model.Ennemi.squelette;
import Model.Ennemi.araignee;
import Model.Ennemi.warden;
import Model.Objet.epee_bois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combat {
    // Initialisation d'un combat à l'aide de la méthode start()
    public static void start(Joueur joueur) {
        Scanner scanner = new Scanner(System.in);
        if (joueur.getNiveau() <= 2) { // Condition du choix de l'ennemi selon le niveau du joueur
            Console.clear();
            zombie zombie = new zombie("zombie", 10, 2);
            TypeText.write("Vous combattez un zombie.\n");
            combat(joueur, zombie);
        }
        else if (joueur.getNiveau() <= 4 & joueur.getNiveau() > 2) { // Condition du choix de l'ennemi selon le niveau du joueur
            Console.clear();
            squelette squelette = new squelette("squelette");
            TypeText.write("Vous combattez un squelette.\n");
            combat(joueur, squelette);
        }
        else if (joueur.getNiveau() <= 6 & joueur.getNiveau() > 4) { // Condition du choix de l'ennemi selon le niveau du joueur
            Console.clear();
            araignee araignee = new araignee("araignée", 20, 8);
            TypeText.write("Vous combattez une araignée.\n");
            combat(joueur, araignee);
        }
        else if (joueur.getNiveau() <= 8 & joueur.getNiveau() > 4) { // Condition du choix de l'ennemi selon le niveau du joueur
            Console.clear();
            warden warden = new warden("warden", 50, 20);
            TypeText.write("Vous combattez le Warden.\n");
            combat(joueur, warden);
        }
    }

    // Gestion du déroulement du combat entre le joueur et l'ennemi
    public static void combat(Joueur joueur, Ennemi ennemi) {
        Scanner scanner = new Scanner(System.in);
        // Tant que l'ennemi à des points de vie, la boucle continue
        while (ennemi.getPointsDeVie() > 0) {
            int option;
            System.out.println("C'est votre tour:");
            System.out.println("1. Attaquer");
            System.out.println("2. Ne rien faire");
            System.out.println("Choisissez une option (1-2):");
            try {
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
                System.out.println("Voici votre inventaire:");
                System.out.println(joueur.inventaire);
                System.out.println("Quel arme souhaitez-vous utiliser ?");
                String arme = scanner.next();
                if (joueur.inventaire.contains(arme)) {
                    if (arme.equals("epee_bois")) {
                        epee_bois epee_bois = new epee_bois("epeeBois");
                        epee_bois.interagir(ennemi);
                    }
                    if (arme.equals("epee_fer")) {
                        epee_fer epee_fer = new epee_fer("epeeFer");
                        epee_fer.interagir(ennemi);
                    }
                    if (arme.equals("epee_or")) {
                        epee_or epee_or = new epee_or("epeeOr");
                        epee_or.interagir(ennemi);
                    }
                    if (arme.equals("epee_diamant")) {
                        epee_diamant epee_diamant = new epee_diamant("epeeDiamant");
                        epee_diamant.interagir(ennemi);
                    }
                }
            }
            // Le joueur ne fait rien, il passe son tour
            else if (option == 2) {
            }
            Console.clear();
            System.out.println("Tour de l'adversaire:");

            // L'ennemi attaque de manière aléatoire ou ne fait rien
            int n = (int)(Math.random()*2);
            if (n != 1) {
                System.out.println("Le " + ennemi.nom + " vous attaque et vous retire " + ennemi.getDegats() + " HP");
                joueur.pointsDeVie -= ennemi.getDegats();
            }
            else {
                System.out.println("Le " + ennemi.nom + " est passif et ne vous attaque pas.");
            }
            System.out.println(joueur.getPointsDeVie());
            if (joueur.getPointsDeVie() < 1) {
                System.out.println("Vous avez perdu !");
                System.exit(1);
            }
        }

        // Le combat est terminé lorque l'ennemi n'a plus de points de vie
        System.out.println("Vous avez gagné le combat.");
        System.out.println("Vous avez gagné un niveau !");
        joueur.niveau += 1;
        sleep(3000);
    }
    public static void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
