package Model.Ennemi;

public class squelette extends Ennemi{
    public String description;

    public squelette(String nom) {
        super(nom);
        super.pointsDeVie = 10;
        super.force = 2;
    }

    public void attaquer() {
        super.attaquer();
    }
}
