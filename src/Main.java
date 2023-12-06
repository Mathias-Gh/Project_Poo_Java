public class Main {
    public static void main(String[] args) {
        sorciere maSorciere= new sorciere("elise", 150, 30);
        geant grougaloragran = new geant("grougaloragran", 400, 75);
        Joueur joueur1 = new Joueur("sylas", 300, 20);
        demon aatrox = new demon("aatrox", 400, 80);

        maSorciere.profil();
        grougaloragran.profil();
        joueur1.profil();
        aatrox.profil();
    }
}