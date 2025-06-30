package exo2;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom et nom de famille : ");
        String fullName = scanner.nextLine().trim();

        // Séparation des mots par espace
        String[] parts = fullName.split(" ");

        // Vérification qu'il y a au moins deux mots (prénom + nom)
        if (parts.length < 2) {
            System.out.println("Erreur : veuillez entrer un prénom et un nom de famille.");
        } else {
            String prenom = parts[0];
            String nom = parts[1];

            // Affichage
            System.out.println("Prénom : " + prenom);
            System.out.println("Nom de famille : " + nom);

            // Initiales
            char initialPrenom = prenom.charAt(0);
            char initialNom = nom.charAt(0);
            System.out.println("Initiales : " + initialPrenom + "." + initialNom + ".");

            // Majuscules
            System.out.println("Nom complet en majuscules : " + fullName.toUpperCase());

            // Longueur sans les espaces
            String fullNameNoSpaces = fullName.replace(" ", "");
            System.out.println("Longueur du nom complet (sans espaces) : " + fullNameNoSpaces.length());
        }

        scanner.close();
    }
}
