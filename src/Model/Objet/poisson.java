package Model.Objet;
import Interface.Interactuable;

public class poisson extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description = "Soigne 5 HP";
    public int durabilite = 1;

    public poisson(String nom) {
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