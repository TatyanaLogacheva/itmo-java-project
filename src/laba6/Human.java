package laba6;

public abstract class Human implements DisplayInfo {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + name + "\n" + "Фамилия: " + surname);
    }
}
