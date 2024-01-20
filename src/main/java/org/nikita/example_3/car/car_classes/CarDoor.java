package org.nikita.example_3.car.car_classes;

public class CarDoor {

    boolean isThatLamboDoor;

    public CarDoor(boolean isThatLamboDoor){
        this.isThatLamboDoor = isThatLamboDoor;
    }

    public CarDoor() {
    }

    public void printCarDoorInfo(){
        System.out.println("    ---Модификация дверей---    ");
        System.out.println("двери ЛАМБО?: " + isThatLamboDoor);
    }
}
