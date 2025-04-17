package lv.acodemy;

public class ThirdLesson {


    public static void main(String[] args) {

        //Conditional operators in Java

        // if (is, has -> isRainings, isRandomNumber, hasEvenValue)
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if (temperature > 29) {
            System.out.println("It is too hot!");
        }

        if (4 > 2 && 10 > 5) {
            System.out.println("Both are equals!");
        }

        // OR (||)
        if (4 < 2 || 10 > 11) {
            System.out.println("Execute this code!");
        }

        // if-else .....
        boolean isWeekDay = false;

        if (isWeekDay) {
            System.out.println("Working today...");
        } else {
            System.out.println("Will stay at home!");
        }

        int number = 10;
        // % -
        // + - / * (

        if(number % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Odd number");
        }

        // If age => 18 -> Access granted
        // In all other cases -> Access denied

        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }

        // if-else-if-else

        int hour = 7;
        if(hour == 5) {
            System.out.println("Will go for run");
        } else if (hour == 7) {
            System.out.println("Will have breakfast!");
        } else if (hour == 9) {
            System.out.println("Will start work!");
        } else {
            System.out.println("Free time!");
        }

        // score > = 90 - perfect
        // >=70 = Good
        // >=50 = OK
        // else -> NOT OK

        int score = 100;
        if (score >= 90) {
            System.out.println("Perfect!");
        } else if (score >= 70) {
            System.out.println("Good!");
        } else if (score >=50) {
            System.out.println("OK!");
        } else {
            System.out.println("NOT OK");
        }

        // age -> 0 - 6 = Baby
        // 7-17 -> Shkilla
        // 18-65 -> Adult
        // 66+ pens

        int age = 20;
        if (age >= 0 && age <=6) {
            System.out.println("Baby");
        } else if (age >= 7 && age <=17) {
            System.out.println("Shkilla");
        } else if (age >= 18 && age <=65) {
            System.out.println("Adult");
        } else {
            System.out.println("Pens");
        }

        // We know conditions & loops
        // Print even numbers from 1 to 18

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("Number:" + i + " is even number");
            }
        }

        // Count sum only for numbers that are positive
        int[] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Sum of positive numbers " + sum);

        // 1 till 20;
        // print numbers that can be divided by 3 and 5;
        // print divided by 3;
        // print divided by 5;
        // else -> just print number;

        for (int i = 0; i <=20; i++){
            if (i % 3 ==0 && i % 5==0) {
                System.out.println("Number: " + i + " can be divided by 3 and 5");
            } else
            if (i % 3 ==0 ) {
                System.out.println("Number: " + i + " can be divided by 3");
            } else
            if (i % 5 ==0) {
                System.out.println("Number: " + i + " can be divided by 5");
            } else {
                System.out.println("Number: " + i + " can't be divided by 3 or 5");
            }
        }


    }
}