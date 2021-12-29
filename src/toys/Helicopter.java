package toys;

public class Helicopter {
    private final Integer serialNumber;
    private final String type;

    public Helicopter(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Helicopter";
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }

    public void pack(){
        System.out.printf("Packing '%s' with S/N '%s'\n", getType(), getSerialNumber());
    }

    public void label(){
        System.out.printf("Labelling '%s' with S/N '%s'\n", getType(), getSerialNumber());
    }
}
