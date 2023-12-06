package Model.Ennemi;

import Model.Personnage.Personnage;

public class geant extends Ennemi {
    public String description;

    public geant(String nom1, int pointsDeVie1, int force1) {
        super(nom1, pointsDeVie1, force1);
    }

    public void ecraser() {
    }
    public void profil () {
        System.out.println("Le geant s'appelle " + nom + " il a " +
                pointsDeVie + " points de vie " + "et il a " + force + " de force ");
    }
}