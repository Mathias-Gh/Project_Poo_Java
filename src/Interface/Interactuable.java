package Interface;

import Model.Ennemi.Ennemi;
import Model.Personnage.Personnage;

public interface Interactuable {
    // Déclaration de la méthode interagir() qui a pour paramètre un objet de la classe Personnage
    // Méthode interagir() quu sera implémentée dans les classes concernées
    public void interagir(Personnage personnage);
}
