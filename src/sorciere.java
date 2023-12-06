public class sorciere extends Ennemi{
    public String description;
    public boolean peutInvoquerSquelettes;

    public sorciere(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
    }

    public void invoquer(){

    }
    public void attaquer() {
        super.attaquer();
    }
    public void profil () {
        System.out.println("La sorcière s'appelle " + nom + " il a " +
                pointsDeVie + " points de vie " + "et il a " + force + " de force ");
    }
}
