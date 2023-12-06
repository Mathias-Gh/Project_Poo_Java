package Model.Objet;
import Interface.Interactuable;

public class potion extends ObjetDuJeu implements Interactuable {
    public String nom;
    public String description;
    public int durabilite = 1;

    public potion(String nom, String description, int durabilite) {
        this.nom = nom;
        this.description = description;
        this.durabilite = durabilite;
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