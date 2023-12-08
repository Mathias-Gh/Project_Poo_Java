package Model.Objet;

import Interface.Interactuable;
import Model.Ennemi.Ennemi;
import Model.Personnage.Personnage;

public class epee_diamant extends ObjetDuJeu implements Interactuable {
    public epee_diamant(String nom) {
        this.nom = nom;
        this.description = "Inflige 30 de dégats";
    }
    @Override
    public void interagir(Personnage ennemi) {
        ennemi.setPointsDeVie(ennemi.getPointsDeVie() - 30);
    }
}
