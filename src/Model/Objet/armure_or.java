package Model.Objet;

import Interface.Interactuable;

public class armure_or extends ObjetDuJeu implements Interactuable {
    public armure_or(String nom) {
        this.nom = nom;
        this.description = "Protège 60% des dégats reçu";
        this.durabilite = 30;
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
