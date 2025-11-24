/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbasic;

/**
 *
 * @author Student
 */
public class Vehicle {
    String brand;
    String model;
    double speed;

    public Vehicle(String b, String m, double s) {
        brand = b;
        model = m;
        speed = s;
    }

    public void accelerate(double increment) {
        speed += increment;
    }

    public void displayStatus() {
        System.out.println("\nVehicle Status:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}