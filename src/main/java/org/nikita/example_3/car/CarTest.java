package org.nikita.example_3.car;

import org.nikita.example_3.car.car_classes.CarBody;
import org.nikita.example_3.car.car_classes.CarDoor;
import org.nikita.example_3.car.car_classes.CarWheel;

public class CarTest {
    public static void  main (String [] args){

        Car car_1 = new Car("Тесла", 450.0,
        new CarBody("седан", "белый", 8),
        new CarWheel("лето", 18, 55, 220),
        new CarDoor(true));

        Car car_2 = new Car(new CarBody(), new CarWheel(), new CarDoor());
    }
}
