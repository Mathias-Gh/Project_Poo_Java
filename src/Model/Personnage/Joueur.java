package Model.Personnage;

public class Joueur extends Personnage {
    public int piece = 0;

    public Joueur(String nom) {
        super(nom);
        super.pointsDeVie = 10;
        super.force = 2;
    }

    public void equiper(){

    }
    public void utiliser(){

    }
    @Override
    public void profil () {
        System.out.println("Vous vous appellez " + nom + " vous avez " +
                pointsDeVie + " points de vie " + "et vous avez " + force + " de force ");
    }
}
