package Model.Objet;
import Interface.Interactuable;
import Model.Personnage.Personnage;

public class steak extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description = "Soigne 15 HP";

    public steak(String nom) {
        this.nom = nom;
    }

    @Override
    public void interagir(Personnage Player) {
        Player.pointsDeVie += 15;
    }
}