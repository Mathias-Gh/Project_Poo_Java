package Model.Objet;

import Model.Ennemi.Ennemi;
import Model.Personnage.Personnage;

public abstract class ObjetDuJeu {
    public String nom;
    public String description;

    public abstract void interagir(Personnage personnage);
}