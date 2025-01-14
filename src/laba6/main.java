package laba6;

public class main {
    public static void main (String[] args){
        Client cl1 = new Client("Mark","Brown", "VTB" );
        cl1.displayInfo();
        Human emp1 = new BankEmployee("Ivan", "Moroz", "Alpha");
        emp1.displayInfo();
    }
}
