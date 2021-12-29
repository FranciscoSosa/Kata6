package toys;

public class Helicopter {
    private final Integer serialNumber;
    private final String type;

    public Helicopter(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Helicopter";
    }

    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public String getType() {
        return this.type;
    }

    public void pack(){
        System.out.printf("Packing '%s' with S/N '%s'\n", this.getType(), this.getSerialNumber());
    }

    public void label(){
        System.out.printf("Labelling '%s' with S/N '%s'\n", this.getType(), this.getSerialNumber());
    }
}
