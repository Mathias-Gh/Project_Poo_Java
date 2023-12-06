package Model.Objet;

public abstract class ObjetDuJeu {
    public String nom;
    public String description;
    public int durabilite;
    public abstract void SeCasse();
}