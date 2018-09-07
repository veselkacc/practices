import java.util.Scanner;

public class dump{
    public static void main(String[] args) {
        double inPoundsTrash;
        double cost = 20;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the pounds of trash");
        inPoundsTrash = scan.nextInt();

        
        if (inPoundsTrash < 200){
            System.out.println("Not enough trash");

        
        }

        if(inPoundsTrash >= 200 || inPoundsTrash <= 299){
            System.out.println("cost is " + cost);
        


        }

        if(inPoundsTrash> 299){
            cost = cost + ((inPoundsTrash - 200) / 100);
            System.out.println("cost is " + cost);


        }




        




    }
}