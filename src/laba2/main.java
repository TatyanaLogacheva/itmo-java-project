package laba2;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.displayInfo();

        Cat cat1 = new Cat("Барсик", 3, "русская голубая", 37.8, "серый");
        cat1.displayInfo();
        cat.setAge(1);
        cat.setBreed("мейн-кун");
        cat.displayInfo();
        System.out.println(cat1.getBreed());

    }
}
