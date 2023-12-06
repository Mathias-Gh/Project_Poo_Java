package Sous_Classes;
import Classes.ObjetDuJeu;

public class potion extends ObjetDuJeu {
    public String nom;
    public String description;
    public Boolean estUtilise = false;

    public potion(String nom, String description, Boolean estUtilise) {
        this.nom = nom;
        this.description = description;
        this.estUtilise = estUtilise;
    }

    @Override
    public void Utiliser() {
        System.out.println("Boire une potion");
        estUtilise = true;
    }
}