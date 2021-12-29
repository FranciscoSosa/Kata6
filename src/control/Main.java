package control;

import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import toyproducts.Toy;
import business.ToyBusiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        toyBusiness.add("submarine", new AmericanSubmarineToyFactory());
        List<Toy> toys = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                case "helicopter":
                case "submarine":
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
