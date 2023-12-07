package Utils;

import Model.Personnage.Joueur;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Save {
    public static void game(Joueur Player) {
        try {
            PrintWriter save = new PrintWriter("Utils/save.txt");
            save.println("nom " + Player.nom);
            save.println("pv " + Player.pointsDeVie);
            save.println("niveau " + Player.niveau);
            save.println("fer " + Player.fer);
            save.println("or " + Player.or);
            save.println("diamant " + Player.diamant);
            save.println("inventaire:");
            for (String element : Player.inventaire) {
                save.println(element);
            }
            save.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
