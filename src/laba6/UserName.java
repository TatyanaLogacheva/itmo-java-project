package laba6;

public class UserName extends UserAge {
    @Override
    public void receiveInfo() {
        super.receiveInfo();
        String name = scanner.next();
        System.out.println("Возраст " + age + "\n" + "Имя " + name);
    }

}
