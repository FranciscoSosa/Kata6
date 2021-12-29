package toys;

import toyproducts.Toy;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;

public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();

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

    private CarToy createCar(){
        CarToy car = new CarToy(this.generator.next());
        car.pack();
        car.label();
        return car;
    }

    private HelicopterToy createHelicopter(){
        HelicopterToy helicopter = new HelicopterToy(this.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}
