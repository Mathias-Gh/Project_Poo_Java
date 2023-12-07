package Model.Ennemi;

public class araignee extends Ennemi{
    public String description;

    public araignee(String nom) {
        super(nom);
        super.pointsDeVie = 10;
        super.force = 2;
    }

    public void attaquer() {
        super.attaquer();
    }
}
