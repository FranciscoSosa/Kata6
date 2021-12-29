package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness {

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

    private AsianCarToy createCar(){
        AsianCarToy car = new AsianCarToy(super.generator.next());
        car.pack();
        car.label();
        return car;
    }

    private AsianHelicopterToy createHelicopter(){
        AsianHelicopterToy helicopter = new AsianHelicopterToy(super.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}
