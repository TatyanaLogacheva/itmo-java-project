package laba2;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private double length;
    private String colour;

    Cat() {
    }

    Cat(String name, int age, String breed, double length, String colour) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.length = length;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void displayInfo() {
        System.out.println("Имя=" + name + "\n" + "Возраст=" + age + "\n"
                + "Порода=" + breed + "\n" + "Длина=" + length + "\n" + "Цвет=" + colour);
    }
}
