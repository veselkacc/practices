import java.util.Scanner;

public class PantryTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int userSelection;

    System.out.println("Welcome to Mother Hubbard's Pantry!" + "\n" + "Today's selection is:");

    Jam goose = new Jam("Goosebetter", "7/4/86", 12);
    Jam apple = new Jam("Crab Apple", "9/30/99", 8);
    Jam rhub = new Jam("Rhubarb", "10/31/99", 3);

    Pantry hubbard = new Pantry(goose, apple, rhub);
    System.out.println(hubbard);
    System.out.println("Please, make a selection (1, 2 or 3):");
    userSelection = scan.nextInt();
    while (userSelection != -1) {
      if(userSelection == 1 || userSelection == 2 || userSelection == 3) {
        hubbard.select(userSelection);
        System.out.println("How much to spread?");
        hubbard.spread(scan.nextInt());
        System.out.println("Done!" + "\n" + "\n" + hubbard);
      } else {
        System.out.println("That isn't a proper selection, choose 1, 2 or 3 or select -1 to quit.");
      }
      System.out.println("Make a selection (1, 2 or 3):");
      userSelection = scan.nextInt();
    }
    System.out.println("bye!");
  }
}
