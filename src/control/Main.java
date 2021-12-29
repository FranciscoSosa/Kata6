package control;

import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        List<Car> cars = new ArrayList<>();
        List<Helicopter> helicopters = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built cars " + cars
                            .stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", "))
                    );
                    break;
                case "helicopter":
                    Helicopter helicopter = new Helicopter(generator.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Built helicopters " + helicopters
                            .stream()
                            .map(h -> h.getSerialNumber().toString())
                            .collect(Collectors.joining(", "))
                    );
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command unknown!");
            }
        }
    }
}
