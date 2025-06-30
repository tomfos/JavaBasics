package exo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo4_1 {

  public static void main(String[] args) {
    ArrayList<String> articles = new ArrayList<>();
  
    try (Scanner saisit = new Scanner(System.in)) {
      
      for (int i = 0; i < 5; i++) {
        System.out.print("Entrez l'article " + (1+i) + " : ");
        String input = saisit.nextLine();
        articles.add(input);
      }

      System.out.println("\nVotre liste de course :");

      for (int i = 0; i < 5; i++) {
        System.out.println((1+i) + ". " + articles.get(i));
      }

      System.out.println("\nTotal d'articles : " + articles.size());

      // for (String item : articles) {
      //   System.out.println(item);
      // }

    }


  }
}