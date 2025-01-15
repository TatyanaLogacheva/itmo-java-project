package laba6;

public class Truck extends Car {
    private int wheelsQuantity;
    private int maxWeight;

    @Override
    public void outPut() {
        super.outPut();
    }

    public Truck(int w, String m, char c, float s, int wh, int maxW) {
        super(w, m, c, s);
        wheelsQuantity=wh;
        maxWeight=maxW;
    }

    public Truck() {
        super();
    }
    public void newWheels(int wh){
        this.wheelsQuantity=wh;
        System.out.println("Количество колес = " + wh);
    }
}
