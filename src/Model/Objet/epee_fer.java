package Model.Objet;

import Interface.Interactuable;
import Model.Ennemi.Ennemi;
import Model.Personnage.Personnage;

public class epee_fer extends ObjetDuJeu implements Interactuable {
    public epee_fer(String nom) {
        this.nom = nom;
        this.description = "Inflige 12 de dégats";
    }
    @Override
    public void interagir(Personnage ennemi) {
        ennemi.setPointsDeVie(ennemi.getPointsDeVie() - 12);
    }
}
