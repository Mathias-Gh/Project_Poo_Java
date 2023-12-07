package Model.Objet;

import Interface.Interactuable;
import Model.Ennemi.Ennemi;

public class Armure_or extends ObjetDuJeu implements Interactuable {
    public Armure_or(String nom) {
        this.nom = nom;
        this.description = "Protège 60% des dégats reçu";
        this.durabilite = 30;
    }
    @Override
    public void interagir(Ennemi Ennemi) {
        durabilite -= 1;
        System.out.println("Protège des dégats");
        SeCasse();
    }
    @Override
    public void SeCasse() {
        System.out.println(String.format("L'armure %s s'est détruite", nom));
    }
}
