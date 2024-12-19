/*
* File: Hengfel.java
* Author: Nagy Gergő
* Copyright: 2024, Nagy Gergő
* Group: Szoftf
* Date: 2024-12-18
* Github: https://github.com/nagygergo27/
*/
import java.util.Scanner;

public class Hengfel {
    public void doit() {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Nagy Gergő");

        System.out.print("Sugár:  ");
        double radius = scanner.nextDouble();

        System.out.print("Magasság:  ");
        double height = scanner.nextDouble();

        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Felszine: " + surfaceArea);

        scanner.close();
    }
}