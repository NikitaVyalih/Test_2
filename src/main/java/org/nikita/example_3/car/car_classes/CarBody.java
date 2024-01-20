package org.nikita.example_3.car.car_classes;

public class CarBody {

    String bodyType;
    String color;
    int crashTest;

    public CarBody(String bodyType, String color,
                   int crashTest){
        this.bodyType = bodyType;
        this.color = color;
        this.crashTest = crashTest;
    }

    public CarBody() {
    }

    public void printCarBodyInfo(){
        System.out.println("    ---Модификауция кузова---   ");
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Цвет кузова: " + color);
        System.out.println("Звезд по краштесту: " + crashTest);
    }

}
