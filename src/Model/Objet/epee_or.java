package Model.Objet;

import Interface.Interactuable;

public class epee_or extends ObjetDuJeu implements Interactuable {
    public epee_or(String nom) {
        this.nom = nom;
        this.description = "Inflige 20 de dégats";
        this.durabilite = 30;
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
        System.out.println("L'épée en or s'est détruite");
    }
}