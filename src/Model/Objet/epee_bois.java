package Model.Objet;

import Interface.Interactuable;
import Model.Ennemi.Ennemi;

public class epee_bois extends ObjetDuJeu implements Interactuable {
    public epee_bois(String nom) {
        this.nom = nom;
        this.description = "Inflige 5 de dégats";
        this.durabilite = 10;
    }

    @Override
    public void SeCasse() {
        System.out.println("L'épée en bois s'est détruite");
    }

    @Override
    public void interagir(Ennemi ennemi) {
        durabilite -= 1;
        ennemi.setPointsDeVie(ennemi.getPointsDeVie() - 5);
        if(durabilite < 1) {
            SeCasse();
        }
    }
}
