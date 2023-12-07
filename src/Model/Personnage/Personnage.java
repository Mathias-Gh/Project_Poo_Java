package Model.Personnage;

import java.util.ArrayList;

public abstract class Personnage {
    public String nom;
    public int pointsDeVie;
    public ArrayList<String> inventaire;
    public int force;
    public static int niveau = 1;

    public Personnage(String nom) {
        this.nom = nom;
    }

    public abstract void attaquer();
    public abstract void defendre();
    public abstract void profil ();

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
}