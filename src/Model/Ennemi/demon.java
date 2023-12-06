package Model.Ennemi;

public class demon extends Ennemi {
    public boolean peutVoler;
    public String description;

    public demon(String nom) {
        super(nom);
        super.pointsDeVie = 20;
        super.force = 5;
    }

    public void voler (){

    }
    public void profil () {
        System.out.println("Le démon s'appelle " + nom + " il a " +
                pointsDeVie + " points de vie " + "et il a " + force + " de force ");
    }
}
