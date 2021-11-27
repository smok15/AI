package org.example.Models;

public class City {
    private static int xCoord;
    private static int yCoord;

    public static int getxCoord() {
        return xCoord;
    }

    public static void setxCoord(int xCoord) {
        City.xCoord = xCoord;
    }

    public static int getyCoord() {
        return yCoord;
    }

    public static void setyCoord(int yCoord) {
        City.yCoord = yCoord;
    }

    public City(int x,int y){
        xCoord = x;
        yCoord = y;
    }

    @Override
    public String toString() {
        return "City{" +
                "x=" + xCoord +
                ", y=" + yCoord +
                "}";
    }
}
