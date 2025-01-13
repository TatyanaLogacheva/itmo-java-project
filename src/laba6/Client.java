package laba6;

public class Client extends Human {
    private String bankName;

    Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя клиента: " + getName() + "\n" +
                "Фамилия клиента: " + getSurname() + "\n" +
                "Название банка: " + bankName + " \n");

    }
}
