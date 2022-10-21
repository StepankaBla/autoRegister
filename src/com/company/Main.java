package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car("X5", 1999, "white");
        car1.setBrand(Brand.BMW);
        Car car2 = new Car("F-250", 1992, "dark blue");
        car2.setBrand(Brand.FORD);
        Car car3 = new Car("Avalon", 1990, "black");
        car3.setBrand(Brand.TOYOTA);
        ArrayList<Car> list = new ArrayList<Car>();

        list.add(car1);
        list.add(car2);
        list.add(car3);
        Iterator itr = list.iterator();
        System.out.println("Car list");
        System.out.println("1 - " + Brand.BMW);
        System.out.println("2 - " + Brand.FORD);
        System.out.println("3 - " + Brand.TOYOTA);
        System.out.println("Vyber si model podle ID");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(Brand.BMW + " model: " + car1.getModel() + " year: " + car1.getYear() + " color: " + car1.getColor());
                break;
            case 2:
                System.out.println(Brand.FORD + " model: " + car2.getModel() + " year: " + car2.getYear() + " color: " + car2.getColor());
                break;
            case 3:
                System.out.println(Brand.TOYOTA + " model: " + car3.getModel() + " year: " + car3.getYear() + " color: " + car3.getColor());
                break;
        }


    }
}
