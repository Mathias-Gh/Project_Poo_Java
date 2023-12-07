package Model.Ennemi;

import Model.Personnage.Personnage;

public class geant extends Ennemi {
    public String description;

    public geant(String nom) {
        super(nom);
        super.pointsDeVie = 50;
        super.force = 15;
    }

    public void ecraser() {
    }
    public void profil () {
        System.out.println("Le geant s'appelle " + nom + " il a " +
                pointsDeVie + " points de vie " + "et il a " + force + " de force ");
    }
}