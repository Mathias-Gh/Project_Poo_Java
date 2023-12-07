package Model.Objet;

import Interface.Interactuable;

public abstract class Armure_fer extends ObjetDuJeu implements Interactuable {
    public Armure_fer(String nom) {
        this.nom = nom;
        this.description = "Protège 30% des dégats reçu";
        this.durabilite = 20;
    }

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
