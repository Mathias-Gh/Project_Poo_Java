package Model.Objet;

import Interface.Interactuable;
import Model.Ennemi.Ennemi;
import Model.Personnage.Personnage;

public class epee_or extends ObjetDuJeu implements Interactuable {
    public epee_or(String nom) {
        this.nom = nom;
        this.description = "Inflige 20 de dégats";
    }
    @Override
    public void interagir(Personnage ennemi) {
        ennemi.setPointsDeVie(ennemi.getPointsDeVie() - 5);
    }
}
