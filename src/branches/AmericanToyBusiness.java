package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                return this.createCar();
            case "helicopter":
                return this.createHelicopter();
            default:
                return null;
        }
    }

    private AmericanCarToy createCar(){
        AmericanCarToy car = new AmericanCarToy(super.generator.next());
        car.pack();
        car.label();
        return car;
    }

    private AmericanHelicopterToy createHelicopter(){
        AmericanHelicopterToy helicopter = new AmericanHelicopterToy(super.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}
