package lv.acodemy;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add(10, 30);
        System.out.println(summa);

        System.out.println(add(20,10));

        greet("Jekaterina");

        var rez = add(10, 5, 10);
        System.out.println(rez);

    }

        public static int add(int a, int b){
            int result = a + b;
            return result;
        }

        // Method overloading
        public static int add(int a, int b, int c){
            return a + b+ c;
        }

        public static void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }

        public static int max0fTwo(int a, int b){
            return Math.max(a, b);
        }

        public static int max0fThree (int a, int b, int c){
            return Math.max(Math.max(a,b), c);
        }


    }

