package Model.Objet;
import Interface.Interactuable;

public class poulet extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description = "Soigne 10 HP";
    public int durabilite = 1;

    public poulet(String nom) {
        this.nom = nom;
    }

    @Override
    public void interagir() {
        durabilite -= 1;
        System.out.println("Boire");
        SeCasse();
    }

    @Override
    public void SeCasse() {
        System.out.println("La potion " + nom +" s'est détruit");
    }
}