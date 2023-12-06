package Model.Personnage;

public class Personnage {
    public String nom;
    public int pointsDeVie;
    public int force;

    public Personnage(String nom) {
        this.nom = nom;
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