package Model.Ennemi;

import Model.Personnage.Personnage;

public class Ennemi extends Personnage {
    // Attribut de la classe
    int PointsDeVie;
    int degats;

    // Constructeur
    public Ennemi(String nom) {
        super(nom);
    }

    // Récupération des points de vie
    public int getPointsDeVie() {
        return PointsDeVie;
    }

    // Permet de définir les points de vie
    public void setPointsDeVie(int pointsDeVie) {
        PointsDeVie = pointsDeVie;
    }

    // Retourne les dégâts infligés par l'ennemi
    public int getDegats() {
        return degats;
    }

    // Méthode attaquer()
    public void attaquer() {
    }

    // Méthode defendre()
    public void defendre() {
    }

    // Méthode profil
    @Override
    public void profil() {
    }
}