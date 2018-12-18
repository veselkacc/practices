public class PantryTester2 {
  public static void main(String[] args) {
    Jam goose = new Jam("Goosebetter", "7/4/86", 12);
    Jam apple = new Jam("Crab Apple", "9/30/99", 8);

    Pantry hubbard = new Pantry(goose, apple);

    if (hubbard.select(2)) {
      hubbard.spread(2);
    } else {
      System.out.println("Selection not available");
    }
    if (hubbard.select(3)) {
      hubbard.spread(5);
    } else {
      System.out.println("Selection not available");
    }
  }
}
