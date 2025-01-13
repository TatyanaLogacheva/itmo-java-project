package laba6;

public class BankEmployee extends Human {
    private String bankName;

    BankEmployee (String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя работника банка: " + getName() + "\n" +
                "Фамилия работника банка: " + getSurname() + "\n" +
                "Название банка: " + bankName + " \n");

    }
}
