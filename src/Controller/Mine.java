package Controller;

import Model.Personnage.Joueur;
import Model.Personnage.Personnage;
import Utils.ChargementMinage;

public class Mine {
    public static void start(Joueur joueur) {
        int pourcent = (int) (Math.random()*99);
        for (int i = 0; i <= 100; i++) {
            ChargementMinage.afficherBarreDeChargement(i,100);
            ChargementMinage.attendre(100);
        }
        if (pourcent >= 0 & pourcent < 60) {
            System.out.println("\nVous avez trouvé du fer !");
            joueur.fer += 1;
        }
        if (pourcent > 59 & pourcent < 90) {
            System.out.println("\nVous avez trouvé de l'or !");
            joueur.or += 1;
        }
        if (pourcent > 89 & pourcent < 100) {
            System.out.println("\nVous avez trouvé du diamant !");
            joueur.diamant += 1;
        }
    }
}
