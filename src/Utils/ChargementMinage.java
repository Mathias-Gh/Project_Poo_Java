package Utils;

public class ChargementMinage {
    public static void afficherBarreDeChargement(int iteration, int totalIterations) {
        int pourcentage = (int) (((double) iteration / totalIterations) * 100);
        StringBuilder barre = new StringBuilder("[");
        int nombreDeCaracteres = 20;
        int nombreDeBarres = (int) (((double) iteration / totalIterations) * nombreDeCaracteres);

        for (int i = 0; i < nombreDeBarres; i++) {
            barre.append("=");
        }
        for (int i = nombreDeBarres; i < nombreDeCaracteres; i++) {
            barre.append(" ");
        }

        barre.append("] " + pourcentage + "%");

        System.out.print("\r" + barre.toString());
    }

    public static void attendre(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
