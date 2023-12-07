package Model.Objet;

import Interface.Interactuable;

public class epee_fer extends ObjetDuJeu implements Interactuable {
    public epee_fer(String nom) {
        this.nom = nom;
        this.description = "Inflige 10 de dégats";
        this.durabilite = 20;
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
        System.out.println("L'épée en fer s'est détruite");
    }
}