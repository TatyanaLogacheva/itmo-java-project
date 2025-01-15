package laba6;

public class Client extends Human {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Данные клиента:");
        super.displayInfo();
        System.out.println("Название банка: " + bankName + "\n");
    }
}
