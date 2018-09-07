import java.util.Scanner;

public class windChill{
    public static void main(String[] args) {
        double inWindSpeed;
        double inTemp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Wind Speed:");
        inWindSpeed = scan.nextDouble();

        System.out.println("Enter the Temp in f:");
        inTemp = scan.nextDouble(); 

        if (inWindSpeed <= 3 || inTemp > 50) {    
            System.out.println("Wind chill is: " + inTemp);


        }else{  
            System.out.println("Wind chill is: " + (35.74 + (0.6215 * inTemp) - (35.75 * Math.pow(inWindSpeed, 0.16))+ 0.4275*inTemp *  Math.pow(inWindSpeed, 0.16)));


        }

       



    }
}