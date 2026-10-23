import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Cellphone phone = new Cellphone();
        System.out.print("What is the serial number? ");
        int serial = Integer.parseInt(read.nextLine());
        phone.serialNumber(serial);
        System.out.println("What model is the phone?");
        String model = read.nextLine();
        phone.model(model);

        System.out.println("Who is the carrier? ");
        String carrier = read.nextLine();
        phone.carrier(carrier);

        System.out.println("What is the phone number?");
        String number = read.nextLine();
        phone.phoneNumber(number);

        System.out.println("Who is the owner of the phone? ");
        String owner = read.nextLine();
        phone.owner(owner);

        System.out.println("Serial Number: " + phone.serialNumber());
        System.out.println("Model " + phone.model());
        System.out.println("Carrier: " + phone.carrier());
        System.out.println("Phone number: " + phone.phoneNumber());
        System.out.println("Owner: " + phone.owner());


    }
        Cellphone phone = new Cellphone();
        phone


    }

