package laba6;

public class BankEmployee extends Human {
    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Данные сотрудника:");
        super.displayInfo();
        System.out.println("Название банка: " + bankName + "\n");
    }
}
