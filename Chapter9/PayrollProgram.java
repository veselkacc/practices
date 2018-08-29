public class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = 10;    
    double payRate     = 10.20, taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}