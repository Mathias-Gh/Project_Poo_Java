package Model.Ennemi;

import java.util.ArrayList;

public class araignee extends Ennemi{
    public String description;

    public araignee(String nom) {
        super(nom);
        super.pointsDeVie = 10;
        super.force = 2;
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
}
