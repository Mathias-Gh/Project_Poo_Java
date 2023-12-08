package Model.Objet;

import Interface.Interactuable;
import Model.Ennemi.Ennemi;
import Model.Personnage.Personnage;

public class epee_bois extends ObjetDuJeu implements Interactuable {
    public epee_bois(String nom) {
        this.nom = nom;
        this.description = "Inflige 5 de dégats";
    }
    @Override
    public void interagir(Personnage ennemi) {
        ennemi.setPointsDeVie(ennemi.getPointsDeVie() - 5);
    }
}