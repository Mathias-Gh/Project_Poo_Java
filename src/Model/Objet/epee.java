package Model.Objet;

import Interface.Interactuable;

public class epee extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description;
    public int durabilite;

    public epee(String nom, String description, int durabilite) {
        this.nom = nom;
        this.description = description;
        this.durabilite = durabilite;
    }

    @Override
    public void interagir() {
        durabilite -= 1;
        System.out.println("Attaque");
        if(durabilite < 1) {
            SeCasse();
        }
    }

    @Override
    public void SeCasse() {
        System.out.println("L'épée " + nom +" s'est détruit");
    }
}