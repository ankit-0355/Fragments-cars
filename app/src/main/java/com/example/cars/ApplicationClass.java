package com.example.cars;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<Car>();
        cars.add(new Car("Volkswagen", "polo", "Chuck Norris", "092309809"));
        cars.add(new Car("Mercedes", "E200","Peter Pollock", "98674532901"));
        cars.add(new Car("Nissan", "Almera", "Chris James", "93562718675"));
        cars.add(new Car("Mercedes", "E100", "Jphn Rambo", "087465379289"));
        cars.add(new Car("Volkswagen","Kombi","Nelson Mandela","90864537729"));
        cars.add(new Car("Nissan", "Navara", "PaulBunting","09864543279"));

    }
}
