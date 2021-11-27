package org.example.Services;

import org.example.Models.City;

public class CitiesGenerator {
    public static City[] generate(int number){
        City[] cities = new City[number];
        for (int i = 0; i<number; i++) cities[i] = new City(i, i);
        return cities;
    }
}
