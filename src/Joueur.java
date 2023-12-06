public class Joueur extends Personnage{
    public String Pseudo;
    public Boolean genre;

    public Joueur(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
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
