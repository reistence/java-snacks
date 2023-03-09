package snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack4 {

  /*  Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi
    elementi random finchè il numero di elementi presenti nell’array che ne ha di meno + quelli
    mostrati a video non è uguale al numero di elementi presenti nell’array che ne ha di più  */
    public static void main(String[] args) {
        int[] small = {23, 45, 68, 77, 69};
        int[] large = {99, 89, 232, 44, 33, 13, 15, 7, 9, 10};
        Random random = new Random();
        for (int i = 0; i < (large.length - small.length); i++) System.out.print(random.nextInt(100) + " ,");

        System.out.println(Arrays.toString(small));
        System.out.println(Arrays.toString(large));
    }
}
