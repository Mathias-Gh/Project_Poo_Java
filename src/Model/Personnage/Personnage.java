package Model.Personnage;

public class Personnage {
    public String nom;
    public int pointsDeVie;
    public int force;

    public Personnage(String nom, int pointsDeVie, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
    }

    public void attaquer() {

    }
    public void defendre() {

    }
    public void profil () {
        System.out.println("Le personnage s'appelle " + nom + " il a " +
                pointsDeVie + " points de vie " + "et il a " + force + " de force ");
    }
}