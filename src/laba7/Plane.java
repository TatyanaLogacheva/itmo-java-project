package laba7;

public class Plane {

    Plane() {
    }

    public void planeWingWeight(int weight) {
        Wing wing = new Wing();
        wing.setWeight(weight);
        System.out.println("Для данного самолета");
        wing.displayWingWeight();
    }

    class Wing {
        private int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void displayWingWeight() {
            System.out.println("Вес крыла = " + weight + "кг\n");
        }

    }
}
