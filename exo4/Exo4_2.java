package exo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo4_2 {

  public static void main(String[] args) {

    try (Scanner saisit = new Scanner(System.in)) {

      ArrayList<String> element = new ArrayList<>();
      String input;
      String nombre;

      while (true) {
        System.out.println("\n=== GESTIONNAIRE DE NOMBRES ===");
        System.out.println("1. Ajouter nombre");
        System.out.println("2. Supprimer nombre");
        System.out.println("3. Vérifier si nombre existe");
        System.out.println("4. Afficher tous les nombres");
        System.out.println("5. Quitter");
        System.out.print("Choix : ");

        input = saisit.nextLine();

        switch (input) {
          case "1":
            System.out.print("Entrez le nombre à ajouter : ");
            nombre = saisit.nextLine();
            element.add(nombre);
            break;

          case "2":
            System.out.print("Entrez le nombre à retirer : ");
            nombre = saisit.nextLine();
            element.remove(nombre);
            break;

          case "3":
            System.out.print("Entrez le nombre à vérifier : ");
            nombre = saisit.nextLine();
            if (element.contains(nombre)) {
              System.out.println("Ce nombre est dans la liste.");
            } else {
              System.out.println("Ce nombre n'existe pas.");
            }
            break;

          case "4":
            System.out.println("Liste de tous les éléments : " + element);
            break;

          case "5":
            System.out.println("Fin du programme.");
            return;

          default:
            System.out.println("Choix invalide.");
        }
      }
    }
  }
}
