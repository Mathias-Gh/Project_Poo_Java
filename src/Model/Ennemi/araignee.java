package Model.Ennemi;

import java.util.ArrayList;

public class araignee extends Ennemi{
    public String description;
    public int pointsDeVie;
    public int degats;

    public araignee(String nom, int pointsDeVie, int degats) {
        super(nom);
        this.description = "Une araignée";
        this.pointsDeVie = pointsDeVie;
        this.degats = degats;
    }
    public void profil (){
        System.out.println("araignée");

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

    @Override
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getDegats() {
        return degats;
    }
}
