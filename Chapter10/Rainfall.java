public class Rainfall
{
    public static void main ( String[] args )

    {
        double rainApril = 12.0;
        System.out.println("Rainfall for April: " + rainApril);
        double rainMay = 14.0;
        System.out.println("Rainfall for May: " + rainMay);
        double rainJune = 8.0;
        System.out.println("Rainfall for June: " + rainJune);
        double average = ((rainApril + rainJune + rainMay)/ 3);
    }
}