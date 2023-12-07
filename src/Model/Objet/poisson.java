package Model.Objet;
import Interface.Interactuable;
import Model.Personnage.Personnage;

public class poisson extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description = "Soigne 5 HP";

    public poisson(String nom) {
        this.nom = nom;
    }

    @Override
    public void interagir(Personnage Player) {
        Player.pointsDeVie += 5;
    }
}