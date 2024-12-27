package laba3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

}
