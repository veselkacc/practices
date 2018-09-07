import java.util.Scanner;

public class ageSec{
    public static void main(String[] args) {
        double inYearslived;
        double inMonthslived;
        double inDayslived;
        double yearsinsec;
        double monthsinsec;
        double daysinsec;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the years:");
        inYearslived = scan.nextInt();
        System.out.println("Enter the months:");
        inMonthslived = scan.nextInt();
        System.out.println("Enter the days:");
        inDayslived = scan.nextInt();

        yearsinsec = (inYearslived * 365 * 86400);
        monthsinsec = (inMonthslived * 30 * 86400);
        daysinsec = (inDayslived * 86400);


        System.out.println("You have had a: " + (yearsinsec + monthsinsec + daysinsec) + "life" );



    }
}