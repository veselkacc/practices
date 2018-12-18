public class Jam {
  private String contents;
  private String date;
  private int capacity;

  public Jam(String contents, String date, int size) {
    this.contents = contents;
    this.date = date;
    this.capacity = size;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public boolean checkEmpty() {
    return (capacity == 0);
  }
  public String toString() {
    return contents + " " + date + " " + capacity + " fl. oz.";
  }
  public void spread (int fluidOz) {
    if (!checkEmpty()) {
      if (fluidOz <= capacity) {
        System.out.println("Spreading " + fluidOz + " fluid oz of " + contents);
        capacity -= fluidOz;
      } else {
        System.out.println("Spreading " + capacity + " fluid oz of " + contents);
        capacity = 0;
      }
    } else {
      System.out.println("No!");
    }
  }
}
