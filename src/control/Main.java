package control;

import branches.AmericanToyBusiness;
import toyproducts.Toy;
import business.ToyBusiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new AmericanToyBusiness();
        List<Toy> toys = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.createToy(line));
                    System.out.println("Built toys " + toys
                            .stream()
                            .map(Toy::toString)
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
