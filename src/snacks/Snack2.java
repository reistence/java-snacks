package snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"John", "Andrew", "Mark", "James", "Sara", "Mary", "Susan", "Hannah", "Phoebe", "Jamie"};
        String[] surnames = {"Robertson", "Henderson", "Rice", "Doe", "Hahn", "Schmeltzer", "Bosch", "Smith", "Brown", "Bellingham"};
        String[] guests = new String[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            guests[i] = names[random.nextInt(10)] + " " + surnames[random.nextInt(10)];
            System.out.println(guests[i]);
        }
    }
}
