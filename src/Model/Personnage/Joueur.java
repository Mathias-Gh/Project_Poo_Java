package Model.Personnage;

public class Joueur extends Personnage {
    public int exp = 0;

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
    }

    public static int getNiveau() {
        return niveau;
    }
}
