import java.util.Scanner;

public class AreaOfCircle
{
    public static void main ( String[] args )
    {
        int inData;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter the data my man : ");
        inData = scan.nextInt();

        System.out.println(Math.PI * (inData * inData));


    }
}