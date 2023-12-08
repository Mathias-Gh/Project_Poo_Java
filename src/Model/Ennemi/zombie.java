package Model.Ennemi;

import java.util.ArrayList;

public class zombie extends Ennemi{
    // Attribut de la classe

    public String description;
    public int pointsDeVie;
    public int degats;

    // Constructeur
    public zombie(String nom, int pointsDeVie, int degats) {
        super(nom); // Nom du Warden de la classe Ennemi

        // Initialisation des attributs du zombie
        this.description = "Un zombie";
        this.pointsDeVie = pointsDeVie;
        this.degats = degats;
    }

    // Méthode profil qui affiche les informations concernant le zombie
    public void profil (){
        System.out.println("zombie");

        // Crée une liste d'inventaire pour le zombie
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

    // Retourne les dégâts du warden
    @Override
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    // Retourne les dégâts du warden
    public int getDegats() {
        return degats;
    }
}