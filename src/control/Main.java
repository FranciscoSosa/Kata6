package control;

import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import toyproducts.Toy;
import business.ToyBusiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(asianToyFactory);
        List<Toy> toys = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line));
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
