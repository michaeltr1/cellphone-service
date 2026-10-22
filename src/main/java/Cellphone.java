
public class Cellphone {

    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    public Cellphone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }
    // Getters
    public int serialNumber(){
        return serialNumber;
    }
    public String model(){
        return model;
    }
    public String carrier(){
        return carrier;
    }
    public String phoneNumber(){
        return phoneNumber;
    }
    public String owner() {
        return owner;
    }
    // Setters
    public void serialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void model(String model) {
        this.model = model;
    }
    public void carrier(String carrier) {
        this.carrier = carrier;
    }
    public void phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void owner(String owner) {
        this.owner = owner;
    }
    void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println(("serial number: " + serialNumber));
        System.out.println("Model: " + model);
        System.out.println("Carriers: " + carrier);
        System.out.println("Phone number: " + phoneNumber);



    }
}