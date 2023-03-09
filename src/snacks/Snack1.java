package snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int userNr = Integer.parseInt(scan.nextLine());

        if (userNr % 2 == 0) System.out.println(userNr +" is even");
        else System.out.println("Not even so " + (userNr + 1));

    }
}