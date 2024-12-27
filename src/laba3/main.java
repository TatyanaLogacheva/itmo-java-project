package laba3;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("silver", "Audi", 1.6);
        Car car2 = new Car("violet", "BMW", 2.1);
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        House house1 = new House();
        House house2 = new House();
        house1.setFloorCount(5);
        house1.setYearBuild(1976);
        house1.setName("Май");
        house2.setFloorCount(25);
        house2.setYearBuild(2012);
        house2.setName("Небо");
        System.out.println("Наименование = " + house1.getName() + ", Год посторойки = " + house1.getYearBuild()
                + ", Количество этажей = " + house1.getFloorCount()
                + ", Количество лет с постройки = " + house1.CountYear(2024, house1.getYearBuild()));
        System.out.println("Наименование = " + house2.getName() + ", Год посторойки = " + house2.getYearBuild()
                + ", Количество этажей = " + house2.getFloorCount()
                + ", Количество лет с постройки = " + house2.CountYear(2024, house2.getYearBuild()));

        Tree olha = new Tree(15, "Ольха");
        Tree sosna = new Tree(95, true, "Сосна");
        Tree bereza = new Tree();
    }

}
