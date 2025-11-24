/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbasic;

/**
 *
 * @author Student
 */
public class Student {

    String name;
    int age;
    double grade;

    public Student(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
} 
public class StudentEncapsulated {
    private String name;
    private int age;
    private double grade;

    public StudentEncapsulated(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    public void setName(String n) { name = n; }
    public void setAge(int a) { age = a; }
    public void setGrade(double g) { grade = g; }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }

    public void displayInfo() {
        System.out.println("\nStudent Information (Encapsulated):");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

