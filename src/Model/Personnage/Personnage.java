package Model.Personnage;

public abstract class Personnage {
    public String nom;
    public int pointsDeVie;
    public static int niveau = 1;

    public Personnage(String nom) {
        this.nom = nom;
    }

    public abstract void attaquer();
    public abstract void defendre();
    public abstract void profil ();
}