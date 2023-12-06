package Utils;

// Classe permettant de donner un effet de frappe à un texte (un peu comme un dialogue)
public class TypeText {
    public static void write(String text) {
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(100); // Pause de 0.1 seconde entre chaque lettre
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
}
