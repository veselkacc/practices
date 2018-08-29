import java.util.Scanner;

public class cents{
    public static void main( String[] args ) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cents :");
        inData = scan.nextInt();


        System.out.println("You have : " + (inData / 100) + "dollars and : " + (inData % 100) + "cents");
    }
}