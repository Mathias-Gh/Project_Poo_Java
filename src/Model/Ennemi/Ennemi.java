package Model.Ennemi;

import Model.Personnage.Personnage;

public class Ennemi extends Personnage {
    int PointsDeVie;
    int degats;

    public int getPointsDeVie() {
        return PointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        PointsDeVie = pointsDeVie;
    }

    public int getDegats() {
        return degats;
    }


    public Ennemi(String nom) {
        super(nom);
    }

    public void attaquer() {
    }
    public void defendre() {
    }

    @Override
    public void profil() {
    }
}