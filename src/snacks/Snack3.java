package snacks;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = {10,50,70,115,23,33,56,66,99};
        int sum = 0;
        for (int i = 0 ; i < numbers.length; i++){
            if (i % 2 != 0) sum += numbers[i];
        }
        System.out.println("The sum of odd indexes numbers in " + Arrays.toString(numbers) + " is " + sum);
    }
}
