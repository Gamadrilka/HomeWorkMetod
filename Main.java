package ProductStar_Circle;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Circle circle = new Circle();

    public static void main(String[] args) throws Exception {
        System.out.println("������� �������� ������� � �� ������ ������� �����");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        circle.getArea();
    }
}


