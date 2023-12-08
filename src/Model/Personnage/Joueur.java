package Model.Personnage;

import Utils.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur extends Personnage {
    public int pointsDeVie;
    public int niveau;
    public ArrayList<String> inventaire;
    public int fer;
    public int or;
    public int diamant;

    public Joueur(String nom, int pointsDeVie, int niveau, int fer, int or, int diamant, ArrayList<String> inventaire) {
        super(nom);
        this.pointsDeVie = pointsDeVie;
        this.niveau = niveau;
        this.fer = fer;
        this.or = or;
        this.diamant = diamant;
        this.inventaire = inventaire;
    }

    @Override
    public void attaquer() {
        // Utiliser épée
    }

    @Override
    public void defendre() {
        // Utiliser armure
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getNiveau() {
        return niveau;
    }

    @Override
    public void profil () {
        Console.clear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Profil====");
        System.out.println("Nom: " + nom);
        System.out.println("Points de vie: " + pointsDeVie);
        System.out.println("Niveau: " + niveau);
        System.out.println("Fer: " + fer);
        System.out.println("Or: " + or);
        System.out.println("Diamant: " + diamant);
        System.out.println();
        System.out.println("====Inventaire====");
        System.out.println(inventaire);
        System.out.println();
        System.out.println("Quitter ?");
        scanner.next();

    }
}
