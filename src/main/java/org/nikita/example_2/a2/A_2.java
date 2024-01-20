package org.nikita.example_2.a2;


import org.nikita.example_2.b2.B_2;
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;


public class A_2 {
    public static void main(String[] args) {

        // B_2 b2 = new B_2();
        // Для обращения к другому классу в других пакетах
        // нам нужно бьольше чем просто ссылка

        // Виды решения проблемы
        //1
        org.nikita.example_2.b2.B_2 b2 = new org.nikita.example_2.b2.B_2();
        // Обращаемся по полоному имени класса, указывая все пакеты после SRC

        //2
        B_2 b22 = new B_2();

        List<String> stringList = new ArrayList<>();
    }
}
