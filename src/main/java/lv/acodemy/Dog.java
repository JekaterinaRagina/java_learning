package lv.acodemy;

public class Dog {
    private String name;
    private int age;
    private String breedName = "unknown breed";

    public Dog(String breedName) {
        this.breedName = breedName;
    }

    public Dog() {
    }

    public Dog(String name, int age, String breedName) {
        this.name = name;
        this.age = age;
        this.breedName = breedName;
    }

    void bark() {
        System.out.println(name + " says Woof-Woof!");
    }

    void feed() {
        System.out.println(name + " eat some food!");{}
    }

    // Getter (poluchenie dannih) & Setter (budem chto-to menjatj)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreedName() {
        return breedName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
