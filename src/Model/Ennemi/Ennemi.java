package Model.Ennemi;

import Model.Personnage.Personnage;

public class Ennemi extends Personnage {
    int PointsDeVie;

    public int getPointsDeVie() {
        return PointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        PointsDeVie = pointsDeVie;
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