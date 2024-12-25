package laba3;

public class Car {
    private String colour;
    private String name;
    private double weight;

    Car(String colour, String name, double weight){
        this.colour=colour;
        this.name=name;
        this.weight=weight;
    }
    Car (String colour){
        this.colour=colour;
    }
    Car (String colour, double weight){
        this.colour=colour;
        this.weight=weight;
    }
    Car(){

    }

    @Override
    public String toString(){
        return ("Цвет = " + colour + ", Название = " + name + ", Вес = " + weight);
    }


}
