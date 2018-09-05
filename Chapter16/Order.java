import java.util.Scanner;

public class Order{
    public static void main( String[] args ) {
        int Nuts;
        int Bolts;
        int Washers;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the nut number :");
        Nuts = scan.nextInt();

        System.out.println("Enter the boltage : ");
        Bolts = scan.nextInt();

        System.out.println("Enter the washers : ");
        Washers = scan.nextInt();


        System.out.println("You have : " + ((inVoltage + 0.0)/inResistance) + "  Ohms " );
    }
}