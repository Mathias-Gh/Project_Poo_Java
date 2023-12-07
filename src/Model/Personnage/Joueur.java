package Model.Personnage;

import java.util.ArrayList;

public class Joueur extends Personnage {
    public int piece = 0;

    public Joueur(String nom) {
        super(nom);
        super.pointsDeVie = 10;
    }

    @Override
    public void attaquer() {
        // Utiliser épée
    }

    @Override
    public void defendre() {
        // Utiliser armure
    }

    @Override
    public void profil () {
        System.out.println("-----Profil-----");
        System.out.println("Nom: " + nom);
        System.out.println("Points de vie: " + pointsDeVie);
        System.out.println("Niveau: " + niveau);

        ArrayList<String> listeInventaire = new ArrayList<String>();

        listeInventaire.add("poisson");
        listeInventaire.add("poisson");
        listeInventaire.add("poisson");
        listeInventaire.add("épée bronze");

        System.out.println("inventaire: " + listeInventaire);
        try {
            // Try to access an element at an index that may not exist
            String item = listeInventaire.get(10);
            System.out.println("Item at index 10: " + item);
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception if the index is out of bounds
            System.out.println("Exception: Index is out of bounds");
        }
    }

    public static int getNiveau() {
        return niveau;
    }
}
