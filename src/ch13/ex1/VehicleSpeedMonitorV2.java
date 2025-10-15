package ex1;

import java.util.*;

public class VehicleSpeedMonitorV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> limits = Map.of(
                "car", 100,
                "bus", 80,
                "bike", 60
        );

        while (true) {
            System.out.print("Enter vehicle type: ");
            String type = sc.next().toLowerCase();

            System.out.print("Enter speed: ");
            int speed = sc.nextInt();

            if (speed < 0) {
                System.out.println("Exiting system...");
                break;
            }

            if (!limits.containsKey(type)) {
                System.out.println("Unknown vehicle type");
                continue;
            }

            System.out.println(speed < limits.get(type) ? "Speed OK" : "Speeding!");
        }
    }
}
