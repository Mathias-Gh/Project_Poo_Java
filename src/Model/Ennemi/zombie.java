package Model.Ennemi;

import java.util.ArrayList;

public class zombie extends Ennemi{
    public String description;
    public int pointsDeVie;

    public zombie(String nom, int pointsDeVie) {
        super(nom);
        this.description = "Un zombie";
        this.pointsDeVie = pointsDeVie;
    }
    public void profil (){
        System.out.println("zombie");

        ArrayList<String> listeInventaire = new ArrayList<String>();

        listeInventaire.add("poisson");

        System.out.println("inventaire: " + listeInventaire);
        try {
            System.out.println("Inventaire: " + listeInventaire.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("L'inventaire est vide");
        }
    }

    public void attaquer() {
        super.attaquer();
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
}
