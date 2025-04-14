package lv.acodemy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        String name = "Katja";
        int age = 30;

        // Array
        int[] numbers = new int[5]; // [0, 0, 0, 0, 0]
        String[] names = {"Jana", "Olja", "Nikita"}; // [Jana, Olja, Nikita]

        int[] ages = {19, 20, 30, 40, 50};
        String[] fruitBasket = new String[10];

        // Element access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));

        // Exercise:
        fruitBasket[0] = "apple";
        fruitBasket[1] = "banana";
        fruitBasket[2] = "mango";
        fruitBasket[3] = "kiwi";
        fruitBasket[4] = "durian";
        fruitBasket[5] = "melon";
        fruitBasket[6] = "strawberry";
        fruitBasket[7] = "avocado";
        fruitBasket[8] = "lemon";
        fruitBasket[9] = "orange";
        System.out.println(Arrays.toString(fruitBasket));

        // Loops (cikli)
        // Print "hello world" 5 times
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("======");

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World" + " index: " + i);
        }

        for (int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }

        // for each;
        for (String fruit : fruitBasket) {
            System.out.println(fruit);
        }

        // Create int numbers array from 0 -> to 10

        int[] nums = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        // Concatenation
        String myName = "Jekaterina";
        String mySurname = "Ragina";
        int myAge = 30;
        System.out.println("n");
        // My name is Nikita Milka. I am 30 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". I am " + myAge + " years old.");
        // String.format();
        System.out.println(
                String.format("My name is %s %s. I am %d years old", myName, mySurname, myAge));

        String template = """
                My name is %s %s. I am %d years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));

        // while loops
        /*
        while(condition) {
        // loop body
        }
         */

        int i = 0;
        while (i < 5) {
            System.out.println("Number: " + i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("secret")) {
            System.out.println("Please enter your password: ");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");

        int randomNumber = new Random().nextInt(0, 11);
        System.out.println("Random number: " + randomNumber);
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
        } while (guess != randomNumber);

        System.out.println("Guessed!");

        //Tablica umnozhenija na 5 do 10
        int result;
        for (int a = 1; a < 11; a++) {
            result = 5 * i;
            System.out.println("5 * " + a + " = " + result);
        }
        System.out.println(" ");

        // summa chisel ot 1 so 100
        int sum = 0;
        for (int b = 1; b < 101; b++) {
            sum = b + sum;
        }
        System.out.println("Summa chisel ot 1 do 100: " + sum);
        System.out.println(" ");

        // vivesti chisla ot 10 do 1 (while)
        int e = 10;
        while (e>0){
            System.out.print(e+ " ");
            e--;
        }
    }
}