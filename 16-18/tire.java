import java.util.Scanner;

public class tire{
    public static void main(String[] args) {
        double inFrontleft;
        double inFrontRight;
        double inBackleft;
        double inBackRight;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the front left pressure:");
        inFrontleft = scan.nextInt();
        System.out.println("Enter the front right pressure:");
        inFrontRight = scan.nextInt();
        System.out.println("Enter the back left pressure:");
        inBackleft = scan.nextInt();
        System.out.println("Enter the back right pressure:");
        inBackRight = scan.nextInt();

        if (inFrontleft == inFrontRight && inBackleft == inBackRight){
            System.out.println("U good bruh");
        }else{
            System.out.println("Somethin aint right");
        }



        



    }
}