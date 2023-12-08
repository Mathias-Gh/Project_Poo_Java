package Controller;

import Model.Personnage.Joueur;
import Model.Personnage.Personnage;
import Utils.ChargementMinage;

public class Mine {
    // Initialisation du mode de minage avec la méthode start()
    public static void start(Joueur joueur) {
        // Génération d'un pourcentage aléatoire pour déterminer le minerais obtenu
        int pourcent = (int) (Math.random()*99);

        // Affichage de la barre de pourcentage
        for (int i = 0; i <= 100; i++) {
            ChargementMinage.afficherBarreDeChargement(i,100);
            ChargementMinage.attendre(100);
        }

        // Selon le pourcentage obtenu, le joueur obtient tel minerais
        if (pourcent >= 0 & pourcent < 60) {
            System.out.println("\nVous avez trouvé du fer !");
            joueur.fer += 1; // Ajoute le minerais à l'inventaire
        }
        if (pourcent > 59 & pourcent < 90) {
            System.out.println("\nVous avez trouvé de l'or !");
            joueur.or += 1; // Ajoute le minerais à l'inventaire
        }
        if (pourcent > 89 & pourcent < 100) {
            System.out.println("\nVous avez trouvé du diamant !");
            joueur.diamant += 1; // Ajoute le minerais à l'inventaire
        }
    }
}
