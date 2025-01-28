package Logbook.Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        double perimeter = 2 * (length + height);
        double area = length * height;

        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}