package control;

import toys.Car;
import toys.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        List<Car> cars = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!"exit".equals(line)){
            line = in.nextLine();
            if(!"exit".equals(line)){
                Car car = new Car(generator.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("Built cars " + cars
                        .stream()
                        .map(c -> c.getSerialNumber().toString())
                        .collect(Collectors.joining(", "))
                );
            }
        }
    }
}
