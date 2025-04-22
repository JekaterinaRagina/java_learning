package lv.acodemy;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();

        // Encapsulation
        rex.setName("Rex");
        rex.setAge(1);

        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getBreedName());

        Dog barsik = new Dog("Alabai");
        barsik.setName("Barsik");
        barsik.setAge(1);

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // ?? Print breed name through method

        System.out.println(barsik.getBreedName());

        // New Dog

        Dog moiTolja = new Dog("Tolja", 2, "Shpiz");

        System.out.println(moiTolja);


    Car bmw = new Car("BMW");
        System.out.println(bmw);
        bmw.drive();
        bmw.refuel();
        bmw.service();



    }
}
