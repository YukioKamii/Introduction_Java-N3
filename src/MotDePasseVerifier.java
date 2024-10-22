import java.util.Scanner;

public class MotDePasseVerifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner pour lire l'entrée utilisateur
        
        String motDePasse;
        boolean estConforme = false; // Variable pour stocker la conformité du mot de passe
        
        // Boucle qui continue tant que le mot de passe n'est pas conforme
        while (!estConforme) {
            System.out.println("Entrez un mot de passe : ");
            motDePasse = scanner.nextLine();

            // Vérifier si le mot de passe est conforme
            if (!estConforme(motDePasse)) {
                System.out.println("Le mot de passe n'est pas conforme. Veuillez réessayer.");
            } else {
                System.out.println("Le mot de passe est conforme.");
                estConforme = true; // Sortir de la boucle
            }
        }

        scanner.close(); // Fermer le scanner
    }

    // Fonction pour vérifier si le mot de passe est conforme
    public static boolean estConforme(String motDePasse) {
        // Vérifier si la longueur est supérieure à 12
        if (!(motDePasse.length() > 12)) {
            return false;
        }

        // Vérifier si le mot de passe contient une majuscule
        boolean contientMajuscule = false;
        for (int i = 0; i < motDePasse.length(); i++) {
            if (Character.isUpperCase(motDePasse.charAt(i))) {
                contientMajuscule = true;
                break;
            }
        }
        // test
        return contientMajuscule; // Retourner true si une majuscule est trouvée
    }
}
