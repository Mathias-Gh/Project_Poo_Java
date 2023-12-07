package Utils;

import Model.Personnage.Joueur;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChargerJoueur {
    public static Joueur start() {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> inventaire = new ArrayList<>();
        try {
            Scanner readSave = new Scanner(new File("Utils/save.txt"));
            while (readSave.hasNextLine()) {
                String line = readSave.nextLine();
                String[] words = line.split(" ");
                Collections.addAll(data, words);
            }
            String nom = data.get(data.indexOf("nom")+1);
            int pointsDeVie = Integer.parseInt(data.get(data.indexOf("pv")+1));
            int niveau = Integer.parseInt(data.get(data.indexOf("niveau")+1));
            int fer = Integer.parseInt(data.get(data.indexOf("fer")+1));
            int or = Integer.parseInt(data.get(data.indexOf("or")+1));
            int diamant = Integer.parseInt(data.get(data.indexOf("diamant")+1));
            for (int f = 1; f<data.size()-12; f++) {
                inventaire.add(data.get(data.indexOf("inventaire:")+f));
            }
            Joueur Player = new Joueur(nom, pointsDeVie, niveau, fer, or, diamant, inventaire);
            return Player;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
