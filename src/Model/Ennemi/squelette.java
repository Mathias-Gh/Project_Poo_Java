package Model.Ennemi;

import java.util.ArrayList;

public class squelette extends Ennemi{
    // Attribut de la classe
    public String description;
    public int pointsDeVie;
    int degats;

    // Constructeur
    public squelette(String nom/**, int pointsDeVie, int degats**/) {
        super(nom);// Nom du squelette de la classe Ennemi

        // Initialisation des attributs du squelette
        this.description = "Un squelette";
        this.pointsDeVie = 15;
        this.degats = 5;
    }

    // Méthode profil qui affiche les informations concernant le squelette
    public void profil (){
        System.out.println("squelette");

        // Crée une liste d'inventaire pour le squelette
        ArrayList<String> listeInventaire = new ArrayList<String>();

        listeInventaire.add("poisson");

        // Affiche l'inventaire + gestion d'erreur si il est vide
        System.out.println("inventaire: " + listeInventaire);
        try {
            System.out.println("Inventaire: " + listeInventaire.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("L'inventaire est vide");
        }
    }

    // Méthode attaquer() appelant la méthode attaquer de la classe Ennemi (parente)
    public void attaquer() {
        super.attaquer();
    }

    // Permet de définir les points de vie du squelette
    @Override
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    // Retourne les dégâts du squelette
    public int getDegats() {
        return degats;
    }
}
