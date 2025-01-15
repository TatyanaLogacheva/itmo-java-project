package laba6;

public class UserName extends UserAge {
    String name = scanner.next();

    @Override
    public String getInfo() {
        System.out.println(super.getInfo());
        return name;
    }
}
