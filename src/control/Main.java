package control;

import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        List<Car> cars = new ArrayList<>();
        List<Helicopter> helicopters = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                    cars.add(toyBusiness.createCar());
                    System.out.println("Built cars " + cars
                            .stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", "))
                    );
                    break;
                case "helicopter":
                    helicopters.add(toyBusiness.createHelicopter());
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
