import java.util.Scanner;

public class fantasy{
    public static void main(String[] args) {
        double inluck;
        double inStrength;
        double inHealth;
        double total;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the points to luck 1-10:");
        inluck = scan.nextInt();
        System.out.println("Enter the points to health 1-10:");
        inHealth = scan.nextInt();
        System.out.println("Enter the points to strength 1-10:");
        inStrength = scan.nextInt();

        total = (inHealth + inluck + inStrength);

        if (total > 15){
            System.out.println("Too many points added");
            System.out.println("Strength: 5");
            System.out.println("Luck: 5");
            System.out.println("Health: 5");
        }else{

            System.out.println("Stats:");
            System.out.println("Strength: " + inStrength);
            System.out.println("Luck: " + inluck);
            System.out.println("Health: " + inHealth);


        }




    }
}