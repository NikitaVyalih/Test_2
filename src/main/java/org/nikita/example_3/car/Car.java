package org.nikita.example_3.car;

import org.nikita.example_3.car.car_classes.CarBody;
import org.nikita.example_3.car.car_classes.CarDoor;
import org.nikita.example_3.car.car_classes.CarWheel;

public class Car {

    String model;
    Double power;
    CarBody carBody;
    CarWheel carWheel;
    CarDoor carDoor;

    public Car(String model, Double power, CarBody carBody,
               CarWheel carWheel, CarDoor carDoor) {
        this.model = model;
        this.power = power;
        this.carBody = carBody;
        this.carWheel = carWheel;
        this.carDoor = carDoor;
        printInfo();
    }

    public Car(CarBody carBody, CarWheel carWheel,
               CarDoor carDoor) {
        this(null, 0.0, carBody, carWheel,
                carDoor);
        printInfo();
    }

        void printInfo(){
            System.out.println("    ***Модификация автомобиля***");
            System.out.println("Модель: " + model);
            System.out.println("Мощность: " + power);
            carBody.printCarBodyInfo();
            carWheel.printCarWheelInfo();
            carDoor.printCarDoorInfo();
            System.out.println();
        }

    }



