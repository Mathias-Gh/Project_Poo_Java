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
            String objet = listeInventaire.get(2);
            System.out.println("objet à l index 10 : " + objet);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("l index est hors limites");
        }
    }

    public static int getNiveau() {
        return niveau;
    }
}
