package org.example;

import org.example.Models.City;
import org.example.Services.CitiesGenerator;


public class Main {

    public static void main(String[] args) {
        City[] cities = CitiesGenerator.generate(5);
        System.out.println(cities[0].toString());
        System.out.println(cities[1].toString());
        System.out.println(cities[2].toString());
        System.out.println(cities[3].toString());
        System.out.println(cities[4].toString());
    }
}
