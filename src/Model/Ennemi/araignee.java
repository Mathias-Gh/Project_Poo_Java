package Model.Ennemi;

import java.util.ArrayList;

public class araignee extends Ennemi{
    // Attribut de la classe
    public String description;
    public int pointsDeVie;
    public int degats;

    // Constructeur
    public araignee(String nom, int pointsDeVie, int degats) {
        super(nom); // Nom de l'araignée de la classe Ennemi

        // Initialisation des attributs de l'araignée
        this.description = "Une araignée";
        this.pointsDeVie = pointsDeVie;
        this.degats = degats;
    }

    // Méthode profil qui affiche les informations concernant l'araignée
    public void profil (){
        System.out.println("araignée");

        // Crée une liste d'inventaire pour l'araignée
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

    // Récupération des points de vie de l'araignée
    @Override
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    // Permet de définir les points de vie de l'araignée
    @Override
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    // Retourne les dégâts de l'araignée
    public int getDegats() {
        return degats;
    }
}
