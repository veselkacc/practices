import java.util.Scanner;

public class Ohm{
    public static void main( String[] args ) {
        int inVoltage;
        int inResistance;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the voltage :");
        inVoltage = scan.nextInt();

        System.out.println("Enter the Resistance : ");
        inResistance = scan.nextInt();


        System.out.println("You have : " + ((inVoltage + 0.0)/inResistance) + "  Ohms " );
    }
}