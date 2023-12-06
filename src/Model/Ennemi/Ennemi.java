package Model.Ennemi;

import Model.Personnage.Personnage;

public class Ennemi extends Personnage {
    public String nom;
    public int pointsDeVie;
    public int force;

    public Ennemi(String nom1, int pointsDeVie1, int force1) {
        super(nom1, pointsDeVie1, force1);
        this.nom = nom1;
        this.pointsDeVie = pointsDeVie1;
        this.force = force1;
    }

    public void attaquer() {

    }
    public void defendre() {

    }
}