package Model.Ennemi;

import java.util.ArrayList;

public class warden extends Ennemi {
    public String description;

    public warden(String nom) {
        super(nom);
        super.pointsDeVie = 100;
        super.force = 30;
    }

    public void profil (){
        System.out.println("warden");

        ArrayList<String> listeInventaire = new ArrayList<String>();

        listeInventaire.add("poisson");

        System.out.println("inventaire: " + listeInventaire);
        try {
            System.out.println("Inventaire: " + listeInventaire.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("L'inventaire est vide");
        }
    }
    @Override
    public void attaquer() {
        super.attaquer();
    }
}
