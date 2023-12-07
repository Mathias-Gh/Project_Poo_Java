package Model.Ennemi;

public class zombie extends Ennemi{
    public String description;
    public int pointsDeVie;

    public zombie(String nom, int pointsDeVie) {
        super(nom);
        this.description = "Un zombie";
        this.pointsDeVie = pointsDeVie;
    }

    public void attaquer() {
        super.attaquer();
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
}
