package Model.Objet;

import Interface.Interactuable;

public class armure_diamant extends ObjetDuJeu implements Interactuable {
    public armure_diamant(String nom) {
        this.nom = nom;
        this.description = "Protège 90% des dégats reçu";
        this.durabilite = 50;
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
