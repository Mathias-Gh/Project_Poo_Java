package Model.Ennemi;

public class warden extends Ennemi {
    public String description;

    public warden(String nom) {
        super(nom);
        super.pointsDeVie = 100;
        super.force = 30;
    }
    @Override
    public void attaquer() {
        super.attaquer();
    }
}
