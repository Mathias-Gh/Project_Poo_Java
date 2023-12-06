public class demon extends Ennemi{
    public boolean peutVoler;
    public String description;

    public demon(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
    }

    public void voler (){

    }
    public void profil () {
        System.out.println("Le démon s'appelle " + nom + " il a " +
                pointsDeVie + " points de vie " + "et il a " + force + " de force ");
    }
}
