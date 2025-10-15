package ch45.ex1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the temperature or 'exit' to quit: ");
            String tempInput = input.next(); // Read as string first

            if (tempInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            double temperature;
            try {
                temperature = Double.parseDouble(tempInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
                continue; // Restart loop
            }

            System.out.print("Please enter the temperature unit (F or C): ");
            String unit = input.next().toUpperCase();

            switch (unit) {
                case "F": {
                    System.out.println(TemperatureConverter.toCelsius(temperature) + " C");
                    break;
                }
                case "C": {
                    System.out.println(TemperatureConverter.toFahrenheit(temperature) + " F");
                    break;
                }
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
        input.close();
    }
}
