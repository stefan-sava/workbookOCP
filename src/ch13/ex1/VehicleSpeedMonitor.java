package ch13.ex1;

import java.util.*;

//Original code wrote by me

public class VehicleSpeedMonitor {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String type;
            int speed;
            System.out.print("Enter vehicle type: ");
            type = sc.next();
            type = type.toLowerCase();
            System.out.print("Enter speed: ");
            speed = sc.nextInt();
            if(speed < 0) {
                System.out.println("Exiting system...");
                break;
            }
            switch (type){
                case "car": {
                    if (speed < 100){
                        System.out.println("Speed OK");
                        break;
                    } else {
                        System.out.println("Speeding!");
                        break;
                    }
                }

                case "bus":{
                    if (speed < 80){
                        System.out.println("Speed OK");
                        break;
                    }
                    else  {
                        System.out.println("Speeding!");
                        break;
                    }
                }
                case "bike" : {
                    if (speed < 60){
                        System.out.println("Speed OK");
                        break;
                    }
                    else  {
                        System.out.println("Speeding!");
                        break;
                    }
                }
                default:{
                    System.out.println("Unknown vehicle type");
                    break;
                }

            }
        }
    }
}
