package snacks;

import java.util.Random;

public class Snack4 {

  /*  Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi
    elementi random finchè il numero di elementi presenti nell’array che ne ha di meno + quelli
    mostrati a video non è uguale al numero di elementi presenti nell’array che ne ha di più  */
    public static void main(String[] args) {
        int[] small = new int[5];
        int[] large = new int[10];
        Random random = new Random();
        for (int i = 0; i < (large.length - small.length); i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
