
import java.util.Scanner;

public class Exo1 {
  public static void main(String[] args) {
    System.err.println("hello");

    try (Scanner saisit = new Scanner(System.in)) {

      String input;
      while (true) { 
        System.out.print("Entrer un nombre (\'exit\' pour arreter): ");
        input = saisit.nextLine();

        if (input.equalsIgnoreCase("exit")) {
          System.out.println("fin du programme.");
          break;  // Exit the loop
        }
        
        int nombre;
        try {
            nombre = Integer.parseInt(input);
            System.out.println("Vous avez entré un entier.");

            positif(nombre);
            pair(nombre);
        } catch (NumberFormatException e1) {
            System.out.println("Erreur: Veillez entrer un entier valide");
        }
      }
    }
  }

  public static void positif(int n) {
    if (n > 0) {
      System.out.println(n + " est positif.");
    } else if (n == 0) {
        System.out.println("zero.");
    } else {
        System.out.println(n + " est negatif.");
    }
  }

  public static void pair(int n) {
    if (n%2 == 0 || n == 0) {
      System.out.println(n + " est un nombre pair.");
    } else {
      System.out.println(n + " est impair.");
    }
  }

}
