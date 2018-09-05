import java.util.Scanner;

public class Discounts{
    public static void main( String[] args ) {
        int Discount;
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of purchases :");
        Discount = scan.nextInt();

        System.out.println("You have : " + ((Discount * 9)/10));
    }
}