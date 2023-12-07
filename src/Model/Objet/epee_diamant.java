package Model.Objet;

import Interface.Interactuable;

public class epee_diamant extends ObjetDuJeu implements Interactuable {
    public epee_diamant(String nom) {
        this.nom = nom;
        this.description = "Inflige 30 de dégats";
        this.durabilite = 60;
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
        System.out.println("L'épée en diamant s'est détruite");
    }
}