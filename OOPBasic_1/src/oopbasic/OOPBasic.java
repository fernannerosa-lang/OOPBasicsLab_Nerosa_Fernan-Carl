package oopbasic;
import java.util.Scanner;
public class OOPBasic {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);

        System.out.println("=== ACTIVITY 1: Student Class ===");
        Student s1 = new Student("fernan", 18, 1.39);
        Student s2 = new Student("carl", 18, 1.38);
        s1.displayInfo();
        s2.displayInfo();

        System.out.println("\n=== ACTIVITY 2: Encapsulation ===");
        StudentEncapsulated s3 = new StudentEncapsulated("justin", 10, 1.69);
        s3.displayInfo();
        s3.setGrade(1.69);
        System.out.println("Updated grade for " + s3.getName() + ": " + s3.getGrade());

        System.out.println("\n=== ACTIVITY 3: Vehicle Class ===");
        Vehicle car = new Vehicle("honda", "civicc", 60.0);
        Vehicle motorcycle = new Vehicle("yamaha", "CRF", 40.0);
        car.displayStatus();
        car.accelerate(50);
        car.displayStatus();
        motorcycle.displayStatus();
        motorcycle.accelerate(20);
        motorcycle.displayStatus();

        System.out.println("\n=== ACTIVITY 4: Bank Account Simulation ===");
        BankAccount acc = new BankAccount("fernan carl", 10000.0);
        acc.displayBalance();
        acc.deposit(5000.0);
        acc.withdraw(2000.0);
        acc.displayBalance();

        System.out.println("\n=== ACTIVITY 5: Circle Geometry ===");
        Circle c1 = new Circle(9.5);
        Circle c2 = new Circle(8.5);
        c1.displayDetails();
        c2.displayDetails();

        input.close();
    }
}
    

    
    

