package Model.Objet;
import Interface.Interactuable;
import Model.Personnage.Personnage;

public class poulet extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description = "Soigne 10 HP";

    public poulet(String nom) {
        this.nom = nom;
    }

    @Override
    public void interagir(Personnage Player) {
        Player.pointsDeVie += 10;
    }
}