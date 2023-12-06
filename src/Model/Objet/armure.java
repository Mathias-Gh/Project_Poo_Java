package Model.Objet;

import Interface.Interactuable;

public class armure extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description;
    public int durabilite;
    public armure(String nom, String description, int durabilite) {
        this.nom = nom;
        this.description = description;
        this.durabilite = durabilite;
    }

    @Override
    public void interagir() {
        durabilite -= 1;
        System.out.println("Protège des dégats");
        SeCasse();
    }
    @Override
    public void SeCasse() {
        System.out.println("L'armure " + nom + " s'est détruit");
    }
}
