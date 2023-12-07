package Model.Objet;
import Interface.Interactuable;

public class steak extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description = "Soigne 15 HP";
    public int durabilite = 1;

    public steak(String nom) {
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