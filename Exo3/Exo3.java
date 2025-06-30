package exo3;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        try (Scanner saisit = new Scanner(System.in)) {
            System.out.print("Combien de nombre voulez-vous: ");
            int nombre = saisit.nextInt();
            int somme = 0;
            int[] tableau = new int[nombre];

            for (int i = 0; i < tableau.length; i++) {
                System.out.print("Entrer le " + (1+i) + " nombre: ");
                tableau[i] = saisit.nextInt();
            }

            for (int i = 0; i < tableau.length; i++) {
                somme += tableau[i];
            }
            System.out.println("La somme: " + somme);

            minMax(tableau);
            moyenne(tableau, somme);

        }
    }

    public static void minMax(int[] tab) {
        int min = tab[0];
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            } else if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void moyenne(int[] tab, int somme) {
        System.out.printf("La moyenne: %.2f\n", (float) somme / tab.length);
    }

}
