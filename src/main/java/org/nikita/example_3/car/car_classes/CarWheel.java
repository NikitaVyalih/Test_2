package org.nikita.example_3.car.car_classes;

public class CarWheel {

    String season;
    int diameter;
    int width;
    int wheelHeight;

    public CarWheel(String season, int diameter, int width,
                   int wheelHeight){
        this.season = season;
        this.diameter = diameter;
        this.width = width;
        this.wheelHeight = wheelHeight;
    }

    public CarWheel() {
    }

    public void printCarWheelInfo(){
        System.out.println("    ---Модификация колес---    ");
        System.out.println("Сезон: " + season);
        System.out.println("Диаметр: " + diameter);
        System.out.println("Ширина профиля: " + width);
        System.out.println("Высота профиля: " + wheelHeight);
    }

}
